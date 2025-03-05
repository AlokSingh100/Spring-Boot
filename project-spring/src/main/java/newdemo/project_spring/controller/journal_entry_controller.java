package newdemo.project_spring.controller;

import newdemo.project_spring.entery.jornalEntry;
import newdemo.project_spring.service.jornalenteryservice;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping ("/journal")
public class journal_entry_controller {
    private Map<Long, jornalEntry> JornalEntry =new HashMap<>();

    @Autowired
    private jornalenteryservice jornalenteryservice;

    @GetMapping
    public List<jornalEntry> getll(){
       return jornalenteryservice.getAll();
    }


    @PostMapping
    public jornalEntry creatEntery(@RequestBody jornalEntry entry)
    {
        entry.setDate(LocalDateTime.now());
        jornalenteryservice.saveEntery(entry);
        return entry;
    }

    @GetMapping("id/{myId}")
    public ResponseEntity<jornalEntry> getJornalEntrybyId(@PathVariable ObjectId myId)
    {
        Optional<jornalEntry>JornalEntry=jornalenteryservice.finById(myId);
        if(JornalEntry.isPresent()){
            return new ResponseEntity<>(JornalEntry.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(JornalEntry.get(),HttpStatus.NOT_FOUND);
    }



    @DeleteMapping("id/{myId}")
    public Boolean deleateJornalEntrybyId(@PathVariable ObjectId myId)
    {
          jornalenteryservice.deleteById(myId);
          return true;
    }

    @PutMapping("id/{Id}")
    public jornalEntry UpdateJornalEntrybyId(@PathVariable ObjectId Id,@RequestBody jornalEntry newEntry)
    {
        jornalEntry old= jornalenteryservice.finById(Id).orElse(null);

        if(old !=null){
            old.setTitle( newEntry.getTitle() !=null && !newEntry.getTitle().equals("")? newEntry.getTitle():old.getTitle());
            old.setContent( newEntry.getContent() !=null && !newEntry.getContent().equals("")? newEntry.getContent():old.getContent());
        }
        jornalenteryservice.saveEntery(old);
        return old;
    }
}

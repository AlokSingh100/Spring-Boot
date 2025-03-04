package newdemo.project_spring.controller;

import newdemo.project_spring.entery.jornalEntry;
import newdemo.project_spring.service.jornalenteryservice;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public jornalEntry getJornalEntrybyId(@PathVariable Long myId)
    {
        return   null;
    }



    @DeleteMapping("id/{myId}")
    public jornalEntry deleateJornalEntrybyId(@PathVariable ObjectId myId)
    {
       return   null;
    }

    @PutMapping("/id/{id}")
    public jornalEntry UpdateJornalEntrybyId(@PathVariable ObjectId Id,@RequestBody jornalEntry mEntry)
    {
       return null;
    }
}

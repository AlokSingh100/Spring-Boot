package newdemo.project_spring.controller;

import newdemo.project_spring.entery.jornalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.*;

@RestController
@RequestMapping ("/jornal")
public class jornalEnteryController {

    private Map<Long,jornalEntry>JornalEntry =new HashMap<>();

   @GetMapping
   public List<jornalEntry> getll(){
        return new ArrayList<>(JornalEntry.values());
    }


@PostMapping
    public boolean creatEntery(@RequestBody jornalEntry entry){
    JornalEntry.put(entry.getId(),entry);
    return true;
}

@GetMapping("id/{myId}")
public jornalEntry getJornalEntrybyId(@PathVariable Long myId)
{
     return   JornalEntry.get(myId);
}



    @DeleteMapping("id/{myId}")
    public jornalEntry deleateJornalEntrybyId(@PathVariable Long myId)
    {
        return   JornalEntry.get(myId);
    }
    @PutMapping("/id/{id}")
    public jornalEntry UpdateJornalEntrybyId(@PathVariable long Id,@RequestBody jornalEntry mEntry){
        return   JornalEntry.put(Id,mEntry);
    }

}

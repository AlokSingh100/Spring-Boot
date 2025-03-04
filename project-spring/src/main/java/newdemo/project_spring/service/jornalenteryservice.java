package newdemo.project_spring.service;

import newdemo.project_spring.controller.journal_entry_controller;
import newdemo.project_spring.entery.jornalEntry;
import newdemo.project_spring.repogetroy.jornalenteryReporesertory;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class jornalenteryservice {

    @Autowired
    private jornalenteryReporesertory jornalenteryReporesertory;

    public void saveEntery(jornalEntry JornalEntry){
        jornalenteryReporesertory.save(JornalEntry);
    }
    public List<jornalEntry> getAll()
    {
        return jornalenteryReporesertory.findAll();
    }
    public Optional<jornalEntry> finById(ObjectId Id)
    {
        return jornalenteryReporesertory.findById(Id);
    }


}

package newdemo.project_spring.repogetroy;

import newdemo.project_spring.controller.journal_entry_controller;
import newdemo.project_spring.entery.jornalEntry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface jornalenteryReporesertory extends MongoRepository<jornalEntry, ObjectId> {


}

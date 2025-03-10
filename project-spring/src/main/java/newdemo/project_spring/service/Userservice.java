package newdemo.project_spring.service;

import newdemo.project_spring.entery.User;
import newdemo.project_spring.repogetroy.userReporesertory;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Userservice {

    @Autowired
    private userReporesertory UserReporesertory;

    public void saveEntery(User JornalEntry){
        UserReporesertory.save(JornalEntry);
    }
    public List<User> getAll()
    {
        return UserReporesertory.findAll();
    }
    public User finByUsername(String Username)
    {
        return UserReporesertory.findByUsername(Username);
    }
    public void deleteById(ObjectId Id)
    {
        UserReporesertory.deleteById(Id);
    }


}

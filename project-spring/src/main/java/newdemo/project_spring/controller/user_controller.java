package newdemo.project_spring.controller;

import newdemo.project_spring.entery.User;
import newdemo.project_spring.entery.jornalEntry;
import newdemo.project_spring.service.Userservice;
import newdemo.project_spring.service.jornalenteryservice;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping ("/user")
public class user_controller {

@Autowired
    private Userservice userservice;


@GetMapping
private List<User>getAllUser(){
    return userservice.getAll();
    }

    @PostMapping
    public void createUser(@RequestBody User user){
    userservice.saveEntery(user);
    }
    @PutMapping
    public  ResponseEntity<User> updateUser(@RequestBody User user){
User user1=userservice.finByUsername(user.getUsername());
if (user1 != null){
    user1.setUsername(user.getUsername());
    user1.setPassword(user.getPassword());
    userservice.saveEntery(user1);
}
return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
        }




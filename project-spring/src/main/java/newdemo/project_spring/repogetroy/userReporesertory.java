package newdemo.project_spring.repogetroy;

import newdemo.project_spring.entery.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userReporesertory extends MongoRepository<User, ObjectId> {

    User findByUsername(String Username);
}

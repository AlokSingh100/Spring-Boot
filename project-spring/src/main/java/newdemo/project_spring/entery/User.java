package newdemo.project_spring.entery;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Document(collation = "user")
@Data
public class User {

    @Id
    private ObjectId id;
    @Indexed(unique = true)
    @NonNull
    private String Username;
    @NonNull
    private String Password;

    @DBRef
    private List<jornalEntry> jornalEntries=new ArrayList<>();

}

package newdemo.project_spring.entery;


import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Document(collation = "journal")
@Data
public class jornalEntry {


    @Id
    private ObjectId id;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;



}

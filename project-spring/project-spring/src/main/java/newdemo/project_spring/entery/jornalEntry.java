package newdemo.project_spring.entery;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

import lombok.Data;
@Document public class jornalEntry {
@Setter
@Getter
    @Id
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;


}

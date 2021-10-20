package co.softlond.reactormongo.co.softlond.reactormongo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "personas")
public class Persona {
    @Id
    private String id;
    private String nombre;
    private int edad;
    private String data;
}

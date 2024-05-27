package greeen.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
@Entity
@Table(name = "categories")
 
public class Category {

    @Id
    private Long id;

    private String name;

 
}

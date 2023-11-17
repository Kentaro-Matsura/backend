package gpa.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class MsUser {
    @Id
    private Integer id;

    private String name;
}

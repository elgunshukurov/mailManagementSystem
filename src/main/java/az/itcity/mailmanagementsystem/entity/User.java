package az.itcity.mailmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column
    private String name;
    @Column
    private String surname;

    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private Mail mail;

}

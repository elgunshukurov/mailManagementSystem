package az.itcity.mailmanagementsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Mail {
    @Id
    private Long id;

    @Column
    private String mail_address;

    @JsonIgnore
    @JoinColumn(name = "user_id")
    @OneToOne
    private User user;

}

package com.example.bookmyshowbackend.Model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
@Builder // Used to help us build the objects
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name" , nullable = false)
    private String name;

    @Column(name="mobile" , nullable = false)
    private String mobileNo;

    @OneToMany (mappedBy = "user" ,cascade = CascadeType.ALL) //This is a by default thing we have to write
    // Since we have not added @JoinColumn the PK of the child table will not be attached
    private List<TicketEntity> listOfTickets;


}

package com.example.bookmyshowbackend.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tickets")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="allotted_seats", nullable = false)
    private String allottedSeats;

    @Column(name="amount", nullable = false)
    private double amount;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="booked_at", nullable = false)
    private Date bookedAt;

    //Done on child's behalf
    @ManyToOne
    @JoinColumn // We didn't write anything so by default primary key will be joined(primary key of user)
    @JsonIgnore // such that it doesn't require value of user to be inserted while calling api
    private UserEntity user; //This is a foreign key that will connect to the user table

    @ManyToOne
    @JsonIgnore
    private ShowEntity show;

    @OneToMany
    @JsonIgnore
    private List<ShowSeatsEntity> seats;




}

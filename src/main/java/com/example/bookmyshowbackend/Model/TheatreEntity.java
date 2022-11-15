package com.example.bookmyshowbackend.Model;


import com.example.bookmyshowbackend.enums.SeatType;
import com.example.bookmyshowbackend.enums.TheatreType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="theatre")
@Entity
@Builder
public class TheatreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    @Column(name="name", nullable = false)
    private String name;

//    @Enumerated(EnumType.STRING)
//    @Column(name="type", nullable = false)
//    private TheatreType type;  //Will contain only two values SINGLE,MULTIPLEX

    @Column(name = "city" , nullable = false)
    private String city;

    @Column(name= "address", nullable = false)
    private String address;

    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowEntity> shows;

    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<TheatreSeatEntity> seats;



}

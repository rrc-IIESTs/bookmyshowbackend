package com.example.bookmyshowbackend.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="movies")
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name" , nullable = false)
    private String name;

    @Column(name="release_date" , columnDefinition = "DATE",nullable = false)
    private LocalDate releaseDate;

    @OneToMany(mappedBy = "movie" , cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ShowEntity> shows;
}

package com.example.bookmyshowbackend.dto;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    int id;

    @NotNull
    String name;

    @NotNull
    String mobileNo;
}

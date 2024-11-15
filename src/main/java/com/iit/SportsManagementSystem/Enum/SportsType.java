package com.iit.SportsManagementSystem.Enum;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public enum SportsType {

    FOOTBALL(0L, "Football"),
    CRICKET(1L,"Cricket");

    private Long id;
    private String name;

    SportsType(Long id, String name){
        this.id = id;
        this.name = name;
    }

}

package com.iit.SportsManagementSystem.Enum;

import lombok.Getter;

@Getter
public enum TounamentType {

    GROUP_STAGE(0L, "Group Stage"),
    KNOCKOUT(1L,"Knock-out"),
    ROUND_ROBIN(2L,"Round Robin");

    private Long id;
    private String name;

    TounamentType(Long id, String name){
        this.id =id;
        this.name = name;
    }
}

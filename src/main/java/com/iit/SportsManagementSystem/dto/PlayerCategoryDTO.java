package com.iit.SportsManagementSystem.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PlayerCategoryDTO {

    private Long id;

    private String name;

    private Long startingBid;
}

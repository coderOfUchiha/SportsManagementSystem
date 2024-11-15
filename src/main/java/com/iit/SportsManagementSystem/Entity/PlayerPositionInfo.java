package com.iit.SportsManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class PlayerPositionInfo {
    @Id
    private Long id;
    private String name;
    private Long sportsTypeId;
}

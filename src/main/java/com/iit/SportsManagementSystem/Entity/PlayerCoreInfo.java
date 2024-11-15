package com.iit.SportsManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class PlayerCoreInfo {

    @Id
    private String studentId;
    private String name;
    private UUID tournamentId;
    private Long sportsId;
    private Long positionId;
    private Long category;
    private Long teamId;
    private Long enrollmentStatus;
}

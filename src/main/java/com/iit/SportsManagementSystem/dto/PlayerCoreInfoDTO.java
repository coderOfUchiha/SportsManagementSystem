package com.iit.SportsManagementSystem.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class PlayerCoreInfoDTO {

    private String studentId;

    private String name;

    private UUID tournamentId;

    private Long sportsId;

    private Long positionId;

    private Long category;

    private Long teamId;

    private Long enrollmentStatus;

    private String bKashNumber;

    private String email;
}

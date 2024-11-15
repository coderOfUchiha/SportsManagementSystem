package com.iit.SportsManagementSystem.dto;

import com.iit.SportsManagementSystem.Entity.Team;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class TournamentDetailsDTO {

    private UUID id;

    private String tournamentName;

    private String tournamentDescription;

    private Long tournamentTypeId;

    private Long sportsType;

    private boolean status;

    private Date startingDate;

    private Date endingDate;

    private List<TeamDTO> teams;

}

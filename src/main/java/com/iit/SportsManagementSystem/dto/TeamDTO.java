package com.iit.SportsManagementSystem.dto;

import com.iit.SportsManagementSystem.Entity.TournamentDetails;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class TeamDTO {

    private Long teamId;

    private String teamName;

    private Long teamBalance;

    private String teamOwner;

    private String mail;

    private TournamentDetails tournamentDetails;
}

package com.iit.SportsManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Team{

    @Id
    private Long teamId;
    private String teamName;
    private Long teamBalance;
    private String teamOwners;

    @ManyToOne
    @JoinColumn(name = "tournament_id")
    private TournamentDetails tournamentDetails;


}

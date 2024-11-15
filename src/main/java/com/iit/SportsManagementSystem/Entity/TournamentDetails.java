package com.iit.SportsManagementSystem.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class TournamentDetails {

    @Id
    private UUID id;
    private String tournamentName;
    private String tournamentDescription;
    private Long tournamentTypeId;
    private Long sportsType;
    private boolean status;
    private Date startingDate;
    private Date endingDate;

    @OneToMany(mappedBy = "tournamentDetails",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Team> teams;

}

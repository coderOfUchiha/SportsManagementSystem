package com.iit.SportsManagementSystem.Service;

import com.iit.SportsManagementSystem.dto.TournamentDetailsDTO;

import java.util.List;
import java.util.UUID;

public interface TournamentService {

    TournamentDetailsDTO createTournament(TournamentDetailsDTO tournamentDetailsDTO);
    List<TournamentDetailsDTO> getAllTournaments();
    TournamentDetailsDTO getTournamentById(UUID id);
    TournamentDetailsDTO updateTournament(TournamentDetailsDTO tournamentDetailsDTO);
    void deleteTournament(UUID id);
}

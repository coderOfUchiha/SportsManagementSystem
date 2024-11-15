package com.iit.SportsManagementSystem.RestController;

import com.iit.SportsManagementSystem.Service.TournamentService;
import com.iit.SportsManagementSystem.dto.TournamentDetailsDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
public class TournamentRestController {

    private final TournamentService tournamentService;

    @PostMapping("/api/v1/tournament")
    public TournamentDetailsDTO createTournament(@RequestBody TournamentDetailsDTO tournamentDetailsDTO) {
        return tournamentService.createTournament(tournamentDetailsDTO);
    }

    @GetMapping("/api/v1/tournaments")
    public List<TournamentDetailsDTO> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @GetMapping("/api/v1/tournament/{id}")
    public TournamentDetailsDTO getTournamentById(@PathVariable UUID id) {
        return tournamentService.getTournamentById(id);
    }
    @PutMapping("/api/v1/tournament")
    public TournamentDetailsDTO updateTournament(@RequestBody TournamentDetailsDTO tournamentDetailsDTO) {
        return tournamentService.updateTournament(tournamentDetailsDTO);
    }

    @PutMapping("/api/v1/tournment/{id}")
    public void deleteTournament(@PathVariable UUID id) {
        tournamentService.deleteTournament(id);
    }
}

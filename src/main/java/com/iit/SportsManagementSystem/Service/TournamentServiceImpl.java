package com.iit.SportsManagementSystem.Service;

import com.iit.SportsManagementSystem.Entity.TournamentDetails;
import com.iit.SportsManagementSystem.Mapper.TournamentDetailsDtoMapper;
import com.iit.SportsManagementSystem.Repository.TournamentDetailsRepository;
import com.iit.SportsManagementSystem.dto.TournamentDetailsDTO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TournamentServiceImpl implements TournamentService {

    private final TournamentDetailsRepository tournamentDetailsRepository;
    private final TournamentDetailsDtoMapper tournamentDetailsDtoMapper;
    @Override
    public TournamentDetailsDTO createTournament(TournamentDetailsDTO tournamentDetailsDTO) {
        return tournamentDetailsDtoMapper.toDto(tournamentDetailsRepository
                .save(tournamentDetailsDtoMapper.toEntity(tournamentDetailsDTO)));
    }

    @Override
    public List<TournamentDetailsDTO> getAllTournaments() {
        return tournamentDetailsDtoMapper.toDtos(tournamentDetailsRepository.findAll());
    }

    @Override
    public TournamentDetailsDTO getTournamentById(UUID id) {
        return tournamentDetailsDtoMapper.toDto(tournamentDetailsRepository.findById(id)
                .orElse(null));
    }

    @Override
    public TournamentDetailsDTO updateTournament(TournamentDetailsDTO tournamentDetailsDTO) {
        Optional<TournamentDetails> tournamentDetailsOptional =
                tournamentDetailsRepository.findById(tournamentDetailsDTO.getId());
        if (tournamentDetailsOptional.isPresent()) {
            TournamentDetails tournamentDetails = tournamentDetailsOptional.get();
            tournamentDetailsDtoMapper.partialUpdate(tournamentDetails, tournamentDetailsDTO);
            return tournamentDetailsDtoMapper.toDto(tournamentDetailsRepository.save(tournamentDetails));
        }
        return null;
    }

    @Override
    public void deleteTournament(UUID id) {
        tournamentDetailsRepository.deleteById(id);
    }

}

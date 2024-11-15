package com.iit.SportsManagementSystem.Mapper;


import com.iit.SportsManagementSystem.Entity.TournamentDetails;
import com.iit.SportsManagementSystem.dto.TournamentDetailsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.jdbc.core.convert.EntityRowMapper;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface TournamentDetailsDtoMapper  extends EntityMapper<TournamentDetailsDTO, TournamentDetails>  {

    TournamentDetailsDTO toDto(TournamentDetails tournamentDetails);
    TournamentDetails toEntity(TournamentDetailsDTO tournamentDetailsDTO);
    List<TournamentDetailsDTO> toDto(List<TournamentDetails> tournamentDetailsList);
    List<TournamentDetails> toEntity(List<TournamentDetailsDTO> tournamentDetailsDTOList);
}

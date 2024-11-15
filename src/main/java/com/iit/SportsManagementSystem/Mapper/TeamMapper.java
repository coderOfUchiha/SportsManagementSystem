package com.iit.SportsManagementSystem.Mapper;

import com.iit.SportsManagementSystem.Entity.Team;
import com.iit.SportsManagementSystem.dto.TeamDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface TeamMapper extends EntityMapper<TeamDTO, Team> {

    TeamDTO toDto(Team team);
    Team toEntity(TeamDTO teamDTO);
    List<TeamDTO> toDto(List<Team> teams);
    List<Team> toEntity(List<TeamDTO> teamDTOs);
}

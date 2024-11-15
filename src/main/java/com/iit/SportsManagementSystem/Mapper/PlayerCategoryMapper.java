package com.iit.SportsManagementSystem.Mapper;

import com.iit.SportsManagementSystem.Entity.PlayerCategory;
import com.iit.SportsManagementSystem.dto.PlayerCategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface PlayerCategoryMapper extends EntityMapper<PlayerCategoryDTO, PlayerCategory> {
    PlayerCategoryDTO toDto(PlayerCategory playerCategory);
    PlayerCategory toEntity(PlayerCategoryDTO playerCategoryDTO);
    List<PlayerCategoryDTO> toDto(List<PlayerCategory> playerCategoryList);
    List<PlayerCategory> toEntity(List<PlayerCategoryDTO> playerCategoryDTOList);
}

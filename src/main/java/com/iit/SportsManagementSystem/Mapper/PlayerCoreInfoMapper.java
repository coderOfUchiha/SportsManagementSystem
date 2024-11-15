package com.iit.SportsManagementSystem.Mapper;

import com.iit.SportsManagementSystem.Entity.PlayerCoreInfo;
import com.iit.SportsManagementSystem.dto.PlayerCoreInfoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface PlayerCoreInfoMapper extends EntityMapper<PlayerCoreInfoDTO, PlayerCoreInfo> {

    PlayerCoreInfoDTO toDto(PlayerCoreInfo playerCoreInfo);
    PlayerCoreInfo toEntity(PlayerCoreInfoDTO playerCoreInfoDTO);
    List<PlayerCoreInfoDTO> toDto(List<PlayerCoreInfo> playerCoreInfoList);
    List<PlayerCoreInfo> toEntity(List<PlayerCoreInfoDTO> playerCoreInfoDTOList);
}

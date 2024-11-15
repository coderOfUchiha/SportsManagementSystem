package com.iit.SportsManagementSystem.Service;


import com.iit.SportsManagementSystem.dto.PlayerCoreInfoDTO;

import java.util.List;

public interface PlayerCoreInfoService {

    PlayerCoreInfoDTO registerPlayer(PlayerCoreInfoDTO playerCoreInfoDTO);
    List<PlayerCoreInfoDTO> getAllPlayers();
    PlayerCoreInfoDTO getPlayerById(String id);
    PlayerCoreInfoDTO updatePlayer(PlayerCoreInfoDTO playerCoreInfoDTO);
    void deletePlayer(String id);
}

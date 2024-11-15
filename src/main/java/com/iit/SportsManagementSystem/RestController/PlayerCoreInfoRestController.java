package com.iit.SportsManagementSystem.RestController;

import com.iit.SportsManagementSystem.Entity.PlayerCoreInfo;
import com.iit.SportsManagementSystem.Service.PlayerCoreInfoService;
import com.iit.SportsManagementSystem.dto.PlayerCoreInfoDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerCoreInfoRestController {


    private final PlayerCoreInfoService playerCoreInfoService;

    @PostMapping("/api/v1/player-info")
    public PlayerCoreInfoDTO getPlayerCoreInfo(@RequestBody PlayerCoreInfoDTO playerCoreInfo) {
        return playerCoreInfoService.registerPlayer(playerCoreInfo);
    }

    @GetMapping("/api/v1/player-infos")
    public List<PlayerCoreInfoDTO> getPlayerCoreInfos() {
        return playerCoreInfoService.getAllPlayers();
    }

    @GetMapping("/api/v1/player-info/{id}")
    public PlayerCoreInfoDTO getPlayer(@PathVariable String id) {
        return playerCoreInfoService.getPlayerById(id);
    }

    @PutMapping("/api/v1/player-info")
    public PlayerCoreInfoDTO updatePlayerCoreInfo(@RequestBody PlayerCoreInfoDTO playerCoreInfo) {
        return playerCoreInfoService.updatePlayer(playerCoreInfo);
    }

    @DeleteMapping("api/v1/player-info/{id}")
    public void deletePlayerCoreInfo(@PathVariable String id) {
        playerCoreInfoService.deletePlayer(id);
    }

}

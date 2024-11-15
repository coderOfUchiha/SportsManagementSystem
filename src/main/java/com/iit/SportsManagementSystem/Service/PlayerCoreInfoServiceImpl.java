package com.iit.SportsManagementSystem.Service;

import com.iit.SportsManagementSystem.Entity.PlayerCoreInfo;
import com.iit.SportsManagementSystem.Mapper.PlayerCoreInfoMapper;
import com.iit.SportsManagementSystem.Repository.PlayerCoreInfoRepository;
import com.iit.SportsManagementSystem.dto.PlayerCoreInfoDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayerCoreInfoServiceImpl implements PlayerCoreInfoService {

    private PlayerCoreInfoRepository playerCoreInfoRepository;
    private PlayerCoreInfoMapper playerCoreInfoMapper;

    @Override
    public PlayerCoreInfoDTO registerPlayer(PlayerCoreInfoDTO playerCoreInfoDTO) {
        return playerCoreInfoMapper.toDto(playerCoreInfoRepository
                .save(playerCoreInfoMapper.toEntity(playerCoreInfoDTO)));
    }

    @Override
    public List<PlayerCoreInfoDTO> getAllPlayers() {
        return playerCoreInfoMapper.toDtos(playerCoreInfoRepository.findAll());
    }

    @Override
    public PlayerCoreInfoDTO getPlayerById(String id) {
        return playerCoreInfoMapper.toDto(playerCoreInfoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No Player Found")));
    }

    @Override
    public PlayerCoreInfoDTO updatePlayer(PlayerCoreInfoDTO playerCoreInfoDTO) {
        Optional<PlayerCoreInfo> optionalPlayerCoreInfoDTO =
                playerCoreInfoRepository.findById(playerCoreInfoDTO.getStudentId());
        if(optionalPlayerCoreInfoDTO.isPresent()) {
            PlayerCoreInfo playerCoreInfo = optionalPlayerCoreInfoDTO.get();
            playerCoreInfoMapper.partialUpdate(playerCoreInfo, playerCoreInfoDTO);
            return playerCoreInfoMapper.toDto(playerCoreInfoRepository.save(playerCoreInfo));
        }
        return null;
    }

    @Override
    public void deletePlayer(String id) {
        playerCoreInfoRepository.deleteById(id);
    }
}

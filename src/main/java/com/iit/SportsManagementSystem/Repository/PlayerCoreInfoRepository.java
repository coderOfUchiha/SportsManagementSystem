package com.iit.SportsManagementSystem.Repository;

import com.iit.SportsManagementSystem.Entity.PlayerCoreInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerCoreInfoRepository extends JpaRepository<PlayerCoreInfo, String> {
}

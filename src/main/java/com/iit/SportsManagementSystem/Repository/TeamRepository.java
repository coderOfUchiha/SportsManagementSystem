package com.iit.SportsManagementSystem.Repository;

import com.iit.SportsManagementSystem.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}

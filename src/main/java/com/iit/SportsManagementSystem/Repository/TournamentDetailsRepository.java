package com.iit.SportsManagementSystem.Repository;

import com.iit.SportsManagementSystem.Entity.TournamentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TournamentDetailsRepository extends JpaRepository<TournamentDetails, UUID> {

}

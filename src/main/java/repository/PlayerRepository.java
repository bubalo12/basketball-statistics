package repository;

import model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    // Ovdje trenutno ne dodajemo ništa posebno, JpaRepository već ima sve osnovne metode
}


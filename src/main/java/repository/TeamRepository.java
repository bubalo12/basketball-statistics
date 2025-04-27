package repository;

import model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    // Ovdje možemo kasnije dodati custom metode ako budu bile potrebne
}




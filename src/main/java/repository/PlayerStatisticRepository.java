package repository;

import model.PlayerStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerStatisticRepository extends JpaRepository<PlayerStatistic, Long> {
    // Ovde možeš dodavati specifične upite, ali za sada nije potrebno
}




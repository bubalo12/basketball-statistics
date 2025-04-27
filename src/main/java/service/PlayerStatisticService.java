package service;

import model.PlayerStatistic;
import repository.PlayerStatisticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerStatisticService {

	private final PlayerStatisticRepository repository;

	// Konstruktor sa @Autowired za automatsko injektovanje zavisnosti
	@Autowired
	public PlayerStatisticService(PlayerStatisticRepository repository) {
		this.repository = repository;
	}

	// Metoda za dobijanje svih statistika igrača
	public List<PlayerStatistic> getAllPlayerStatistics() {
		return repository.findAll();
	}

	// Metoda za dobijanje statistike igrača prema ID-u
	public Optional<PlayerStatistic> getPlayerStatistic(Long id) {
		return repository.findById(id);
	}

	// Metoda za dodavanje nove statistike
	public void addPlayerStatistic(PlayerStatistic playerStatistic) {
		repository.save(playerStatistic);
	}

	// Metoda za ažuriranje postojećih statistika
	public void updatePlayerStatistic(Long id, PlayerStatistic playerStatistic) {
		if (repository.existsById(id)) {
			playerStatistic.setId(id); // Postavljanje ID-a da bi se ažurirao postojeći entitet
			repository.save(playerStatistic);
		}
	}

	// Metoda za brisanje statistike igrača prema ID-u
	public void deletePlayerStatistic(Long id) {
		repository.deleteById(id);
	}
}

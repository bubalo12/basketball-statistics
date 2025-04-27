package service;

import model.Player;
import repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    // Metoda za dobijanje svih igrača
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    // Metoda za dobijanje jednog igrača po ID-u
    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    // Metoda za dodavanje novog igrača
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    // Metoda za ažuriranje postojećeg igrača
    public Player updatePlayer(Long id, Player updatedPlayer) {
        return playerRepository.findById(id)
                .map(existingPlayer -> {
                    existingPlayer.setFirstName(updatedPlayer.getFirstName());
                    existingPlayer.setLastName(updatedPlayer.getLastName());
                    existingPlayer.setPosition(updatedPlayer.getPosition());
                    existingPlayer.setJerseyNumber(updatedPlayer.getJerseyNumber());
                    existingPlayer.setTeam(updatedPlayer.getTeam());
                    return playerRepository.save(existingPlayer);
                })
                .orElseThrow(() -> new RuntimeException("Player not found with id: " + id));
    }

    // Metoda za brisanje igrača
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}




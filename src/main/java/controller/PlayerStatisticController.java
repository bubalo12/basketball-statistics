package controller;

import model.PlayerStatistic;
import service.PlayerStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/statistics")
public class PlayerStatisticController {

    private final PlayerStatisticService playerStatisticService;

    @Autowired
    public PlayerStatisticController(PlayerStatisticService playerStatisticService) {
        this.playerStatisticService = playerStatisticService;
    }

    // GET sve statistike
    @GetMapping
    public List<PlayerStatistic> getAllPlayerStatistics() {
        return playerStatisticService.getAllPlayerStatistics();
    }

    // GET statistika po ID-u
    @GetMapping("/{id}")
    public Optional<PlayerStatistic> getPlayerStatistic(@PathVariable Long id) {
        return playerStatisticService.getPlayerStatistic(id);
    }

    // POST nova statistika
    @PostMapping
    public void addPlayerStatistic(@RequestBody PlayerStatistic playerStatistic) {
        playerStatisticService.addPlayerStatistic(playerStatistic);
    }

    // PUT ažuriranje statistike
    @PutMapping("/{id}")
    public void updatePlayerStatistic(@PathVariable Long id, @RequestBody PlayerStatistic playerStatistic) {
        playerStatisticService.updatePlayerStatistic(id, playerStatistic);
    }

    // DELETE statistika po ID-u
    @DeleteMapping("/{id}")
    public void deletePlayerStatistic(@PathVariable Long id) {
        playerStatisticService.deletePlayerStatistic(id);
    }
}




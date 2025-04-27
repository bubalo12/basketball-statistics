package service;

import model.Team;
import repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    // GET svi timovi
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    // GET tim po ID-u
    public Optional<Team> getTeamById(Long id) {
        return teamRepository.findById(id);
    }

    // POST dodavanje novog tima
    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }

    // PUT ažuriranje tima
    public Team updateTeam(Long id, Team teamDetails) {
        Optional<Team> existingTeam = teamRepository.findById(id);

        if (existingTeam.isPresent()) {
            Team team = existingTeam.get();
            team.setName(teamDetails.getName()); // Ažuriranje imena tima
            return teamRepository.save(team); // Spremanje promena
        }
        return null;
    }

    // DELETE brisanje tima
    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }
}




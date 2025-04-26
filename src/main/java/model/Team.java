package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity // Ova klasa će biti pretvorena u tabelu "team" u bazi podataka
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id; // Primarni ključ - ID tima

    private String name; // Naziv tima (npr. Denver Nuggets)

    @OneToMany(mappedBy = "team")
    private List<Player> players; // Lista igrača koji pripadaju ovom timu

    // Konstruktor bez parametara - obavezan za JPA
    public Team() {}

    // Konstruktor sa parametrima
    public Team(String name) {
        this.name = name;
    }

    // Getteri i setteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}




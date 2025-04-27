package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Jedinstveni identifikator igrača

    private String firstName; // Ime igrača
    private String lastName; // Prezime igrača
    private String position; // Pozicija igrača (npr. PG, SG, SF, PF, C)
    private Integer jerseyNumber; // Broj dresa

    @ManyToOne
    private Team team; // Tim kojem igrač pripada

    // Konstruktor bez parametara - obavezan za JPA
    public Player() {}

    // Konstruktor sa parametrima
    public Player(String firstName, String lastName, String position, Integer jerseyNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    // Getteri i setteri
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(Integer jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}



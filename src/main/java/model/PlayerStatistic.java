package model;

import jakarta.persistence.*;

@Entity
@Table(name = "player_statistics") // Ovako eksplicitno kažemo ime tabele
public class PlayerStatistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT u MySQL
    private Long id;

    @Column(name = "player_name", nullable = false, length = 100)
    private String playerName;

    @Column(nullable = false)
    private int points;

    @Column(nullable = false)
    private int rebounds;

    @Column(nullable = false)
    private int assists;

    @Column(name = "created_at", updatable = false)
    private java.time.LocalDateTime createdAt;

    // Konstruktor bez parametara (potreban JPA-u)
    public PlayerStatistic() {
        this.createdAt = java.time.LocalDateTime.now();
    }

    // Konstruktor sa parametrima (za lakše kreiranje objekata)
    public PlayerStatistic(String playerName, int points, int rebounds, int assists) {
        this.playerName = playerName;
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
        this.createdAt = java.time.LocalDateTime.now();
    }

    // GETTERI i SETTERI

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getRebounds() {
        return rebounds;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public java.time.LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.time.LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}




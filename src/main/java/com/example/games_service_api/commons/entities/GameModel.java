package com.example.games_service_api.commons.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "games")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GameModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long gameId;
    private String name;

    // Builder pattern example
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public GameModel build() {
            GameModel gameModel = new GameModel();
            gameModel.name = this.name;
            return gameModel;
        }
    }

    public String getName() {
        return this.name;
    }
}

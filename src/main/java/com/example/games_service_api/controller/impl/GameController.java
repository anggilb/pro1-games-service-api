package com.example.games_service_api.controller.impl;

import com.example.games_service_api.commons.entities.GameModel;
import com.example.games_service_api.controller.GameApi;
import com.example.games_service_api.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController implements GameApi {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public ResponseEntity<GameModel> createGame(GameModel gameRequest) {
        return ResponseEntity.ok(gameService.createGame(gameRequest));
    }
}

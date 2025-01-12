package com.example.games_service_api.controller;

import com.example.games_service_api.commons.constants.ApiPathConstants;
import com.example.games_service_api.commons.entities.GameModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(ApiPathConstants.V1_ROUTE + ApiPathConstants.GAME_ROUTE)
public interface GameApi {
    @PostMapping(value = "create")
    ResponseEntity<GameModel> createGame(
            @RequestBody GameModel gameRequest
    );

    @GetMapping(value = "/{gameId}")
    ResponseEntity<GameModel> getGame(
            @PathVariable Long gameId
    );

    @PutMapping(value = "/{gameId}")
    ResponseEntity<GameModel> putGame(
            @PathVariable Long gameId,
            @RequestBody GameModel gameRequest
    );

    @DeleteMapping(value = "/{gameId}")
    void deleteGame(
            @PathVariable Long gameId
    );
}

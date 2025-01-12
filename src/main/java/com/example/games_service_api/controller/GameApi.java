package com.example.games_service_api.controller;

import com.example.games_service_api.commons.constants.ApiPathConstants;
import com.example.games_service_api.commons.entities.GameModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(ApiPathConstants.V1_ROUTE + ApiPathConstants.GAME_ROUTE)
public interface GameApi {
    @PostMapping(value = "create")
    ResponseEntity<GameModel> createGame(
            @RequestBody GameModel gameRequest
    );
}

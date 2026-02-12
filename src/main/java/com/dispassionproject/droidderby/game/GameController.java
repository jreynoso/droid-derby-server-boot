package com.dispassionproject.droidderby.game;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

    @GetMapping
    public String getGame() {
        return "OK";
    }

    @PostMapping
    public ResponseEntity<Void> createGame() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}

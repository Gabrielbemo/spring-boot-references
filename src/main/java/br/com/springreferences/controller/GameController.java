package br.com.springreferences.controller;

import br.com.springreferences.domain.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("game")
public class GameController {
    @GetMapping(path = "list")
    public List<Game> list() {
        return List.of(new Game("minecraft"), new Game("DOS2"));
    }
}

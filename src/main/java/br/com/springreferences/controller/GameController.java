package br.com.springreferences.controller;

import br.com.springreferences.domain.Game;
import br.com.springreferences.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/game")
@Log4j2
@AllArgsConstructor
public class GameController {

    private DateUtil dateUtil;

    @GetMapping(path = "/list")
    public List<Game> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Game("minecraft"), new Game("DOS2"));
    }
}

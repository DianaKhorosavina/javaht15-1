package ru.netology.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void firstPlayerShouldWin() {
        Player Misha = new Player(5, "Миша", 450);
        Player Oleg = new Player(74, "Олег", 102);

        Game game = new Game();
        game.register(Misha);
        game.register(Oleg);

        int actual = game.round("Миша", "Олег");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondPlayerShouldWin() {
        Player Misha = new Player(5, "Миша", 66);
        Player Oleg = new Player(74, "Олег", 208);

        Game game = new Game();
        game.register(Misha);
        game.register(Oleg);

        int actual = game.round("Миша", "Олег");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeDraw() {
        Player Misha = new Player(5, "Миша", 208);
        Player Oleg = new Player(74, "Олег", 208);

        Game game = new Game();
        game.register(Misha);
        game.register(Oleg);

        int actual = game.round("Миша", "Олег");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstPlayerNotRegistered() {

        Player Misha = new Player(5, "Миша", 208);
        Player Oleg = new Player(74, "Олег", 208);

        Game game = new Game();
        game.register(Misha);
        game.register(Oleg);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Илья", "Олег")
        );

    }

    @Test
    public void secondPlayerNotRegistered() {

        Player Misha = new Player(5, "Миша", 208);
        Player Oleg = new Player(74, "Олег", 208);

        Game game = new Game();
        game.register(Misha);
        game.register(Oleg);

        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Миша", "Мария")
        );

    }
}

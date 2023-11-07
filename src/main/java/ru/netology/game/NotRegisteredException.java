package ru.netology.game;
public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String player){
        super("Player with name " + player + "  not found");
    }
}

package training.interfece_lesson_2;

public class Game {


    public Player player;

    public Game(Player player) {
        this.player = player;
    }

    void start(Player player) {
        player.play();
    }



}

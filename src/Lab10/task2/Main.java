package Lab10.task2;

public class Main {
    public static void main(String[] args) {

        Playable[] playables = {
                new Guitar(),
                new Piano()
        };

        for (Playable playable : playables) {
            playable.play();
        }

    }
}

/*
 * Defining Methods For an Object
 * @author: Mark Zarak, Nov 2020
 */

public class Main {

    public static void main(String[] args) {

        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}

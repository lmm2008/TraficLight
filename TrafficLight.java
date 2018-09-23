package ex3;

public class TrafficLight {
    private String color;
    private int time;
    private int currentLight;

    private final int LIGHT_NUMBER = 3;
    private Tlight[] tlights = new Tlight[LIGHT_NUMBER];

    public void init() {
        tlights[0] = new Tlight("Green");
        tlights[1] = new Tlight("Yellow");
        tlights[2] = new Tlight("Red");
        currentLight = 0;
        while (currentLight < 4) {
            tlights[currentLight].getTime();
            tlights[currentLight].switchOn();
            currentLight++;
        }
    }

}

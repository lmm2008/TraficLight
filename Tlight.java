package ex3;
import java.util.Scanner;
public class Tlight {
    private String color;
    private int time;

    public Tlight(String color) {
        this.color=color;
    }

    public void switchOn() {
        System.out.println(color + " " + time + " минут");
        try {
            Thread.sleep(time * 60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}

    public int getTime() {
        System.out.println("Введите время сигнала: " + color + " в минутах");
        Scanner scanner = new Scanner(System.in);
        do
        {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
            }
            time = scanner.nextInt();
        } while (time <= 0);
        return time;
    }
}

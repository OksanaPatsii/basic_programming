package les18.publicAndPrivate.practice.task2;

import les17.Library.UserInput;

public class CircleDemo {
    public static void main(String[] args) {
        CircleUtil circleUtil1 = new CircleUtil();


        UserInput userInput = new UserInput();
        double userRadius = userInput.getUserDouble("Geben Sie den Radius des Kreises ein: ");

        double areaUserCircle = circleUtil1.circleArea(userRadius);
        double lengthUserCircle = circleUtil1.circleLength(userRadius);


        areaUserCircle = (double) Math.round(areaUserCircle * 100) / 100;

        System.out.println("Fläche eines Kreises mit Radius: " + userRadius + " wird gleich sein: " + areaUserCircle);
        System.out.println("Die Länge eines Kreises mit Radius: " + userRadius + " wird gleich sein: " + lengthUserCircle);
    }
}

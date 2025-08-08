package les20.loopStatment.loopFor;

public class ForExample1 {
    public static void main(String[] args) {
        
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Die Summe aller Zahlen von 0 bis 10 ist " + sum);

//------------------------------

        int sum1 = 0;
        int counter = 0;

        while (counter <=10) {
            sum1 = sum1 + counter;
            counter++;
        }
        System.out.println("Die Summe aller Zahlen von 0 bis 10 ist " + sum1);

    }
}

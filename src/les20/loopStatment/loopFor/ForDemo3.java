package les20.loopStatment.loopFor;

public class ForDemo3 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 20; i < 30; i++) {
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Die Summe aller geraden Zahlen von 20 bis 30 ist " + sum);


        //---------------

        int sum1 = 0;


        for (int i = 20; i <= 30; i = i + 2) {
            sum1 = sum1 + i;
        }
        System.out.println("Die Summe aller geraden Zahlen von 20 bis 30 ist " + sum1);

    }
}

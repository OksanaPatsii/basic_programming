package les27.task6;

public class Main {
    public static void main(String[] args) {

        int[][] numbers = {{7, 2, 6, 1},
                {9, 3},
                {4, 8, 5}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

        for (int[] row : numbers) {
            for (int cel : row) {
                System.out.print(cel + " ");
            }
            System.out.println();
        }
    }
}

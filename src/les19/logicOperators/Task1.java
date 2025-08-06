package les19.logicOperators;

public class Task1 {
    public static void main(String[] args) {

        boolean logic1 = true;
        boolean logic2 = false;

        /*

        1) Больше '>'
        2) Меньше '<'
        3) Равно(эквивалентно) '=='
        4) Больше или равно '>='
        5) Меньше или равно '<='
        6) НЕ равно '!='

         */


        int x = 7;

        boolean compareResult = (x > 10);
        System.out.println(compareResult);

        compareResult = (x < 100);
        System.out.println(compareResult);



    /*
        ЛОГИЧЕСКИЕ ОПЕРАТОРЫ (применяются ТОЛЬКО к логическим переменным или логическим выражениям)

        1) логический оператор 'И' - &&
        2) логический оператор 'ИЛИ' - ||
        3) логический оператор 'НЕ' - !

         */

        boolean resultConditionalAND = logic1 && logic2;
        System.out.println(resultConditionalAND);

        boolean resultConditionalOR = logic1 || logic2;
        System.out.println(resultConditionalOR);

        System.out.println((x > 5) && (x < 15));  // true && true = true

        System.out.println((x < 0) || (x >=10));  // false || true = true

        System.out.println(!(x < 0));  // !false = true





    }
}

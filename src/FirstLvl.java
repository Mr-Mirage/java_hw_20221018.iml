import java.util.Scanner;

public class FirstLvl {
    public static void main(String[] args) {
        //Дано целое число, не меньшее 2. Выведите его наименьший делитель, отличный от 1.
        //(число, на которое введенное число делится без остатка).

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result;

        if (number > 1) { //провека что заданное число не меньше 2
            for (int i = 2; i < Integer.MAX_VALUE; i++) {

                result = number % i;
                if (result == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            System.out.println("ERROR");
        }

    }

}
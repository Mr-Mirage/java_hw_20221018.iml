import java.util.Scanner;

public class FirstLvl {
    public static void main(String[] args) {
        //ƒано целое число, не меньшее 2. ¬ыведите его наименьший делитель, отличный от 1.
        //(число, на которое введенное число делитс€ без остатка).

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int result;

        if (number > 1) {
            for (int i = 2; i < Integer.MAX_VALUE; i++) {

                result = number % i;
                if (result == 0) {
                    System.out.println("Smallest divisor: " + i);
                    break;
                }
            }
        } else {
            System.out.println("ERROR");
        }

    }

}
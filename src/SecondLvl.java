import java.util.Scanner;

public class SecondLvl {
    public static void main(String[] args) {
        //Вклад в банке составляет x рублей. Ежегодно он увеличивается на p процентов,
        //после чего дробная часть копеек отбрасывается. Каждый год сумма вклада становится больше.
        //Определите, сколько будет на счету через k лет

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bank deposit is: ");
        double deposit = scanner.nextInt();

        System.out.print("How many years passed: ");
        double years = scanner.nextInt();

        for (int i = 1; i <= years; i++) {

            double result = deposit * Math.PI / 100; // увеличение на P%
            deposit = deposit + result;
            deposit = Math.floor(deposit); // округление вниз
        }
        System.out.print(deposit);


    }
}

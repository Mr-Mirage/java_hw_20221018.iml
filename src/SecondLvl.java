import java.util.Scanner;

public class SecondLvl {
    public static void main(String[] args) {
        //����� � ����� ���������� x ������. �������� �� ������������� �� p ���������,
        //����� ���� ������� ����� ������ �������������. ������ ��� ����� ������ ���������� ������.
        //����������, ������� ����� �� ����� ����� k ���

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bank deposit is: ");
        double deposit = scanner.nextInt();

        System.out.print("How many years passed: ");
        double years = scanner.nextInt();

        for (int i = 1; i <= years; i++) {

            double result = deposit * Math.PI / 100; // ���������� �� P%
            deposit = deposit + result;
            deposit = Math.floor(deposit); // ���������� ����
        }
        System.out.print(deposit);


    }
}

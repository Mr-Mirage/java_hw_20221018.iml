import java.util.Scanner;

public class FirstLvl {
    public static void main(String[] args) {
        //���� ����� �����, �� ������� 2. �������� ��� ���������� ��������, �������� �� 1.
        //(�����, �� ������� ��������� ����� ������� ��� �������).

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result;

        if (number > 1) { //������� ��� �������� ����� �� ������ 2
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
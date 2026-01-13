import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello,Calculator!");
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하시오: ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자를 입력하시오: ");
        int b = sc.nextInt();
        System.out.print("사칙연산 기호를 입력하시오: ");
        char c = sc.next().charAt(0);

        int result;

        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                return;
        }
        System.out.println("결과: " + result);
    






    }
}
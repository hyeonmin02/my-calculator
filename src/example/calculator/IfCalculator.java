package example.calculator;

import java.util.Scanner;

public class IfCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번쨰 숫자: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자: ");
        int num2 = scanner.nextInt();
        System.out.print("사칙연산 기호: ");
        char sy = scanner.next().charAt(0);

        int result = 0;
        if (sy == '+') {
            result = num1 + num2;

        } else if (sy == '-') {
            result = num1 - num2;

        } else if (sy == '*') {
            result = num1 * num2;

        } else if (sy == '/') {
            if (num2 == 0) {
                System.out.println("나머지 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                return;
            }
            result = num1 / num2;
        } else if (sy == '%') {
            if (num2 == 0) {
                System.out.println("나머지 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                return;
            }
            result = num1 % num2;

        } else if (sy == '*') {
            result = num1 * num2;

        } else {
            System.out.println("잘못된 입력값");
            return;

        }
        System.out.println("결과: " + result);
    }
}

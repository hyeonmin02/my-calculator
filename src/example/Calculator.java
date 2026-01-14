package example;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello,Calculator!");
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int a = 0;
        int b = 0;
        while (run) {
            while (run) {
                try {
                    System.out.print("첫번째 숫자를 입력하시오: ");
                    a = sc.nextInt();
                    if (a < 0) {
                        System.out.println("정수를 입력해주세요");

                        continue;
                    }
//                  break;
                } catch (InputMismatchException e) {
                    System.out.println("정수만 입력해주세요!");
                    sc.nextLine();
                }

                while (run) {
                    try {
                        System.out.print("두번째 숫자를 입력하시오: ");
                        b = sc.nextInt();
                        if (b < 0) {
                            System.out.print("정수를 입력해주세요");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e2) {
                        System.out.print("정수를 입력해주세요");
                        sc.nextLine();
                    }
                }
                System.out.print("사칙연산 기호를 입력하시오: ");
                char c = sc.next().charAt(0);

                int result = 0;

                switch (c) {

                    case '+': // 더하기
                        result = a + b;
                        break;

                    case '-': // 빼기
                        result = a - b;
                        break;

                    case '*': // 곱하기
                        result = a * b;
                        break;

                    case '/': // 나누기
                        if (b == 0) {
                            System.out.println("나머지 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                            continue;
                        }
                        result = a / b;
                        break;

                    default: //잘못된 입력값
                        System.out.println("잘못된 입력입니다.");
                        continue;
                }
                System.out.println("결과: " + result);

                while (run) {
                    System.out.print("더 계산하시겠습니까? ( yes / exit ): ");
                    String cmd = sc.next();

                    if (cmd.equals("yes")) {
                        break;
                    } else if (cmd.equals("exit")) {
                        System.out.println("계산기가 꺼집니다.");
                        return;
                    } else {
                        System.out.println("오류: yes 또는 exit만 입력할 수 있습니다.");
                    }
                }
            }
        }
    }
}

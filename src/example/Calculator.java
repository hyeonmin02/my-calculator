package example;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello,Calculator!");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫번째 숫자를 입력하시오: ");
                int a = sc.nextInt();

                System.out.print("두번째 숫자를 입력하시오: ");
                int b = sc.nextInt();

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

                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
                String cmd = sc.next();
                if (cmd.equals("exit")) {
                    System.out.println("계산기가 꺼집니다.");
                    break;
                }
            }
        }
    }
    // 양수 제외한 문자와 음수 입력시 돌려보내기 , exit 외에 다른 문자를 입력했을 시

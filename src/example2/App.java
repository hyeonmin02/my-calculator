package example2;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator(); // Calculator 객체 생성
        boolean run = true;

        while (run) {
            System.out.print("첫번째 숫자를 입력하십시오: ");
            int a = sc.nextInt();

            System.out.print("두번째 숫자를 입력하십시오: ");
            int b = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하십시오.(+,-,*,/): ");
            char c = sc.next().charAt(0);

            try {
                int result = cal.calculate(a,b,c); // 계산 + 저장 + 반환
                System.out.println("결과: " + result); // 계산 요청
                System.out.println("누적 결과들: " + cal.getResults());
            } catch (RuntimeException e) { //
                System.out.println(e.getMessage());
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            if (sc.next().equalsIgnoreCase("exit"))
                break;
        }
    }
}

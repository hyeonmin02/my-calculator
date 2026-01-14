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
                int result = cal.calculate(a, b, c); // 계산 + 저장 + 반환
                System.out.println("결과: " + result); // 계산 요청
                System.out.println("누적 결과들: " + cal.getResults());
            } catch (DivideException e) { //
                System.out.println(e.getMessage());
            }
            System.out.println("다음 동작 선택 → [yes:계속 / remove:첫 결과 삭제 / exit:종료] : ");
            String cmd = sc.next();
            if (cmd.equalsIgnoreCase("yes")) {
                System.out.println("다시 계산을 계속합니다.");
                continue;
            }
            if (cmd.equalsIgnoreCase("remove")) {
                cal.removeResults();
                System.out.println("현재 결과 목록: " + cal.getResults());
                continue;
            }
            if (cmd.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
            System.out.println("잘못된 입력입니다. yes, remove, exit 중 하나를 입력해주세요");
        }
    }
}

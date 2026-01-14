package example2;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Integer> results = new ArrayList<>(); // 계산 결과를 자동으로 쌓아두는 상자 생성

    public List<Integer> getResults() {
        return results; // 결과 조회 버튼
    }

    public void removeResults() { // 먼저 저장된 결과 삭제 버튼
        if (results.isEmpty()) {
            System.out.println("삭제할 결과가 없습니다.");
            return;
        }
        results.remove(0);
        System.out.println("가장 먼저 저장된 결과를 삭제하였습니다.");
    }

    public int calculate(int a, int b, char c) {
        int result;

        switch (c) {
            default: //잘못된 입력값
                throw new DivideException( c +"는 지원하지 않는 연산자입니다.");

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
                    throw new DivideException("나머지 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = a / b;
                break;

        }
        results.add(result); // 결과 저장
        return result; // 결과 반환
    }


    }




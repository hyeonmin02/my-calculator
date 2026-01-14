package example2;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Integer> results = new ArrayList<>();

    public int calculate(int a, int b, char c) {
        int result;

        switch (c) {
            default: //잘못된 입력값
                throw new DivideException("지원하지 않는 연산자입니다." + c);

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

    public List<Integer> getResults() {
        return results;
    }
} // s


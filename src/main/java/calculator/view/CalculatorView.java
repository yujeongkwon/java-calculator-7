package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class CalculatorView {

    public static String printStartView() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        return Console.readLine();
    }

    public static void printEndView(final String sum) {
        System.out.print("결과 : " + sum);
    }
}

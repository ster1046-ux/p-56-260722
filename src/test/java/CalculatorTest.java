import com.back.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    // int rs = Calc.run("((3 + 5) * 5 + -10) * 10 / 5");


    @Test
    @DisplayName("단일 숫자 문자열 처리 테스트")
    public void t1() {
        Calculator calculator = new Calculator();
        assertThat(calculator.run("3")).isEqualTo(3);
        assertThat(calculator.run("5")).isEqualTo(5);

    }

    @Test
    @DisplayName("연산자가 하나 들어있는 문자열 처리 테스트")
    public void t2() {
        Calculator calculator = new Calculator();
        assertThat(calculator.run("3 + 5")).isEqualTo(8);
        assertThat(calculator.run("8 * 5")).isEqualTo(40);

    }
    @Test
    @DisplayName("곱셈 우선순위 반영 테스트1")
    public void t3() {
        Calculator calculator = new Calculator();
        assertThat(calculator.run("3 + 5 * 5")).isEqualTo(28);

    }
    @Test
    @DisplayName("곱셈 우선순위 반영 테스트2")
    public void t4() {
        Calculator calculator = new Calculator();
        assertThat(calculator.run("3 * 5 + 5")).isEqualTo(20);

    }

}
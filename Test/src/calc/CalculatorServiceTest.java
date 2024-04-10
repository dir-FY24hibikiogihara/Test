package calc;

import static org.junit.jupiter.api.Assertions.*;

import java.security.Provider.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    
    private Calculator calculator;
    private CalculatorService service;
    }

    @BeforeEach
    public void setUp() {
       //テスト前にCalculatorとCalculatorServiceをセットアップ
        calculator = new Calculator();
        service = new CalculatorService(calculator);
        

    @Test
    public void testAddAndReport() {
        //calculatorのaddメソッドとcalculatorServiceのaddReportメソッドが正しく連携するかどうか
        assertEquals("Result: 5", service.addAndReport(2,3));
    }

    @Test
    public void testSubtractAndReport() {
        //CalculatorのsubtractメソッドのCalculatorServiceのsubtractAndReportが正しく連携するかどうか
        assertEquals("Result: 1", service.subtractAndReport(3, 2));
    }

}

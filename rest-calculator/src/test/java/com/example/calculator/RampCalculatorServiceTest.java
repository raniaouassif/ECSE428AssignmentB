package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.calculator.ramp.*;

public class RampCalculatorServiceTest {
    private RampCalculatorService _rampCalculatorService = new RampCalculatorService();

    @Test
    void IEC1(){
        // test invalid due to small length
        double result = _rampCalculatorService.calculateRampRate(139, 180, 250, false);
        assertEquals(-1, result);
    }

    @Test
    void IEC2(){
        // test invalid due to big length
        double result = _rampCalculatorService.calculateRampRate(381, 180, 250, false);
        assertEquals(-1, result);
    }

    @Test
    void IEC3(){
        // test invalid due to small width
        double result = _rampCalculatorService.calculateRampRate(260, 89, 250, false);
        assertEquals(-1, result);
    }

    @Test
    void IEC4(){
        // test invalid due to big width
        double result = _rampCalculatorService.calculateRampRate(260, 271, 250, false);
        assertEquals(-1, result);
    }

    @Test
    void IEC5(){
        // test invalid due to small weight
        double result = _rampCalculatorService.calculateRampRate(260, 180, 2, false);
        assertEquals(-1, result);
    }

    @Test
    void IEC6(){
        // test invalid due to big weight
        double result = _rampCalculatorService.calculateRampRate(260, 180, 501, false);
        assertEquals(-1, result);
    }

    @Test
    void STDEC1(){
        // test valid normal case
        double result = _rampCalculatorService.calculateRampRate(192.5, 123, 26.5, false);
        assertEquals(12.985, result);
    }

    @Test
    void STDEC2(){
        // test valid min length
        double result = _rampCalculatorService.calculateRampRate(140, 123, 26.5, false);
        assertEquals(12.985, result);
    }

    @Test
    void STDEC3(){
        // test invalid min+ length
        double result = _rampCalculatorService.calculateRampRate(141, 123, 26.5, false);
        assertEquals(12.985, result);
    }

    @Test
    void STDEC4(){
        // test valid max- length
        double result = _rampCalculatorService.calculateRampRate(244, 123, 26.5, false);
        assertEquals(12.985, result);
    }

    @Test
    void STDEC5(){
        // test valid max length
        double result = _rampCalculatorService.calculateRampRate(245, 123, 26.5, false);
        assertEquals(12.985, result);
    }

    @Test
    void STDEC6(){
        // test valid min width
        double result = _rampCalculatorService.calculateRampRate(192.5, 90, 26.5, false);
        assertEquals(12.985, result);
    }

    @Test
    void STDEC7(){
        // test valid due to min+ width
        double result = _rampCalculatorService.calculateRampRate(192.5, 91, 26.5, false);
        assertEquals(12.985, result);
    }

    @Test
    void STDEC8(){
        // test valid due to max- width
        double result = _rampCalculatorService.calculateRampRate(192.5, 155, 26.5, false);
        assertEquals(12.985, result);
    }

    @Test
    void STDEC9(){
        // test valid due to max width
        double result = _rampCalculatorService.calculateRampRate(192.5, 156, 26.5, false);
        assertEquals(12.985, result);
    }

    @Test
    void STDEC10(){
        // test valid min weight
        double result = _rampCalculatorService.calculateRampRate(192.5, 123, 3, false);
        assertEquals(1.47, result);
    }

    @Test
    void STDEC11(){
        // test valid min+ weight
        double result = _rampCalculatorService.calculateRampRate(192.5, 123, 4, false);
        assertEquals(1.96, result);
    }

    @Test
    void STDEC12(){
        // test valid max weight
        double result = _rampCalculatorService.calculateRampRate(192.5, 123, 49, false);
        assertEquals(29.9, result);
    }

    @Test
    void STDEC13(){
        // test valid max+ weight
        double result = _rampCalculatorService.calculateRampRate(192.5, 123, 50, false);
        assertEquals(30.7, result);
    }

    @Test
    void NSTDEC1(){
        // test valid extra length
        double result = _rampCalculatorService.calculateRampRate(312.5, 123, 26.5, false);
        assertEquals(25.97, result);
    }

    @Test
    void NSTDEC2(){
        // test valid extra width
        double result = _rampCalculatorService.calculateRampRate(192.5, 213, 26.5, false);
        assertEquals(25.97, result);
    }

    @Test
    void NSTDEC3(){
        // test valid extra weight
        double result = _rampCalculatorService.calculateRampRate(192.5, 123, 275, false);
        assertEquals(518, result);
    }

    @Test
    void UNITEC1(){
        // test valid unit convert 1 inch
        double result = _rampCalculatorService.converter(1);
        assertEquals(25.4, result);
    }

    @Test
    void UNITEC2(){
        // test valid unit convert 0 inch
        double result = _rampCalculatorService.converter(0);
        assertEquals(0, result);
    }

}

package com.example.calculator.ramp;

import org.springframework.stereotype.Service;

@Service
public class RampCalculatorService {
    
    public double calculateRampRate(double length, double width, double weight, boolean isInch){
        if(isInch){
            length = this.converter(length);
            width = this.converter(width);
        }

        if(length < 140 || length > 380 || width < 90 || width > 270 || weight < 3 || weight > 500) {
            return -1;
        }

        double rate = 0;

        if(length > 245 || width > 156 || weight > 50){
            rate = weight > 100 ? 98 + 2.4 *(weight -100): 0.98 * weight;
        }else{
            rate = weight > 30 ? 14.7 + 0.8 *(weight - 30): 0.49 * weight;
        }

        return rate;
    }

    public double converter(double inch){
        return inch * 25.4;
    }
}

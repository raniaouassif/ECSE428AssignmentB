package com.example.calculator.ramp;

import org.springframework.stereotype.Service;

@Service
public class RampCalculatorService {
    
    public double calculateRampRate(double length, double width, double weight, boolean isInch, boolean isOunce){
        if(isInch){
            length = this.converterInch(length);
            width = this.converterInch(width);
        }
        
        if(isOunce) {
          weight = this.converterOunce(weight);
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

    public double converterInch(double inch){ // Converting inches to mm 
        return inch * 25.4;
    }
    
    public double converterOunce(double ounce) { //Converting Ounce to grams
      return ounce * 28.3;
    }
}

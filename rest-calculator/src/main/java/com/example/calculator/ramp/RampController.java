package com.example.calculator.ramp;
import static com.example.calculator.model.ResultBuilder.getResult;
import static com.example.calculator.model.ResultBuilder.getResultFromError;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.model.ApiResult;

@RestController
@RequestMapping("/ramp")
public class RampController {
    
    private final RampCalculatorService _rampCalculator;

    public RampController( RampCalculatorService rampCalculator) {
        _rampCalculator = rampCalculator;
    }

    @GetMapping("/calculateRate/{length}/{width}/{weight}/{isInch}")
    public ApiResult rampRate(@PathVariable double length,@PathVariable double width,
    @PathVariable double weight,@PathVariable boolean isInch, @PathVariable boolean isOunce){
        try {
            double rate = _rampCalculator.calculateRampRate(length, width, weight, isInch, isOunce);
            return getResult(rate);
        }catch(Exception e){
            return getResultFromError(e.getMessage());
        }
    }
}

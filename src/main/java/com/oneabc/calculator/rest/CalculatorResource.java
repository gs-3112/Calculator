package com.oneabc.calculator.rest;

import com.oneabc.calculator.model.RequestToChildPlan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("oneappabc/adityabirla/api/v1/calculator")
public class CalculatorResource {

    @GetMapping("/childplan")
    public ResponseToChildPlan childPlanCalculator(@RequestBody RequestToChildPlan request){
       return  null;
    }

    @GetMapping("/termplan")
    public ResponseToChildPlan childTermCalculator(@RequestBody ResponseToChildPlan request){
        return  null;
    }
}

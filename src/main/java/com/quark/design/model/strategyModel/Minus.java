package com.quark.design.model.strategyModel;

/**
 * Created by 311198 on 2017/2/9.
 */
public class Minus extends AbstractCalculator implements ICalculator {
    public int calculate(String exp) {
        int[] arr = split(exp, "\\-");
        return arr[0]-arr[1];
    }
}

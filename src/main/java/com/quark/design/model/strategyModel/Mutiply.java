package com.quark.design.model.strategyModel;

/**
 * Created by 311198 on 2017/2/9.
 */
public class Mutiply extends AbstractCalculator implements ICalculator {
    public int calculate(String exp) {
        int[] arra = split(exp, "\\*");
        return arra[0]*arra[1];
    }
}

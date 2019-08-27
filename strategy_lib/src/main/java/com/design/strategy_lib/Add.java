package com.design.strategy_lib;

/**
 * User: maodayu
 * Date: 2019/8/27
 * Time: 19:42
 */
public class Add extends Strategy {

    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}

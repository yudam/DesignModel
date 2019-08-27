package com.design.strategy_lib;

/**
 * User: maodayu
 * Date: 2019/8/27
 * Time: 19:45
 */
public class ContextStrategy {

    private Strategy mStrategy;

    public ContextStrategy(Strategy strategy){
        this.mStrategy=strategy;
    }

    public int operate(int a,int b){
        return  mStrategy.calculate(a,b);
    }
}

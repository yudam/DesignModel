package com.design.strategy_lib;

public class MyClass {

    public static void main(String[] args){

        /**
         *策略模式专注于行为，对算法的封装，
         *创建一个对象去执行指定的行为
         */

        ContextStrategy contextStrategy=new ContextStrategy(new Add());

        System.out.println(contextStrategy.operate(2,3));
        ContextStrategy contextStrategy1=new ContextStrategy(new Subtract());

        System.out.println(contextStrategy1.operate(2,3));
    }
}

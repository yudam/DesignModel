package com.design.factory_lib;

public class MyClass {

    public static void main(String[] args){

        /**
         *简单工厂模式专注于对象的创建，给出一个条件，获得相应的对象
         *
         *面向对象编程，客户端只需要给出想要的对象其他交由Factory处理
         */
        AnimalFactory.createOperate(1).draw();
    }
}

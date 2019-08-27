package com.design.factory_lib;

/**
 * User: maodayu
 * Date: 2019/8/27
 * Time: 19:29
 */
public class AnimalFactory {

    public static Animal createOperate(int type) {
        Animal animal;
        switch (type) {
            case 1:
                animal = new Cat();
                break;
            case 2:
            default:
                animal = new Dog();
                break;
        }
        return animal;
    }

}

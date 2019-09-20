package text.mdy.com.decorate_lib;

public class MyClass {

    public  static void main(String[] args){

        Componet componet=new ComponentWrapper();

        componet=new One(componet);

        componet=new Two(componet);


        componet.operation();


    }


    /**
     * 装饰着模式：开放-封闭原则：对修改封闭，对扩展开放
     *
     * 动态的给对象添加一些额外的职责，保证装饰类之间彼此独立
     *
     *
     * 例子：每一种饮料都有定价，价格由原料价格决定。现在由很多种饮料，若是每次原料价格变动
     * 则单独更改每一种饮料价格是极为繁琐的，所以每种饮料的价格可以通过添加不同原料的对象方式
     * 来累计价格，这就是装饰模式。
     */

}

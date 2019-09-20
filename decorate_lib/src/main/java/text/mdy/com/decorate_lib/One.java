package text.mdy.com.decorate_lib;

public class One extends Decoratoin {

    public One(Componet componet) {
        super(componet);
    }

    @Override
    public void operation() {
        System.out.println("One");
        super.operation();
    }
}

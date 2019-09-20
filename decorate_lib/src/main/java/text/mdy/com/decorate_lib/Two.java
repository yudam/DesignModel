package text.mdy.com.decorate_lib;

public class Two extends Decoratoin {

    public Two(Componet componet) {
        super(componet);
    }

    @Override
    public void operation() {
        System.out.println("Two");
        super.operation();
    }
}

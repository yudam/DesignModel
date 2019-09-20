package text.mdy.com.decorate_lib;

public  class Decoratoin implements Componet{

    private Componet componet;

    public Decoratoin(Componet componet){
        this.componet=componet;
    }


    @Override
    public void operation() {
        System.out.println("Decoratoin");
        if(componet!=null){
            componet.operation();
        }
    }
}

package az.company.task.AbstractPractic;

public class Duzbucaqli extends Triangle{
    public Duzbucaqli(double a,double b,double c){
        super(a,b,c);
    }

    @Override
    protected double SaheninTapilmasi() {
        return a*a/2;
    }
}

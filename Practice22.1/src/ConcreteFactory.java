public class ConcreteFactory implements ComplexAbstractFactory {
    public Complex createComplex(){
        return new Complex(0,0);
    };
    public Complex createComplex(int img, int real){
        return new Complex(img, real);
    }

}

public class Complex {
    private int img;
    private int real;

    public Complex(int img,int real){
        this.img = img;
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public int getReal() {
        return real;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return "Real " + real + " Image " + img;
    }
}

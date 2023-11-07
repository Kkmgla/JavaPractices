public class Square extends Rectangle {
    private double side;
    public Square(){};
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }
    @Override
    public void setLength(double side) {
        this.side = side;
    }//
    @Override
    public void setWidth(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return Math.pow(side,2);
    }
    @Override
    public double getPerimeter() {
        return side * 4;
    }
    @Override
    public String toString() {
        if(filled) {
            return "Side of this square is " + this.side +
                    "\nColor of this square is " + this.color +
                    "\n This square is filled" +
                    "\n Area of this square is " + getArea() +
                    "\n Perimetr of this square is " + getPerimeter();
        }
        else{
            return "Side of this square is " + this.side +
                    "\nColor of this square is " + this.color +
                    "\n This square is not filled"+
                    "\n Area of this square is " + getArea() +
                    "\n Perimetr of this square is " + getPerimeter();
        }
    }
}

public class Square extends Shape{
    private double width;

    public Square(){
    }

    public Square(double width) {
        this.width = width;
    }

    public Square(double width, String color, Boolean filled) {
        this.width = width;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){
        return width + width;
    }    

    public double perimeter(){
        return width * 4;
    }

    public String toString(){
        if(this instanceof Cube){
            return super.toString() +
            "[Width: " + width + "]";
        }
        else{
            return ("Square with properties: " +
            super.toString() +
            "[Width: " + width + "]" +
            "[Area: " + area() + "]" +
            "[Perimeter: " + perimeter() + "]");
        }
    }

}

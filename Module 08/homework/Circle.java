public class Circle extends Shape{
    private double radius;

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, Boolean filled) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double area(){
        return Math.PI * radius * radius;
    }

    public double circumference(){
        return Math.PI * 2 * radius;
    }

    public String toString(){
        if(this instanceof Cylinder){
            return (super.toString() +
            "[Radius: " + radius + "]");
        }
        else{
            return ("Circle with properties: " +
            super.toString() +
            "[Radius: " + radius + "]" +
            "[Area: " + area() + "]" +
            "[Circumference: " + circumference() + "]");
        }

    }

}
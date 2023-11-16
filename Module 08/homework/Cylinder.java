public class Cylinder extends Circle{
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color, Boolean filled){
        super(radius, color, filled);
        this.height = height;
    }

    public double area(){
        return 2. * Math.PI * this.getRadius() * height;
    }
    
    public double volume(){
        return Math.PI * this.getRadius() * this.getRadius() * height;
    }

    public String toString(){
        return ("Cylinder with properties: " + 
            super.toString() + 
            "[Height: " + height + "]" + 
            "[Area: " + area() + "]" +
            "[Volume: " + volume() + "]");
    }
}

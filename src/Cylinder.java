public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

    }
    public Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHight(double hight) {
        this.height = hight;
    }

    public double getAdd(){
        double a =  Math.PI * Math.pow(getRadius(),2)* height;
        return a;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'+ ", Subclass of " + super.toString();
    }
}

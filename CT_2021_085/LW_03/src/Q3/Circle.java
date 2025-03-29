package Q3;

class Circle {
    private double radius;

    public Circle(){
        radius=0.0;
    }
    public Circle(double radius){
        this.radius= radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea(){
        return(2*Math.PI*Math.pow(radius,2));
    }

    public double computeCircumference(){
        return(2*Math.PI*radius);
    }

}

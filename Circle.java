// circle class 
public class Circle {
    
    //attributes 
    private double radius;
    private double originX;
    private double originY;
// constructor 1
public Circle(double radius, double originX, double originY){
    this.radius= radius;
    this.originX= originX;
    this.originY= originY;
}

public Circle(double radius){
    this(radius, 0, 0);
}
public Circle(){
    this(1,0,0);
}
//getter methods 
public double getRadius(){
    return radius;
}
public double getOriginX(){
    return originX;
}
public double getOriginY(){
    return originY;
}
// setter methods 
public void setRadius(double radius){
    this.radius= radius;
}
public void setOriginX(double originX){
    this.originX= originX;
}
public void setOriginY(double originY){
    this.originY= originY;
}

//methods 
public double getArea(){
    return Math.PI * radius * radius;
}

public double getCircumference(){
    return Math.PI * 2 * radius;
}
public void move(double dx, double dy) {
    this.originX += dx;
    this.originY += dy;
}
@Override
public String toString() {
    return "Circle(radius=" + radius + 
           ", origin=(" + originX + ", " + originY + "))";
}
public void scale(double factor) {
    if (factor > 0) {
        this.radius *= factor;
    }
}
public boolean isOverlappedWith(Circle other) {
    double dx = this.originX - other.originX;
    double dy = this.originY - other.originY;
    double distance = Math.sqrt(dx*dx + dy*dy);

    return distance < (this.radius + other.radius);
}
public boolean isEnclosedBy(Circle other) {
    double dx = this.originX - other.originX;
    double dy = this.originY - other.originY;
    double distance = Math.sqrt(dx*dx + dy*dy);

    return distance + this.radius <= other.radius;
}

}
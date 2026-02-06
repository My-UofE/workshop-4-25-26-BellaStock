// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  private double width;
  private double height;
  private double originX = 0.0;
  private double originY = 0.0;

  //public getter methods to get and set attributes 
  public double getWidth(){
    return width;
  }

  public double getHeight(){
    return height;
  }

  public double getOriginX(){
    return originX;
  }

  public double getOriginY(){
    return originY;
  }
  public void setWidth(double width) {
    if (width > 0) {
      this.width = width;
    }
  }

  public void setHeight(double height) {
    if (height >0 ){
      this.height = height;
    }
  }

  public void setOriginX(double originX) {
      this.originX = originX;
  }

  public void setOriginY(double originY) {
      this.originY = originY;
  }


  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }
  // overloading contructor, 2 parameters 
  public Rectangle(double width, double height){
    this(width,height,0,0);
  }
  public Rectangle(){
    this(1,1,0,0);
  }
  // new method to sccale rectangle
  public void scale(double scaleX, double scaleY){
    width=width * scaleX;
    height=height * scaleY;
  }
  public void scale(double factor){
    width= width * factor;
    height=height * factor ;
  }
  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }

  // determiningif 2 rectangles overlap
  public boolean isOverlappedWith(Rectangle r){
    double thisLeft = this.originX;
    double thisRight = this.originX + this.width;
    double thisBottom = this.originY;
    double thisTop = this.originY + this.height;

    double rLeft = r.originX;
    double rRight = r.originX + r.width;
    double rBottom = r.originY;
    double rTop = r.originY + r.height;

    // if one rectangle is completely to then left of the other 
    // If one rectangle is completely to the left of the other
    if (thisRight <= rLeft) {
        return false;
    }

    // If one rectangle is completely to the right of the other
    if (thisLeft >= rRight) {
        return false;
    }

    // If one rectangle is completely below the other
    if (thisTop <= rBottom) {
        return false;
    }

    // If one rectangle is completely above the other
    if (thisBottom >= rTop) {
        return false;
    }

    // Otherwise, they overlap
    return true;
    }

    public static boolean areOverlapping(Rectangle r1, Rectangle r2) {
        return r1.isOverlappedWith(r2);
    }

    // method to calculting ratio of width to height 
    public double calRatio(){
      return width / height;
    }

    // method to determine if the rectangle is square or not 
    public boolean isSquare(){
      double ratio = calRatio();
      if (ratio >= 0.999 && ratio <= 1.001) {
          return true;
      } else {
          return false;
      }
    }
}


public class Rectangle implements Shape {
    
    private double x;  //koordinatlari tutar
    private double y;
    private double height; //boyu tutar
    private double width; //eni tutar

    
    //constructor metot
    public Rectangle(double x, double y,double height, double width){
        this.x=x;
        this.y=y;
        this.height=height;
        this.width=width;    
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "x=" + x + ", y=" + y + ", height=" + height + ", width=" + width + '}';
    }
    

    @Override
    public double calculateArea() {
        return height*width;
        }

    @Override
    public double calculatePerimeter() {
        return 2*(height+width);
        }

    
    
    
    
}

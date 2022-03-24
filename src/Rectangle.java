
public class Rectangle {
    double width;
    double height;

    public Rectangle(){
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidht() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWight(double widht) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double getArea(){
        double area = this.width * this.height;
        return area;
    }

    double getPerimeter(){
        double perimeter = 2*(width+height);
        return perimeter;
    }

    public String display(){
        return "Rectangle{" + "width= " + width + ", height= " + height + "}";
    }
}

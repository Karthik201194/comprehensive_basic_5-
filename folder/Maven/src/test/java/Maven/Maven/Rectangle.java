package Maven.Maven;

public class Rectangle{
    // Step b: Create float variables length and width
    private float length;
    private float width;
    // Step c: Create Setter and Getter methods
    public void setLength(float length) {
        this.length = length;
    }
    public float getLength() {
        return length;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getWidth() {
        return width;
}
    // Step d: Create getArea() method
    public float getArea() {
        return length * width;
    }
    // Step e: Create getPerimeter() method
    public float getPerimeter() {
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5.0f);
        rectangle.setWidth(3.0f);
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}


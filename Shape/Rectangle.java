//Name : Karne Karthikeshwar Reddy
//PRN : 23070126055
//Batch : AIML A3

class Rectangle extends Shape {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateShape() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

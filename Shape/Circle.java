//Name : Karne Karthikeshwar Reddy
//PRN : 23070126055
//Batch : AIML A3

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    void calculateShape() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}

//Name : Karne Karthikeshwar Reddy
//PRN : 23070126055
//Batch : AIML A3

class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    void calculateShape() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
    }
}

//Name : Karne Karthikeshwar Reddy
//PRN : 23070126055
//Batch : AIML A3

abstract class Shape {
    String shapeName;

    // Constructor
    public Shape(String shape) {
        this.shapeName = shape;
    }

    // Abstract methods for calculating area and perimeter
    abstract void calculateShape();
    abstract void calculatePerimeter();
}

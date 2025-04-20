//Name : Karne Karthikeshwar Reddy
//PRN : 23070126055
//Batch : AIML A3

class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    void calculateShape() {
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface Area of Cylinder: " + area);
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Cylinder does not have a perimeter.");
    }

    @Override
    public void calculateVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}

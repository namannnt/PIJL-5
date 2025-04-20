//Name : Karne Karthikeshwar Reddy
//PRN : 23070126055
//Batch : AIML A3

class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    void calculateShape() {
        double area = 4 * Math.PI * radius * radius;
        System.out.println("Surface Area of Sphere: " + area);
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Sphere does not have a perimeter.");
    }

    @Override
    public void calculateVolume() {
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere: " + volume);
    }
}

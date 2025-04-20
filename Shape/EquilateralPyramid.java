//Name : Karne Karthikeshwar Reddy
//PRN : 23070126055
//Batch : AIML A3

class EquilateralPyramid extends Shape implements Volume {
    private double base, height;

    public EquilateralPyramid(double base, double height) {
        super("Equilateral Pyramid");
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateShape() {
        double baseArea = base * base;
        double lateralArea = 2 * base * Math.sqrt((base / 2) * (base / 2) + height * height);
        double totalArea = baseArea + lateralArea;
        System.out.println("Surface Area of Equilateral Pyramid: " + totalArea);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 4 * base;
        System.out.println("Perimeter of Pyramid Base: " + perimeter);
    }

    @Override
    public void calculateVolume() {
        double volume = (1.0 / 3) * (base * base) * height;
        System.out.println("Volume of Equilateral Pyramid: " + volume);
    }
}

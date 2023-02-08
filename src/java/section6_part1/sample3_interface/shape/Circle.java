package section6_part1.sample3_interface.shape;

class Circle implements Shape {
    private final double _radius;

    Circle(final double radius) {
        _radius = radius;
    }
    
    public double area() {
        return _radius * _radius * Math.PI;
    }
}

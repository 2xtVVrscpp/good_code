package section6_part1.sample3_interface.shape;

class Rectangle implements Shape {
    private final double _width;
    private final double _height;
    
    Rectangle(final double width, final double height) {
        _width = width;
        _height = height;
    }

    public double area() {
        return _width * _height;
    }
}

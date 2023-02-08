package section6_part1;

public class Magic {
    final String _name;
    final int _costMagicPoint;

    Magic(final String name, final int costMagicPoint) {
        _name = name;
        _costMagicPoint = costMagicPoint;
    }

    public String getName() {
        return _name;
    }
}

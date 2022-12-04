package transport;

public enum WeightTruck {

    N1(0D,3.5),
    N2(3.5, 12D),
    N3(12D,20D);
    private final double from;
    private final double to;

    WeightTruck(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}

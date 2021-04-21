package io.github.laplacedemon.unitconverter.unit;

public enum LenUT implements UnitType {
    mm(0.001), cm(0.01), dm(0.1), m(1.0), km(1000.0);

    public double value;

    LenUT(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}

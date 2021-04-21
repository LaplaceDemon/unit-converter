package io.github.laplacedemon.unitconverter.unit;

public enum VolumeUT implements UnitType {
    cm3(0.000001), dm3(0.001), m3(1.0),
    L(0.001), mL(0.000001),
    CubicMeter(1.0);

    public double value;

    VolumeUT(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

}

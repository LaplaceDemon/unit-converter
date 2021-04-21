package io.github.laplacedemon.unitconverter.unit;

public enum PressureUT implements UnitType {
    mmH2O(9.80665),
    mmHg(133.322),
    Pa(1.0),
    KPa(1000.0),
    MPa(1000000.0),
    bar(100000.0),
    torr(133.322);

    public double value;

    PressureUT(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
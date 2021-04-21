package io.github.laplacedemon.unitconverter;

import io.github.laplacedemon.unitconverter.unit.UnitType;

public class UnitConverter {

    public static <T extends UnitType> UnitValue convert(double value, T from, T to) {
        Double fromValue = from.getValue();
        Double toValue = to.getValue();
        if (fromValue != null || fromValue != null) {
            value = value * fromValue;
            value = value / toValue;
        } else {
            return null;
        }

        UnitValue unitValue = new UnitValue(value, to);
        return unitValue;
    }
}

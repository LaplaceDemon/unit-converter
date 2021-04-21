package io.github.laplacedemon.unitconverter;

import io.github.laplacedemon.unitconverter.unit.UnitType;

/**
 * 带单位的值。
 */
public class UnitValue {
	private double value;
	private UnitType unit;
	
	public UnitValue() {
		super();
	}

	public UnitValue(double value, UnitType unit) {
		this.value = value;
		this.unit = unit;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public UnitType getUnit() {
		return unit;
	}

	public void setUnit(UnitType unit) {
		this.unit = unit;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof UnitValue)) {
			return false;
		}

		UnitValue unitValue = (UnitValue) o;

		if (Double.compare(unitValue.value, value) != 0) {
			return false;
		}
		return unit != null ? unit.equals(unitValue.unit) : unitValue.unit == null;

	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		temp = Double.doubleToLongBits(value);
		result = (int) (temp ^ (temp >>> 32));
		result = 31 * result + (unit != null ? unit.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return value + " " + unit;
	}
}

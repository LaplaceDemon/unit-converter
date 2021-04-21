package io.github.laplacedemon.unitconverter;

import io.github.laplacedemon.unitconverter.unit.LenUT;
import org.junit.Assert;
import org.junit.Test;

public class TestUnitConverter {

    @Test
    public void testExist() {
        UnitValue unitValue = UnitConverter.convert(10.0, LenUT.m, LenUT.mm);
        Assert.assertEquals(unitValue, new UnitValue(10000.0, LenUT.mm));
    }
}

package sjq.unit.converter;

import org.junit.Assert;
import org.junit.Test;

public class TestUnitConverter {
	
	@Test
	public void testExist(){
		UnitValue unitValue = UnitConverter.convert("length", "m", "mm", 10.0);
		Assert.assertEquals(unitValue,new UnitValue(10000.0,"mm"));  
	}
}

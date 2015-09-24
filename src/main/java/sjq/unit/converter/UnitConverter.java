package sjq.unit.converter;

import java.util.Map;

public class UnitConverter {
	
	/**
	 * 单位是否存在
	 * @param physicalName
	 * @param unitname
	 * @return
	 */
	public static boolean exist(String physicalName,String unitname) {
		Map<String, Double> unitTable = UnitTable.getUnitTable(physicalName);
		return unitTable.containsKey(unitname);
	}
	
	/**
	 * 单位转换
	 * @param physicalName
	 * @param from
	 * @param to
	 * @param value
	 * @return
	 */
	public static UnitValue convert(String physicalName,String from, String to, Double value) {
		Map<String, Double> unitTable = UnitTable.getUnitTable(physicalName);
		Double fromValue = unitTable.get(from);
		Double toValue = unitTable.get(to);
		if(fromValue!=null || fromValue!=null){
			value = value * fromValue;		
			value = value / toValue;
		}else{
			return null;
		}
		
		UnitValue unitValue = new UnitValue(value,to);
		return unitValue;
	}
}

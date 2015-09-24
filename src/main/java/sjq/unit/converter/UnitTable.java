package sjq.unit.converter;

import java.util.HashMap;
import java.util.Map;

public class UnitTable {
	private UnitTable(){}
	private static Map<String,Map<String,Double>> unitTable = new HashMap<>();
	
	/**
	 * 长度单位，以m为基准单位，指定单位换算表
	 */
	private static Map<String, Double> lengthUnitMap = new HashMap<>();
	/**
	 * 压力单位，以Pa为基准单位，指定单位换算表
	 */
	private static Map<String, Double> pressureUnitMap = new HashMap<>();
	/**
	 * 体积单位，容积单位，以 m3（立方米）为基准单位，指定单位换算表
	 */
	private static Map<String, Double> volumeUnitMap = new HashMap<>();
	
	static {
		lengthUnitMap.put("mm", 0.001);
		lengthUnitMap.put("cm", 0.01);
		lengthUnitMap.put("dm", 0.1);
		lengthUnitMap.put("m", 1.0);
		lengthUnitMap.put("km", 1000.0);
		
		pressureUnitMap.put("mmH2O", 9.80665);
		pressureUnitMap.put("mmHg", 133.322);
		pressureUnitMap.put("Pa", 1.0);
		pressureUnitMap.put("KPa", 1000.0);
		pressureUnitMap.put("MPa", 1000000.0);
		pressureUnitMap.put("bar", 100000.0);
		pressureUnitMap.put("torr", 133.322);
		
		volumeUnitMap.put("cm3", 0.000001);
		volumeUnitMap.put("dm3", 0.001);
		volumeUnitMap.put("m3", 1.0);
		volumeUnitMap.put("立方米", 1.0);
		volumeUnitMap.put("L", 0.001);
		volumeUnitMap.put("mL", 0.000001);
		
		unitTable.put("length", lengthUnitMap);
		unitTable.put("pressure", pressureUnitMap);
		unitTable.put("volume", volumeUnitMap);
	}
	
	public static Map<String,Double> getUnitTable(String unitname){
		return unitTable.get(unitname);
	}
}

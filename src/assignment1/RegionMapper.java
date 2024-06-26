package assignment1;

import java.util.HashMap;
import java.util.Map;

public class RegionMapper {
	 private static final Map<String, Region> map = new HashMap<>();

	    static {
	        map.put("USA", Region.R1);
	        map.put("Germany", Region.R2);
	        map.put("France", Region.R2);
	        map.put("India", Region.R3);
	        map.put("China", Region.R3);
	        map.put("Nigeria", Region.R4);
	        map.put("South Africa", Region.R4);
	    }

	    public static Region getRegion(String country) {
	        return map.get(country);
	    }

}

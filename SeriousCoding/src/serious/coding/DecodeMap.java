package serious.coding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecodeMap {
	private static final Map<String, String> myMap;
    static
    {
        myMap = new HashMap<String, String>();
        myMap.put("1", "a");
        myMap.put("2", "b");
        myMap.put("3", "c");
        myMap.put("4", "d");
        myMap.put("12", "l");
        myMap.put("20", "t");
        myMap.put("21", "u");
        myMap.put("22", "v");
        myMap.put("23", "w");
    }
    private static List<String> solution;
	
	public static List<String> findAllPossibleSolutions(String n) {
		solution = new ArrayList<String>();
		helperFunction(n, "", solution);
		return solution;
	}
	
	public static void helperFunction(String input, String result, List<String> solution) {
		// fetch single char
		if(input.length() == 0) {
			solution.add(result);
			return;
		}
		if(input != null) {
			if(!myMap.containsKey(input.substring(0,1))) {
				return;
			}
			result = result + myMap.get(input.substring(0,1));
			helperFunction(input.substring(1), result, solution);
			result = result.substring(0, result.length()-1);
			
			if(input.length() >= 2) {
				if(!myMap.containsKey(input.substring(0,2))) {
					return;
				}
			    result = result + myMap.get(input.substring(0, 2));
			    helperFunction(input.substring(2), result, solution);
			}
		}
		
		//fetch two char at a time
		
	}
}

package AugastWrritenTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//24) Create a Map<String,String> where key is adharno  and value is voted casted to which party
//(eg. BJP,ShivSena,NCP,Congress,Other) .
//From this create new map such that KEY is party name and value is count of votes casted .[1M]

public class Problem24 {

	public static void main(String[] args) {

		Map<String, String> m = new HashMap<String, String>();
		m.put("312323243", "bjp");
		m.put("321312321", "shivsena");
		m.put("432434234", "ncp");
		m.put("432434324", "congress");
		m.put("432434323", "congress");

		Map<String, Integer> m2 = new HashMap<String, Integer>();
		for (Entry<String, String> x : m.entrySet()) {
			if (m2.containsKey(x.getValue())) {
				int t = m2.get(x.getValue());
				m2.put(x.getValue(), t + 1);
			} else {
				m2.put(x.getValue(), 1);
			}
		}
		System.out.println(m2);
	}
}

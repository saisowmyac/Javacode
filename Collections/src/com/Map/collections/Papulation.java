package com.Map.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Papulation {

	public static void main(String[] args) {
		Map<String, String> papulation = new Hashtable<>();
		
		
		papulation.put("India", "140cr");
		papulation.put("USA", "33cr");
		papulation.put("China", "141cr");
		papulation.put("Uk", "6cr");
		
		// it does accept null points
//		papulation.put("Pakistan", null);
		System.out.println(papulation);
		for (Map.Entry<String, String> key : papulation.entrySet()) {
			System.out.println("{" + key.getKey() + "\tPapulatuon: " + key.getValue() + "}");
		}
		System.out.println();
		papulation.putIfAbsent("Dubai", "20cr");
		System.out.println(papulation);
		papulation.replace("Dubai", "33cr");
		System.out.println();

		
		Set<String> keys = papulation.keySet();
		for (String key : keys) {
			System.out.println("[" + key + "\t Papulation is : " + papulation.get(key) + "]");

		}
	}

}

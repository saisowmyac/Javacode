package com.Map.collections;

import java.util.*;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class PersonIdentity {

	public static void main(String[] args) {
		Map<Long, String> identity = new HashMap<>();
		identity.put(987612346543l, "Anju");
		identity.put(876509432876l, "Anju");
		identity.put(786543087652l, "Kumar");
		identity.put(657894321875l, "Pandu");
		identity.put(123456789011l, "Navya");
		identity.put(123456789011l, "N");
		identity.put(123456789011l, "Navya");

		// using iterator
		Iterator<Long> itr = identity.keySet().iterator();

		while (itr.hasNext()) {
			Long key = itr.next();
			System.out.println("Person" + "[ Addher No: " + key + "\t Name : " + identity.get(key) + " ]");
		}

		identity.replace(657894321875l, "Krishna");
		System.out.println("Changed the Name Pandu to Krishna");
		System.out.println(identity);
		System.out.println("Match AdherNo : " + identity.containsKey(20346789011l));
		System.out.println("Search name using key : " + identity.get(123456789011l));
		identity.putIfAbsent(987654321075l, "Sudheer");
		System.out.println(identity);

		Map<Long, String> identity1 = new LinkedHashMap<>();
		identity1.put(987612346543l, "Anju");
		identity1.put(876509432876l, "Anju");
		identity1.put(786543087652l, "Kumar");
		identity1.put(657894321875l, "Pandu");
		identity1.put(123456789011l, "Navya");

		Iterator<Long> itr1 = identity1.keySet().iterator();

		while (itr1.hasNext()) {
			Long key = itr1.next();
			System.out.println("Person " + "[ Addher No: " + key + "\t Name : " + identity1.get(key) + " ]");
		}
		identity1.putIfAbsent(987654321075l, "Sudheer");
		identity1.putIfAbsent(null, "Radha");
		System.out.println(identity1);
		System.out.println();
		//converting map to list
		System.out.println("Converting Map to List ");
		List<Long> id = new ArrayList<>(identity.keySet());
		id.forEach((System.out::println));
		List<String> name = new LinkedList<>(identity.values());
		name.forEach(System.out::println);
		//converting map to Set
		Set<Long> id1 = new  HashSet<>(identity.keySet());
		System.out.println("Converting Map to Set ");
	    for(Long id11:id1) {
	    	System.out.println(id11);
	    }

	}

}

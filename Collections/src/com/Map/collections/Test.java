package com.Map.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		Map<Integer, String> order = new TreeMap<>();
		order.put(101, "Sowmya");
		order.put(503, "Sai");
		order.put(333, "pinkey");
		order.put(202, "Ammu");
		order.put(410, "Nani");
		Iterator itr = order.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Size is: " + order.size());
		System.out.println(order.keySet());
		System.out.println(order.values());
		System.out.println("It is emplty?  " + order.isEmpty());
		System.out.println(order.replace(410, "Chntu"));
		System.out.println(order);
		order.clear();
		System.out.println(order);

	}

}

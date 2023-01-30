package Enumeration;

public enum Mobile {
	NOKIYA(5000), SAMSUNG(10000), REDMI(13000), REALME(12000);

	int price;

	Mobile(int p) {
		price = p;
//		System.out.println(p);
	}

	public int getPrice() {

		return price;
	}

	public static void main(String[] arg) {

		for (Mobile m : Mobile.values()) {
			System.out.println(m);
		}
		System.out.println();
		System.out.println(Mobile.valueOf("SAMSUNG"));
		Mobile mb = Mobile.REALME;
		System.out.println(mb);
		System.out.println(Mobile.valueOf("NOKIYA") + "\t Price is: " +Mobile.valueOf("NOKIYA").getPrice());
    	System.out.println(Mobile.valueOf("REDMI") + "\t index is :" + Mobile.valueOf("REDMI").ordinal());

	}
}

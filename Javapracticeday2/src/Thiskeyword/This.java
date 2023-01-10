package Thiskeyword;

 public class This {
	This()
	{
		System.out.println("Print this keyword");
	}
	This(int a){
         this();
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		This S = new This(100);

	}

}

package btr;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<Integer> iOb;
		iOb = new Generic<Integer>(88);
		iOb.showType();
		
		int v = iOb.getob();
		System.out.println("value : " + v);
		
		Generic<String> strOb = new Generic<String>("Generics Test");
		strOb.showType();
		
		String str = strOb.getob();
		System.out.println("value: " + str);

	}

}

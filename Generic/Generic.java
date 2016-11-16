package btr;

public class Generic<T> {
	T ob;
	
	Generic(T o) {
		ob = o;
		
	}
	
	T getob() {
		return ob;
	}
	
	void showType(){
		System.out.println("Type of T is " + ob.getClass().getName());
	}

}

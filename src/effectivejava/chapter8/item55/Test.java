package effectivejava.chapter8.item55;

interface Test2{
	void show();
	static String show2() {
		return "inside show2";
	}
	static String show3() {
		return "inside sow3";
	}
}

public final class Test implements Test2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(Test2.show2());
	}

}

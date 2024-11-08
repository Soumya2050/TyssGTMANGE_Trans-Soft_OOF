package javaPractice;

interface test{
	void add(int a,int b);
}
public class lamdaExpression {
	
	public static void main(String[] args) {
		
		test t =(a,b)->{System.out.println(a+b);};
		t.add(10, 20);
	}

}

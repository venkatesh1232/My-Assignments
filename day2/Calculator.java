package week1.day2;

public class Calculator {
public int add(int a, int b, int c) {
	return a+b+c;
}
public int mul(int e, int f) {
		return e*f;
	
}
public void sub() {
System.out.println("subtraction");
}
	public static void main(String[] args) {
		Calculator result= new Calculator();
		System.out.println(result.add(4, 5, 6));
		System.out.println(result.mul(3, 5));
		result.sub();

	}

}

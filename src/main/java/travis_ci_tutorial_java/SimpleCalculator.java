package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int Minus(int a, int b) {
		return a-b;
	}

	public int Multiply(int a, int b) {
		return a*b;
	}

	public int Divide(int a, int b) {
		if(a==0||b==0) {
			return 0;
		}
		return a/b;
	}
}

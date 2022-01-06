package com.training.java8;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		int width = 20;
		
		DrawBoard s = ()->{
			System.out.println("Displaying: " + width);
		};
		
		s.draw();
	}

}

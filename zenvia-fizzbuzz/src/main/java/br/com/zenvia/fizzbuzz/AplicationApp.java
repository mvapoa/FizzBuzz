package br.com.zenvia.fizzbuzz;

import br.com.zenvia.fizzbuzz.controller.FizzBuzzController;

public class AplicationApp {

	public static void main(String[] args) {
		FizzBuzzController controller = new FizzBuzzController(3, 5, 100);
		System.out.println(controller.initializer());
	}

}

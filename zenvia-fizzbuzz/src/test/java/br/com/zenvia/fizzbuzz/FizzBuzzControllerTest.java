package br.com.zenvia.fizzbuzz;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import br.com.zenvia.fizzbuzz.controller.FizzBuzzController;

public class FizzBuzzControllerTest {

	@Test
	public void fizzBuzzTest() {
		FizzBuzzController controller = new FizzBuzzController(3, 5, 15);
		String result = controller.initializer();

		String expected = mockFizzBuzz();
		Assert.assertEquals(expected, result);
	}

	@Test
	public void fizzTest() {
		FizzBuzzController controller = new FizzBuzzController(3, 5, 3);
		String result = controller.initializer();

		String expected = mockFizz();
		Assert.assertEquals(expected, result);
	}

	@Test
	public void buzzTest() {
		FizzBuzzController controller = new FizzBuzzController(3, 5, 5);
		String result = controller.initializer();

		String expected = mockBuzz();
		Assert.assertEquals(expected, result);
	}
	
	@Test(expected= Exception.class) 
	public void excetionTest() {
		FizzBuzzController controller = new FizzBuzzController(0, -1, 5);
		controller.initializer();
	}

	private String mockFizz() {
		StringBuilder mock = new StringBuilder().append("1").append("\n").append("2").append("\n").append("Fizz")
				.append("\n");
		return mock.toString();
	}

	private String mockBuzz() {
		StringBuilder mock = new StringBuilder().append("1").append("\n").append("2").append("\n").append("Fizz")
				.append("\n").append("4").append("\n").append("Buzz").append("\n");
		return mock.toString();
	}

	private String mockFizzBuzz() {
		StringBuilder mock = new StringBuilder().append("1").append("\n").append("2").append("\n").append("Fizz")
				.append("\n").append("4").append("\n").append("Buzz").append("\n").append("Fizz").append("\n")
				.append("7").append("\n").append("8").append("\n").append("Fizz").append("\n").append("Buzz")
				.append("\n").append("11").append("\n").append("Fizz").append("\n").append("Fizz").append("\n")
				.append("14").append("\n").append("FizzBuzz").append("\n");
		return mock.toString();
	}

}

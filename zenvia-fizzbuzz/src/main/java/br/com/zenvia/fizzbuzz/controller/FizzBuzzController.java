package br.com.zenvia.fizzbuzz.controller;

import br.com.zenvia.fizzbuzz.game.FizzBuzzGame;
import br.com.zenvia.fizzbuzz.model.Buzz;
import br.com.zenvia.fizzbuzz.model.Fizz;

public class FizzBuzzController {

	private int numberFizz;
	private int numberBuzz;
	private int length;

	public FizzBuzzController(int numberFizz, int numberBuzz, int length) {
		super();
		this.numberFizz = numberFizz;
		this.numberBuzz = numberBuzz;
		this.length = length;
	}

	public String initializer() {
		Fizz fizz = new Fizz(numberFizz);
		Buzz buzz = new Buzz(numberBuzz);

		FizzBuzzGame game = new FizzBuzzGame(fizz, buzz);
		return game.initialize(length);
	}

}

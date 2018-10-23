package br.com.zenvia.fizzbuzz.game;

import br.com.zenvia.fizzbuzz.model.Buzz;
import br.com.zenvia.fizzbuzz.model.Fizz;

public class FizzBuzzGame {

	private Fizz fizz;
	private Buzz buzz;

	public FizzBuzzGame(Fizz fizz, Buzz buzz) {
		super();
		this.fizz = fizz;
		this.buzz = buzz;
	}

	public String initialize(int size) {
		StringBuilder result = new StringBuilder();
		for (int index = 1; index <= size; index++) {
			if (fizz.show(index)) {
				result.append(fizz.write());
			}
			if (buzz.show(index)) {
				result.append(buzz.write());
			}
			if (!fizz.show(index) && !buzz.show(index)) {
				result.append(index);
			}
			result.append("\n");
		}
		return result.toString();
	}

}

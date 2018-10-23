package br.com.zenvia.fizzbuzz.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Buzz extends Word {

	private static final String TEXT = "Buzz";

	public Buzz(int rule) {
		super(rule);
	}

	@Override
	public boolean show(int number) {
		return number % this.getRule() == 0 || String.valueOf(number).contains(String.valueOf(this.getRule()));
	}

	@Override
	public String write() {
		return TEXT;
	}

}

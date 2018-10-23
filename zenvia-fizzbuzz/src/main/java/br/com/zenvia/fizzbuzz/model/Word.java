package br.com.zenvia.fizzbuzz.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Word {

	private int rule;

	public Word(int rule) {
		super();
		this.rule = rule;
	}

	public abstract boolean show(int number);

	public abstract String write();

}

package Ex02;

import java.util.Arrays;

public class Curriculo extends Documento{
	private String nome;
	private int idade;
	private String habilidades;

	public Curriculo(String nome, int idade, String habilidades) {
		this.nome = nome;
		this.idade = idade;
		this.habilidades = habilidades;
	}

	@Override
	public String toString() {
		return ("-=-=-=-=-=-Curriculo-=-=-=-=-=-\n" +
				"nome: " + nome + '\n' +
				"idade: " + idade + '\n' +
				"habilidades: " + habilidades + '\n');
	}
}

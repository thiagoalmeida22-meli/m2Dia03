package Ex02;

public class Main {

	public static void main(String[] args) {
		Documento cur = new Curriculo("Joaozinho", 26, "Acorda pedrinho, sei pular, e sei acordar");
		Impressora.imprimir(cur);
	}
}
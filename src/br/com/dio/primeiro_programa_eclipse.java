package br.com.dio;

import br.com.dio.model.Gato;

public class primeiro_programa_eclipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello word Eclipse");
		Gato gato = new Gato();
		Livros livros = new Livros();
		System.out.println(gato);

	}

}

class Livros {
	private String nome;
	private int nPag;
}

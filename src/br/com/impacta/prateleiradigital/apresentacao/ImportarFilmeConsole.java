package br.com.impacta.prateleiradigital.apresentacao;

import java.util.Scanner;

import br.com.impacta.prateleiradigital.controle.FilmeController;

public class ImportarFilmeConsole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** IMPORTAR FILMES ***");
		System.out.println("Digite o caminho e nome do arquivo: ");
		String pathFile = sc.nextLine();
		sc.close();
		
		FilmeController controller = new FilmeController();
		controller.importarFilmes(pathFile);
		
		System.out.println("...");
		System.out.println("Filmes importados com sucesso!");
	}
}

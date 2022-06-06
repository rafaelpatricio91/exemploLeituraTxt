package com.rafa.lerTxt;

public class Teste {
	public static void main(String[] args) throws Exception {
		//Instancia a classe que tem o método pra ler o txt
		LeitorTxt leitorTxt = new LeitorTxt();
		try {
			//itera em cima da lista que será retornada pelo método. Passar o dir como parametro.
			for (String cpf : leitorTxt.getTxtContent("/home/rafa/teste/testea.txt")) {
				//escreve na tela a linha. aqui será onde vc vai fazer todas as manipulações necessárias
				//com os dados
				System.out.println(cpf);
			}
		} catch (Exception e) {
			throw new Exception("Erro - ",e);
		}
	}
}

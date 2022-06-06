package com.rafa.lerTxt;

public class Teste {
	public static void main(String[] args) throws Exception {
		LeitorTxt leitorTxt = new LeitorTxt();
		try {
			for (String cpf : leitorTxt.getTxtContent("/home/rafa/teste/testea.txt")) {
				System.out.println(cpf);
			}
		} catch (Exception e) {
			throw new Exception("Erro - ",e);
		}
	}
}

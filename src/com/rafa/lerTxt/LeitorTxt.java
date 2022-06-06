package com.rafa.lerTxt;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorTxt {
	
	public List<String> getTxtContent(String directoryLocation) throws Exception { //recebe o diretorio como parametro
		//instancia as variaveis necessarias
		tring cpf = "";
		List<String> listaCpfs = new ArrayList<>();
		Scanner scanner = null;
		//monta o arquivo
		File arquivo = new File(directoryLocation);
		
		try {
			//itera as linhas do arquivo
			scanner = new Scanner(arquivo);
			//enquanto tiver linha preenchida
			while (scanner.hasNextLine()) {
				//pega e joga na variavel cpf
				cpf = scanner.nextLine();
				//se a linha tinha alguma informação
				if (cpf.length() > 0) {
					//joga dentro da lista
					listaCpfs.add(cpf);
				}
			}
		} catch (Exception e) {
			throw new Exception("Erro - ",e);
		}
		finally {
			//serve so pra fechar o scanner
			if (scanner != null) {
				scanner.close();
			}
		}
		//retorna a lista de cpfs
		return listaCpfs;
	}

}

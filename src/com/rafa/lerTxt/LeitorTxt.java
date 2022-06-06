package com.rafa.lerTxt;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorTxt {
	
	public List<String> getTxtContent(String directoryLocation) throws Exception {
		String cpf = "";
		List<String> listaCpfs = new ArrayList<>();
		Scanner scanner = null;
		File arquivo = new File(directoryLocation);
		
		try {
			scanner = new Scanner(arquivo);
			while (scanner.hasNextLine()) {
				cpf = scanner.nextLine();
				if (cpf.length() > 0) {
					listaCpfs.add(cpf);
				}
			}
		} catch (Exception e) {
			throw new Exception("Erro - ",e);
		}
		finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		return listaCpfs;
	}

}

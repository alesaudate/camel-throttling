package br.com.alesaudate.tdc.gerador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Random;


public class Gerador {

	private static String[] nomes = new String[]{"Alexandre", "José", "João", "Paulo", "Adriano"};
	private static String[] telefones = new String[]{"1112457634", "1121323233", "3132343222", "2144544343"};
	private static String[] enderecos = new String[]{"Rua dos Bobos, 0", "Av. das Nações Unidas, 3221", "Av. Pres. Kennedy, 44", "Av. Paulista, 2212"};
	private static String[] profissoes = new String[]{"Analista de Sistemas", "Comerciante", "Empresário", "Gerente de TI"};
	
	
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		
		File arquivo = new File("dados.txt");
		
		FileOutputStream fos = new FileOutputStream(arquivo);

		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			StringBuilder builder = new StringBuilder();
			builder.append(i).append(";");
			builder.append(nomes[random.nextInt(nomes.length)]).append(";");
			builder.append(telefones[random.nextInt(telefones.length)]).append(";");
			builder.append(enderecos[random.nextInt(enderecos.length)]).append(";");
			builder.append(profissoes[random.nextInt(profissoes.length)]).append(";");
			builder.append("\n");
			fos.write(builder.toString().getBytes());
		}

		fos.flush();
		fos.close();
	}

}

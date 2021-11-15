package javateste;

import java.io.*;
import java.util.Arrays;

public class Programa2 {

	public static void main(String args[]) throws IOException {
		//Localizando o Arquivo (Colocando seu path)
        FileInputStream stream = new FileInputStream("C:\\Users\\Gustavo\\Desktop\\Arquivos do Pc\\Escola Deveres\\3° Ano\\AplicaçõesMóveis\\dados.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        
        //Recebendo os Inputs do arquivo
        String input1 = linha;
        linha = br.readLine();
        String [] input1Separado = input1.split(" ");
        String [] input = new String[Integer.parseInt(input1Separado[1])];
        int i = -1;        
        while(linha != null) {
        	i = i + 1;
            input[i] = linha;
            linha = br.readLine();
        }
        
        //Funcionamento do programa
        int [] vendedores = new int [Integer.parseInt(input1Separado[0])];
        int [] resultadovendedores = new int [Integer.parseInt(input1Separado[0])];
        int fim = 1;
        //Colocando os primeiros valores de tempo para os vendedores
        for(int j = 0; j < vendedores.length; j++) {
        	try {
        	vendedores[j] = Integer.parseInt(input[j]);
        	input[j] = "0";
        	} catch (Exception e) {
        	      System.out.println("Não há ligações o suficiente para todos os atendentes!");
            }
        }
        //Começando o looping para fazer com que os vendedores façam as "ligações"
        while(fim == 1) {
        	fim = 0;
        	//Realizando as ligações de cada um retirando 1 minuto por vez, caso chege em 0 ele recebe 1 ligação completa!
        	for(int j = 0; j < vendedores.length; j++) {
            	vendedores[j] = vendedores[j]-1;
            	if(vendedores[j] == 0) {
            		resultadovendedores[j] = resultadovendedores[j] + 1;
            	}
            }
        	//Olhando para ver quais são os atendentes que podem atender outra ligação
            for(int j = 0; j < vendedores.length; j++) {
            	for(int k = 0; k < input.length; k++) {
            		if(vendedores[j] == 0 && Integer.parseInt(input[k])!=0) {
            			try {
            			vendedores[j] = Integer.parseInt(input[k]);
            			input[k] = "0";
            			} catch (Exception e) {
                  	      System.out.println("Não há ligações o suficiente para todos os atendentes!");
                        }
            		}
            	}
            }
            //Testando para ver se todas as ligações foram completas (Para ver se posso fechar o looping)
            for(int j = 0; j < vendedores.length; j++) {
            	if(vendedores[j]>0) {
            		fim = 1;
            	}
            }
        }
        //Exibindo os resultados
        for(int j = 0; j < vendedores.length; j++) {
        	System.out.println(j + 1 + " " + resultadovendedores[j]);
        }
	}
}

package javateste;

import java.io.*;
import java.util.Arrays;

public class Programa3 {
	
	public static void main(String args[]) throws IOException {
		//Localizando o Arquivo (Colocando seu path)
        FileInputStream stream = new FileInputStream("C:\\Users\\Gustavo\\Desktop\\Arquivos do Pc\\Escola Deveres\\3° Ano\\AplicaçõesMóveis\\dados.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        
        //Recebendo os Inputs do arquivo
        String [] input = new String[2];
        int i = -1;        
        while(linha != null) {
        	i = i + 1;
            input[i] = linha;
            linha = br.readLine();
        }
        String[] input1Sep = input[0].split(" ");
        String[] input2Sep = input[1].split(" ");
        int [] input1Separado = new int [input1Sep.length];
        int [] input2Separado = new int [input2Sep.length];
        for(int j=0; j<input1Sep.length; j++) {
        	input1Separado[j] = Integer.parseInt(input1Sep[j]);
        	input2Separado[j] = Integer.parseInt(input2Sep[j]);
        }
        
        //Funcionamento do programa
        if(input2Separado[0] >= input1Separado[0] && input2Separado[0] <= input1Separado[2] && input2Separado[1] >= input1Separado[1] && input2Separado[1] <= input1Separado[3]) {
        	System.out.println("1");        	
        } else {
        	if(input2Separado[2] >= input1Separado[0] && input2Separado[2] <= input1Separado[2] && input2Separado[3] >= input1Separado[1] && input2Separado[3] <= input1Separado[3]) {        	
        		System.out.println("1");
        	} else {
        		System.out.println("0");
        	}
        }
	}
}

import java.util.Scanner;
import java.util.Stack;

public class Calculo{


	public static void main(String [] args){
		
		Stack<Integer> stack1 = new Stack<Integer>();
		System.out.println("Para usar basta digitar um número ou operação por vez, a pilha está sempre a mostra para você não se perder. ");
		System.out.println("Caso queira sair digite: sair ");
		
		for (int i=0;i>-1;i++){
		System.out.println("Digite um número ou uma operação para interagir com a pilha: ");
		Scanner input = new Scanner( System.in );
		String idade = input.next(); 
		// instanciando um objeto que implementa o TAD pilha
		
		
		switch( idade ) {
		  case "+":
			int elemento1 = (Integer) stack1.pop();
			int elemento2 = (Integer) stack1.pop();
			stack1.push( elemento1 + elemento2 );
		    break;
		  case "-":
			int elemento3 = (Integer) stack1.pop();
			int elemento4 = (Integer) stack1.pop();
			stack1.push( elemento3 - elemento4 );
		    break;
		  case "*":
			int elemento5 = (Integer) stack1.pop();
			int elemento6 = (Integer) stack1.pop();
			stack1.push( elemento5 * elemento6 );
			break;
		  case "/":
			int elemento7 = (Integer) stack1.pop();
			int elemento8 = (Integer) stack1.pop();
			stack1.push( elemento7 / elemento8 );
			break;
		  case "sair":
			System.exit(0);
			break;
		  default:
			// convertendo uma string para o tipo inteiro
			int idadeInteiro = Integer.parseInt(idade);
			// enviando pra pilha
			stack1.push( idadeInteiro );
		}
		
		System.out.print( stack1 );
		}
	}
}
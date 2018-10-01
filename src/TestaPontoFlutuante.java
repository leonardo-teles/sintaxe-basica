
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		
		double salario = 1250.70;
		System.out.println("meu salário é " + salario);
		
		//isso funciona porque um inteiro cabe dentro de um double. O contrário, não!!!
		double idade = 37;
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		//quando temos uma divisão por números inteiros, o java trunca o valor decimal e não o exibe
		int outradivisao = 5 / 2;
		System.out.println(outradivisao);
		
		//aqui, ele retorna 2.0 porque ele faz primeiro o que está a direita do sinal de igual. Como são dois números inteiros,
		//ele exibe o "2". Pelo caso da variável ser do tipo double, ele coloca o zero para caracterizar esse double
		// um truque pra resolver isso e colocar a resposta corretamente é deixar um dos dois números como double
		double novatentativa = 5.0 / 2;
		System.out.println(novatentativa);
		
	}
}


public class TestaCaracteres {

	public static void main(String[] args) {
		
		// o char só guarda uma única letra
		// as aspas devem ser simples e não podem estar vazias. Devem ter, ao menos, um espaço
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}

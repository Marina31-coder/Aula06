import java.util.Scanner;

public class EntendendoVetores {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Digite um valor");
			vetor[i] = leitor.nextInt();
		}
		
		for(int i=0;i<vetor.length;i++) {
			System.out.println("No �ndice " + i + " foi armazenado o valor " + vetor[i]);
			
		}
		
		leitor.close();
		
		/*vetor[0]=5;
		vetor[1]=10;
		
		System.out.println("A primeira posi��o cont�m o valor" + vetor[0]);
		System.out.println("A segunda posi��o cont�m o valor " + vetor[1]);*/
	}

}

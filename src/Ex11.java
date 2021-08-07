import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
        int n;
        int anterior1, anterior2, atual;
        anterior2 = 1;
        atual = 0;
        System.out.println("Digite a quantidade de elementos da sequência de Fibonacci que você quer exibir");
        n = leitor.nextInt();
        for(int i=0;i<n;i++) {
            anterior1 = anterior2;
            anterior2 = atual;
            atual = anterior1 + anterior2;
            System.out.println(atual);
        }
        leitor.close();
	}

}

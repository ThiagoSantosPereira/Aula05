import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int placa;
		int diaSemana;
		int meioTransporte=0;
		int segunda = 0,terca=0,quarta=0,quinta=0,sexta=0,onibus=0;
		
		Scanner leitor = new Scanner(System.in);

		for(int i=1;i<5;i++) {
			
			System.out.println("Qual � o seu meio de transporte: 1- Carro ou 2- �nibus");
			meioTransporte = leitor.nextInt();
			
			switch (meioTransporte) {
			
			case 1:
			System.out.println("Qual a placa");
			placa = leitor.nextInt();
			
				switch (placa) {
				
				case 0:System.out.println("Seu rod�zio � de segunda-feira"); segunda++;
				break;
				case 1:System.out.println("Seu rod�zio � de segunda-feira"); segunda++;
				break;
				case 2:System.out.println("Seu rod�zio � de ter�a-feira"); terca++;
				break;
				case 3:System.out.println("Seu rod�zio � de ter�a-feira"); terca++;
				break;
				case 4:System.out.println("Seu rod�zio � de quarta-feira"); quarta++;
				break;
				case 5:System.out.println("Seu rod�zio � de quarta-feira"); quarta++;
				break;
				case 6:System.out.println("Seu rod�zio � de quinta-feira"); quinta++;
				break;
				case 7:System.out.println("Seu rod�zio � de quinta-feira"); quinta++;
				break;
				case 8:System.out.println("Seu rod�zio � de sexta-feira"); sexta++;
				break;
				case 9:System.out.println("Seu rod�zio � de sexta-feira"); sexta++;
				break;
				
				}
				break;
			case 2:
				System.out.println("Rod�zio n�o se aplica"); onibus++;
				break;
			
			
			}
			
		}
		System.out.println("Onibus: " + onibus + " Segunda-feira:" + segunda + " Ter�a-Feira: " + terca +" Quarta-feira: " + quarta + " Quinta-feira: " + quinta + " Sexta_feira: " + sexta);
	}

}

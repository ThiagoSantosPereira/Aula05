import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int placa;
		int diaSemana;
		int meioTransporte=0;
		int segunda = 0,terca=0,quarta=0,quinta=0,sexta=0,onibus=0;
		
		Scanner leitor = new Scanner(System.in);

		for(int i=0;i<5;i++) {
			
			System.out.println("Qual � o seu meio de transporte: 1- Carro ou 2- �nibus");
			meioTransporte = leitor.nextInt();
			
			switch (meioTransporte) {
			
			case 1:
			System.out.println("Qual a placa");
			placa = leitor.nextInt();
			
				switch (placa) {
				
				case 0:
				case 1:System.out.println("Seu rod�zio � de segunda-feira"); segunda++;
				break;
				case 2:
				case 3:System.out.println("Seu rod�zio � de ter�a-feira"); terca++;
				break;
				case 4:
				case 5:System.out.println("Seu rod�zio � de quarta-feira"); quarta++;
				break;
				case 6:
				case 7:System.out.println("Seu rod�zio � de quinta-feira"); quinta++;
				break;
				case 8:
				case 9:System.out.println("Seu rod�zio � de sexta-feira"); sexta++;
				break;
				default:System.out.println("op��o invalida");
					break;
				}
				break;
			case 2:
				System.out.println("Rod�zio n�o se aplica"); onibus++;
				break;
			default: System.out.println("op��o invalida");
				break;
			}

		}
		System.out.println("Onibus: " + onibus);
		System.out.println("Segunda-feira:" + segunda);
		System.out.println("Ter�a-Feira: " + terca);
		System.out.println("Quarta-feira: " + quarta);
		System.out.println("Quinta-feira: " + quinta);
		System.out.println("Sexta_feira: " + sexta);
		
		leitor.close();
	}

}

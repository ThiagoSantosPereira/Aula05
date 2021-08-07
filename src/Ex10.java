import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int placa;
		int diaSemana;
		int meioTransporte=0;
		int segunda = 0,terca=0,quarta=0,quinta=0,sexta=0,onibus=0;
		
		Scanner leitor = new Scanner(System.in);

		for(int i=0;i<5;i++) {
			
			System.out.println("Qual é o seu meio de transporte: 1- Carro ou 2- ônibus");
			meioTransporte = leitor.nextInt();
			
			switch (meioTransporte) {
			
			case 1:
			System.out.println("Qual a placa");
			placa = leitor.nextInt();
			
				switch (placa) {
				
				case 0:
				case 1:System.out.println("Seu rodízio é de segunda-feira"); segunda++;
				break;
				case 2:
				case 3:System.out.println("Seu rodízio é de terça-feira"); terca++;
				break;
				case 4:
				case 5:System.out.println("Seu rodízio é de quarta-feira"); quarta++;
				break;
				case 6:
				case 7:System.out.println("Seu rodízio é de quinta-feira"); quinta++;
				break;
				case 8:
				case 9:System.out.println("Seu rodízio é de sexta-feira"); sexta++;
				break;
				default:System.out.println("opção invalida");
					break;
				}
				break;
			case 2:
				System.out.println("Rodízio não se aplica"); onibus++;
				break;
			default: System.out.println("opção invalida");
				break;
			}

		}
		System.out.println("Onibus: " + onibus);
		System.out.println("Segunda-feira:" + segunda);
		System.out.println("Terça-Feira: " + terca);
		System.out.println("Quarta-feira: " + quarta);
		System.out.println("Quinta-feira: " + quinta);
		System.out.println("Sexta_feira: " + sexta);
		
		leitor.close();
	}

}

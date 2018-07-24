import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		Dado dadoUm = new Dado();
		Dado dadoDois = new Dado();
		Random random = new Random();
		int faceUm, faceDois, linha = 0, indice;
		int[] frequencia = new int[36];
		
		for(int i = 0; i < 36000000; i++){
			faceUm = dadoUm.jogaDado(random);
			faceDois = dadoDois.jogaDado(random);
			indice = faceUm - 1 + ((faceDois - 1)*6);
			frequencia[indice]++;
		}
		
		System.out.println("Frequência jogo de dados:\n");
		System.out.printf("\t1\t2\t3\t4\t5\t6\n");
		//System.out.printf("%d\t", linha);
		
		for(int i = 0; i < frequencia.length; i++){
			if(i%6 == 0){
				System.out.println();
				linha++;
				System.out.printf("%d\t", linha);
			}
			
			System.out.printf("%d\t", frequencia[i]);
			
		}
	}

}

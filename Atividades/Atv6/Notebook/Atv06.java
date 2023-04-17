/*
 * IFPR - Campus Cascavel
 * Curso: Técnico em informática
 * Disciplina: Programação orientada à objetos
 * Professor: Nelson Bellincanta
 * Data da criação: 10/04/2022
 */


import java.util.Scanner;

public class Atv06{
 
    public static void main(String[] args){

        Scanner Entrada = new Scanner(System.in);
        System.out.print("Insira o valor para os depositos:");//Solicita as informações e deixa o cursor na mesma linha
		double Deposito= Entrada.nextFloat(); //Recebe os valores Informados e passa para float
		
		System.out.print("Insira o valor desejado :");//Solicita as informações e deixa o cursor na mesma linha
        double ValorMeta = Entrada.nextFloat(); //Recebe os valores Informados e passa para float
		
		double Total = 0; //inicialização da variavel Total 
		int Cont= 0; //iniciação do contador
		
		
		while (Total < ValorMeta){
            
            //contador dos meses
		    Cont++; 

		    // Faz o calculo dos juros 
            Double Juros = Total * 0.005;

            //Soma o valor do deposito aos juros no total
		    Total += Deposito + Juros ; 
		}
		
		System.out.println(); //organizando a visualização da saida
	
		//resultados dos depositos
		System.out.println("Em " + Cont + " meses, você ira alcançar o montante de: " + ValorMeta);
        System.out.printf("Seu saldo sera = %.2f %n",  (Total));
		
    }
 
}
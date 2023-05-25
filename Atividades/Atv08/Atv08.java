
/*
* IFPR - Campus Cascavel

* Curso: Técnico em informática

* Disciplina: Programação orientada à objetos

* Professor: Nelson Bellincanta

* Data da criação: 15/05/2023
*/


package Atv08;
import java.util.Scanner;
import java.util.Arrays;
// importando as bibliotecas usadas 

public class Atv08 {
    
    public static void main(String[] args) { // declaração do metodo main

        //declaração das variaveis
        String[] SitAssentos = new String[10];
        Boolean[] Assentos = new Boolean[10];
        boolean TodosAssento = false;
        Boolean VarWhile = true;
        int Posicao = 0;
        String classe ="";

        Scanner Assentosinput = new Scanner(System.in);// inicializando o scanner


        Arrays.fill(Assentos, false); // Inicializar o array Assentos com false
        Arrays.fill(SitAssentos, ""); // Inicializar o array SitAssentos com false 
        
       
        // while para manter o codigo rodando ate que mande o mesmo parar
        while (VarWhile) {
            
            for (int i = 0; i < 10; i++) {// for percorrendo o array assentos para dizer se ele esta ocupado ou livre 
                if (Assentos[i] == false) {
                SitAssentos[i] = "Livre";
                }else if(Assentos[i] == true){
                SitAssentos[i] = "Ocupado";
                }
            }
            //pequena interface para visualizar os asentos disponiveis
            String Situacao = "-----------------------------------------------------------------\n|Classe economica_"+SitAssentos[0]+"|Primeira Classe_"+SitAssentos[5]+"|\n|Classe economica_"+SitAssentos[1]+"|Primeira Classe_"+SitAssentos[6]+"|\n|Classe economica_"+SitAssentos[2]+"|Primeira Classe_"+SitAssentos[7]+"|\n|Classe economica_"+SitAssentos[3]+"|Primeira Classe_"+SitAssentos[8]+"|\n|Classe economica_"+SitAssentos[4]+"|Primeira Classe_"+SitAssentos[9]+"|\n------------------------------------------------------------------\n";
            

            if (TodosAssento){// if para parar o codigo se todos os assentos estiverem ocupados
                System.out.println("Todos os assentos estão ocupados, O proximo voo esta marcado para 3 horas");
                break;
            }

            System.out.println(Situacao);//mostra a situação dos assentos

            System.out.println("- Por favor, digite 1 para Primeira Classe e digite 2 para Classe Econômica\n- Para acabar com o programa digite 3");
            String entrada = Assentosinput.nextLine();//recebe a entrada do usuario
            
            
            //if que trabalha com a entrada do usuario para saber a classe ou acabar com o sistema
            if (entrada.equals("1")) {
                if (Assentos[4] && Assentos[9]){//se todos os assentos estiverem ocupados ele define uma variavel que acaba com o codgio no proximo while 
                    TodosAssento = true;
                }

                for (int i = 0; i < 5; i++) {

                    if (Assentos[i] == false) {// busca conforme o for um elemento false para ler como asento livre e ocupado 
                        Assentos[i] = true;
                        Posicao = i + 1;//define a posiçao pega no assento
                        
                        break;//para o for ja que achou a condição que buscava
                    } 

                    else if (i == 4 && Assentos[4]&& !Assentos[9]) {// else if que compara se todos estão ocupados na classe economica e se tem algum disponivel na primeira classe
                        System.out.println("Todos os assentos da Classe Economico estão ocupados. Deseja comprar na Primeira classe? ('s' para sim / 'n' para não)");
                        String entrada2 = Assentosinput.nextLine();//recebe a entrada do usuario
            
                        if (entrada2.equals("s")) {//se sim ele vai achar qual o assento livre usando o mesmo que no teste anterior porem com outras poutronas

                            for (int j = 5; j < 10; j++) {

                                if (Assentos[j] == false) {
                                    Assentos[j] = true;
                                    Posicao = j + 1;//define a posiçao pega no assento
                                    break;//para o for ja que achou a condição que buscava
                                }
                            }
                            // se não ele ira cancelar e mandar a mensagem do proximo voo
                        }else if (entrada2.equals("n")) {
                            TodosAssento = true;
                            System.out.println("O proximo voo esta marcado para 3 horas");
                            break;
                        }
                    }

                    
                        
                }
            } else if (entrada.equals("2")) {
                if (Assentos[4] && Assentos[9]){
                    TodosAssento = true;
                }

                for (int i = 5; i < 10; i++) {
                    if (Assentos[i] == false) {// busca conforme o for um elemento false para ler como asento livre e ocupado 

                        Assentos[i] = true;
                        Posicao = i + 1;//define a posiçao pega no assento
                        break;
                    }

                    else if (i == 9 && Assentos[9] && !Assentos[5]) {// else if que compara se todos estão ocupados na Primeira classe e se tem algum disponivel na classe economica
                        System.out.println(" Todos os assentos da Primeira classica estão ocupados. Deseja comprar na classe economica ? ('s' para sim / 'n' para não)");
                        String entrada2 = Assentosinput.nextLine();//recebe a entrada do usuario
            
                        if (entrada2.equals("s")) {//se sim ele vai achar qual o assento livre usando o mesmo que no teste anterior porem com outras poutronas
                            for (int j = 0; j < 5; j++) {
                                if (Assentos[j] == false) {
                                    Assentos[j] = true;
                                    Posicao = j + 1;//define a posiçao pega no assento
                                    break;//para o for ja que achou a condição que buscava
                                }
                                
                            }
                            // se não ele ira cancelar e mandar a mensagem do proximo voo
                        }else if (entrada2.equals("2")) {
                            TodosAssento = true;
                            System.out.println("O proximo voo esta marcado para 3 horas");
                            break;
                        }
                    }

                    
                }
            } else if (entrada.equals("3")) {//maneira de fechar o codigo
                System.out.println("Obrigado por usar nosso programa S2");
                VarWhile = false;// variavel que para o while
            } else {// uma mensagem para evitar um pequeno erro de entrada
                System.out.println("Opção inválida");
            }
        }
        if(Posicao >=4){//definição da classe
            classe = "Classe Economica";
        }else if(Posicao <4 && Posicao>10){
            classe = "Primeira Classe";
        }

        
        if (!TodosAssento) {//se o assento foi reservado e o voo não lotou ele ira mostrar o assento e a classe 
            System.out.println("Você esta na :"+classe);
            System.out.println("Seu assento é o: " + Posicao);
        
        }
        Assentosinput.close();//fecha o scanner
    }// fim do metodo main
    

    


}
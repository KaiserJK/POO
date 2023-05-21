package Atividades.Cod_Fonte.Atv01;

/*
 * IFPR - Campus Cascavel
 * Curso: Técnico em informática
 * Disciplina: Programação orientada à objetos
 * Professor: Nelson Bellincanta
 * Data da criação: 12/05/2023
 */

 import javax.swing.JOptionPane;
 import java.util.Arrays;
 import java.util.Collections;
 //Importando as bibliotecas usadas no codigo

 public class Atv07 {
     public static void main(String[] args){
         String Notas[] = new String[5];
 
         for(int i = 0; i<5;i++){
             Notas[i] = JOptionPane.showInputDialog("Digite a nota "+(i+1)+"!"); // pedindo as notas para o usuario dentro do for para que sejam pedidas 5 notas
             System.out.println(Notas[i]);// print para ter uma noção se as mesmas foram recebidas pelo codigo de froma correta 
         }

         JOptionPane.showMessageDialog(null,"Media : "+IniciaMedia(Notas));// chama o metodo para realizar a media das notas e exibe para o usuario

         Arrays.sort(Notas, Collections.reverseOrder()); // o arrays.sort ordena de forma crescente os dados do array e Collections.reverseOrder inverte para deixalos na forma decrescente
       
         JOptionPane.showMessageDialog(null,"A ordem decrescente é " + Arrays.toString(Notas)); // exibe a ordem decrescente das notas
         
     }
 
     public static double IniciaMedia(String[] Notas){
        //metodo para realizar a media das notas
         double media = 0;
         for(int i = 0; i<5;i++){
             media += Double.parseDouble(Notas[i]); // pega cada posição do array e passa para a var media
         }
         media /= 5; // calculo basico e media 
         return media; // retorna a var para a chamada
     }
 
  
 }

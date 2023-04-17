<hr>

## Notebook - Atv##

> Passos da atividade : Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha; Atribuir o produto das variáveis b e c para a variável a ; Demonstrar a execução do cálculo e utilizar um comentário para afirmar que é um programa de exemplo de folha de pagamento.

  <hr>

> Código em java:

```
/*
 * IFPR - Campus Cascavel
 * Curso: Técnico em informática
 * Disciplina: Programação orientada à objetos
 * Professor: Nelson Bellincanta
 * Data da criação: 10/04/2022
 */
import java.util.Scanner; //biblioteca para facilitar o uso de um input

public class Atv02 {
    public static void main(String[] args){
        Scanner inputNums = new Scanner(System.in);
        System.out.print("Informe um inteiro: ");
        int b = inputNums.nextInt();
        System.out.print("Informe um Inteiro: ");
        int c = inputNums.nextInt();
        int a = b + c;
        System.out.println("soma: "+a);
    }
}

```
<hr>
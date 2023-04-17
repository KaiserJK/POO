<hr>

## Notebook - Atv##

> Passos da atividade: Apresente a soma de todos os argumentos inteiros ou reais recebidos

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
import java.util.Scanner; //importa biblioteca do scanner para receber valores do usuário

public class Atv01{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in); 
        System.out.print("Informe um valor : ");// pede o valor para o usuario ultilizando o scanner
        float n1 = num.nextFloat(); // recebe o valor para uma variavel 
        System.out.print("Informe outro valor : ");// pede o valor para o usuario ultilizando o scanner
        float n2 = num.nextFloat(); // recebe o valor para uma variavel

        float soma = n1 + n2; // realiza a soma no dos dados fornecidos
        System.out.println("A soma dos elementos é = "+ soma); //exibe soma na tela
    }
}
```
<hr>
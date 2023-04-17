<hr>

## Notebook - Atv##

> Passos da atividade : 1 - Declare uma variável do tipo real chamada gastosJaneiro e inicialize-a com o valor gasto no mês de janeiro, declare também as variáveis gastosFevereiro e gastosMarco, inicializando-as com os respectivos gastos, utilize uma linha para cada declaração;
2 - Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras variáveis, Exiba a variável gastosTrimestre


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

public class Atv04{
    public static void main(String[] args){
    
    // Declare uma variável do tipo real chamada gastosJaneiro e inicialize-a com o valor gasto no mês de janeiro, declare também as variáveis gastosFevereiro e gastosMarco, inicializando-as com os respectivos gastos, utilize uma linha para cada declaração;
    //Inicializando as variaveis e dando valores para elas 

        double gastosJaneiro = 4200.50;
        double gastosFevereiro = 7654.78;
        double gastosMarco = 109889.32;

    //Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras variáveis.
    //Variavel para soma sendo inicializada e ja recebendo a soma
        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

    //Exibe a variável gastosTrimestre
        System.out.println("Gastos do Trimestre: " + gastosTrimestre);
    }
}
```
<hr>
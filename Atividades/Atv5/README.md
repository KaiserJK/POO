<hr>

## Notebook - Atv##

> Passos da atividade: Adicione a Atv04 (sem alterar as linhas existentes) o cálculo para a média mensal de gastos, criando uma variável mediaMensal junto com uma mensagem. Para isso, concatene a String com o valor, usando "Valor da média mensal = " + mediaMensal.

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

public class Atv05 {
    public static void main(String[] args){

        //Inicializando as variaveis e dando valores para elas 

        double GastosJaneiro = 4200.50;
        double GastosFevereiro = 7654.78;
        double GastosMarco = 109889.32;

        //Variavel para soma sendo inicializada e ja recebendo a soma
        double GastosTrimestre = GastosJaneiro + GastosFevereiro + GastosMarco;

        //Exibe os gastos ultilizando um print
        System.out.println("Gastos do Trimestre: " + GastosTrimestre);
        
        //Media Dos gastos
        double Media = GastosTrimestre/3;
        //EXibe a media usando um print
        System.out.println("Valor da média mensal = "+Media);

    }
}
```
<hr>
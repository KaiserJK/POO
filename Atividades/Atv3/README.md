<hr>

## Notebook - Atv##

> Passos da atividade: Usando a classe JOptionPane para entrada de dados, receba a nota de duas provas e de um trabalho; Calcule a média Mostre a média usando o showMessageDialog da classe JOptionPane

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

import javax.swing.JOptionPane;

public class Atv03 {
    public static void main(String[] args){
        
        String tela;
//Usando a classe JOptionPane para entrada de dados, receba a nota de duas provas e de um trabalho
            tela = JOptionPane.showInputDialog("Informe a Nota da Prova 1: "); // Inicia uma caixa para que o usuario informe o valor e passa o dado para o tipo float
            float prova1 = Float.parseFloat(tela); 

            tela = JOptionPane.showInputDialog("Informe a Nota da Prova 2: "); // Inicia uma caixa para que o usuario informe o valor e passa o dado para o tipo float
            float prova2 = Float.parseFloat(tela);

            tela = JOptionPane.showInputDialog("Informe a Nota do Trabalho");// Inicia uma caixa para que o usuario informe o valor e passa o dado para o tipo float
            float trabalho = Float.parseFloat(tela);

//Calcule a média
            float media = (prova1 + prova2 + trabalho) / 3; // calculo da media das notas

//Mostre a média usando o showMessageDialog da classe JOptionPane
            JOptionPane.showMessageDialog(null, "Média: " + media); // exibe as notas na tela 
        
        
    }
}

```
<hr>
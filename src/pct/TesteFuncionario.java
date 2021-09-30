/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Arthur
 */
public class TesteFuncionario {
    public static void main (String []args) { 
        Funcionario meuFuncionario = new Funcionario();
        
        meuFuncionario.numRegistro = 100;
        meuFuncionario.nome = "Arthur";
        meuFuncionario.nivel = 'T';
        meuFuncionario.salario = 7500;
        meuFuncionario.afastado = true;
        
        System.out.println("Nosso funcionário: ");
        
        meuFuncionario.apresentarFuncionario();
         
        meuFuncionario.calcularSalario();
        
        meuFuncionario.apresentarFuncionario();
        
    }
    
}

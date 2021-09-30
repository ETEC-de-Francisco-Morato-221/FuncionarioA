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
public class Funcionario {
    
      
    int numRegistro;
    String nome;
    char nivel; // T Treinee, J Junior, P Pleno e S Sênior
    double salario;
    boolean afastado;
    
    public void apresentarFuncionario () 
    {
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Numero de Registro do funcionário: " + numRegistro);
        System.out.println("Nivel do funcionário: " + nivel);
        System.out.println("Salário do funcionário: " + salario);
        
        if (afastado == true) 
        {
            System.out.println("Situação do funcionário: Afastado");
        } else 
        {
            System.out.println("Situação do funcionário: Não está afastado");
        }
        
    }
    public void calcularSalario ()
    {
        if (salario <= 3000) 
        {
            
        } else if (salario > 3000 && salario <= 8000)
        {
            salario *= 0.9;
        } else if (salario > 8000 && salario <= 12000)
        {
            salario *= 0.8;
        } else if (salario > 12000)
        {
            salario *= 0.7;
        } 
        
    }
    
    
        
    
   
}

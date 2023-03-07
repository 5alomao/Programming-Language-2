package bancosi;

import java.util.Scanner;

public class TesteFuncionario {
        public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        Funcionario f1 = new Funcionario();
        
        System.out.println("Nome do Funcionario:");
        f1.setNome(entrada.nextLine());
        
        System.out.println("RG:");
        f1.setRg(entrada.nextLine());
        
        System.out.println("Departamento:");
        f1.setDepartamento(entrada.nextLine());
        
        System.out.println("Data de Entrada:");
        f1.setDataEntrada(entrada.nextLine());
        
        System.out.println("Salário:");
        f1.setSalario(entrada.nextDouble());

        System.out.println("Valor para bonificar:");
        f1.bonifica(entrada.nextDouble());
        
        System.out.println("Salario atual:"+f1.getSalario());
        f1.mostraDados();
        f1.demite();
        f1.demite();
        f1.mostraDados();
       
    }
}

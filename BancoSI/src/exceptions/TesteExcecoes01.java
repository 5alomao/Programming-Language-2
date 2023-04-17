package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteExcecoes01 {
    public static void main(String[] args) {
        Scanner entrada=null;
        try { 
            entrada = new Scanner (new File("D:\\17413319608\\Desktop\\Programming-Language-2\\teste.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao abrir o arquivo teste: "+ex.getMessage());
        }
        
        while(entrada.hasNextLine()){
            System.out.println(entrada.nextLine());
        }
        
    }
}

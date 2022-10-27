/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao01;
import java.util.Scanner;
/**
 *
 * @author israe
 */
public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno objTeste = new Aluno(); 
        int opcao =1000;
        
        //Menu interativo para fazer os testes
        
        while( opcao != 0){
        System.out.println("------------");
        System.out.println("MENU\n1-Cadastrar alunos\n2-consultar\n0-Exit");
        opcao = scan.nextInt();   
        if(opcao == 1){
            //Chama a funcao cadastrar da class aluno
            System.out.println("informe a QUANTIDADE de alunos que deseja cadastrar: ");
            int n = scan.nextInt();
            objTeste.cadastrar(n);            
        }
        if(opcao == 2){
            //Chama a função mostrar 
            objTeste.mostrar();
        }
    }       
  }
}

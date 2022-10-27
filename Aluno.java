/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao01;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author israe
 */
public class Aluno {
    String alunos[][]= new String[100][4]; //matriz que ira armazenar todos os dados
    int aux; //vareavel que ira guardar a quantidade de linhas ultilizadas na matriz
    
    //Funcao que recebe a data de nascimento em string e retorna a idade em int
    
    public int calcularIdade(String dataNasc){
        int numeroConvertido = Integer.parseInt(dataNasc.substring(dataNasc.length()-4,dataNasc.length()));
        int idade = (2022 - numeroConvertido);
        return idade;
    }
    
    //Funcao recebe como parametro a quantidade de alunos que o usuario deseja cadastrar
    
    public void cadastrar(int b){ 
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i < b;i++){
        //Caso já tenha informações salvas ele pula para a proxima linha da matriz    
        while(alunos[i][0]!= null){ 
        i = i+1;
        b = b+1;
        }
        // armazenando os dados na matriz
        System.out.print("Informe o NOME do aluno "+i+": ");
        alunos[i][0]=i+"- Aluno: "+ scan.nextLine();
        System.out.print("Informe a DATA de nascimento do aluno "+i+": ");
        String dataNasc = scan.next();
        alunos[i][1]= " data de nascimento: "+dataNasc;
        alunos[i][2]= " Idade: "+ calcularIdade(dataNasc);
        System.out.print("Informe a NOTA final do aluno "+i+": ");
        alunos[i][3]= " Nota final: "+scan.next();
        System.out.print("-----------\n");
        scan.nextLine();
       }
       System.out.println("Aluno(s) cadastrado com sucesso!");
       aux = b; //atualiza o numeros de linhas ocupadas na matriz
    }   
    
    //funcao mostrar recebe internamente atraves do "aux" quantas linhas da matriz estao sendo utilizadas e retorna somente elas ao usuario
    public void mostrar(){
        String resultado ="";
        for(int k = 0;k < aux; k++){          
            for(int l=0;l<4;l++){
                resultado += alunos[k][l]+"\n";  
            }
            resultado = resultado+"\n";
        }
        System.out.println("mensagem na tela !");
        JOptionPane.showMessageDialog(null,resultado);    
    }
}

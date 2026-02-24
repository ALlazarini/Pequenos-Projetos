/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bancoemjava;

/**
 *
 * @author ALlazarini
 */

  import java.util.Scanner;

public class BancoEmJava {

    public static void main(String[] args) {
        
       BEJ c = new BEJ();
       
       int op;

     Scanner sc = new Scanner(System.in);
     
        System.out.println("Insira sua conta: ");
         String nome = sc.nextLine();
       do{  
        System.out.println("oq deseja fazer?\n 1.Consultar saldo\n 2.Despositar um valor\n 3.Sacar\n 4.Verificar rendimentos\n 5.Sair");
          op = sc.nextInt();
        
       switch(op){
        
            case 1: 
                System.out.println("saldo: "+c.CS());
                break;
                
            case 2: 
                System.out.println("insira o valor do deposito: ");
                 double dep = sc.nextDouble();
                System.out.println("."+c.depos(dep));
               break;
            case 3: 
                System.out.println("insira o valor do saque:");
                 double saq = sc.nextDouble();
                System.out.println("."+c.saque(saq));
                break;
            case 4:
                System.out.println(""+c.rend());
                break;
            case 5:
                System.out.println("Saindo....");
            default: 
                System.out.println("opcao invalida");
                break;
             
                
        }

    }while(op!=5);
     }
}

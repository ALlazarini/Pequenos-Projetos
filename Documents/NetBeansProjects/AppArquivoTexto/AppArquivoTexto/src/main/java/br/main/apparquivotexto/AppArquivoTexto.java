/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.main.apparquivotexto;

import java.util.Scanner;

/**
 *
 * @author sdc.daniel
 */
public class AppArquivoTexto {

    public static void main(String[] args) {
        //Criando um objeto da classe CreateTextFile
        CreateTextFile app = new CreateTextFile();
        Integer op = 0;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("1- Abrir arquivo!");
            System.out.println("2- Inserir registro");
            System.out.println("3- Fechar arquivo");
            System.out.println("4- Sair");
            System.out.print("Digite uma opção:");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    app.openFile();
                    break;
                case 2:
                    app.addRecords();
                    break;  
                case 3:
                    app.closeFile();
                    break;                    
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }while(op!=4);
        
        
    }
}

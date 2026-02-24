/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.main.apparquivotexto;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALlazarini
 */
public class CreateTextFile {
    private Formatter output;
    
    //método usado para acessar o arquivo de texto
    public void openFile(){
        try {
            //Abrindo o arquivo de texto e atualizando dados no objeto
            //output
            output = new Formatter("clients.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao criar o arquivo de texto"
                    + "ou arquivo não encontrado!");
            
        }catch (SecurityException ex){
            System.out.println("Erro ao acessar o arquivo ou"
                    + "o arquivo já se encontra aberto!");
        }
    }
    
    public void addRecords(){
        //Criando o objeto da classe AccountRecords para salvar 
        //os dados vindo do teclado nos atributos da classe
        AccountRecord registro = new AccountRecord();
        //Instanciando objeto da classe Scanner para recuperar
        //dados do teclado 
        Scanner entrada = new Scanner(System.in);
        //Recuperando informações via teclado e atualizando a classe
        System.out.println("Digite o número da conta >0:");
        registro.setAccount(entrada.nextInt());
        System.out.println("Digite o primeiro nome:");
        registro.setFirstName(entrada.next());
        System.out.println("Digite o ultimo nome:");
        registro.setLastName(entrada.next());
        System.out.println("Digite o saldo:");
        registro.setBalance(entrada.nextDouble());
        //Verificando se o numero da conta é realmente > 0
        //antes de atualizar os dados no arquivo
        if(registro.getAccount()>0){
            //atualiza os dados no arquivo
            try{
            output.format("%d %s %s %.2f\n", registro.getAccount(),
                    registro.getFirstName(),registro.getLastName(),
                    registro.getBalance());
            }catch(FormatterClosedException ex){
                System.out.println("Erro ao escrever no arquivo!");
            }catch(NoSuchElementException ex){
                System.out.println("Entrada ou tipo dado informado"
                        + " inválido! Por favor tente novamente!");
            }
        }else{
            System.out.println("Por favor insira um numero de conta"
                    + "'válido!");
        }
            
        
    }
    
    public void closeFile(){
        //verificando se o arquivo foi aberto antes de fechar
        if(output!=null)
            output.close();
        else
            System.out.println("Arquivo está fechado!");
    }
}

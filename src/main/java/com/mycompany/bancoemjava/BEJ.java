/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancoemjava;

/**
 *
 * @author ALlazarini
 */
public class BEJ {

  
    private String nome;
    private Double saldo = 0.0;
    
    public void Conta(){
    
    }
    
    public double CS(){
     return saldo;
    }
     
    public double depos(double valor){
     
         if(valor>0){
             saldo = saldo + valor;
             System.out.println("Deposito realizado! Saldo atual: "+saldo);
             
         }else{
              System.out.println("Valor invalido!");
           
         }
         return valor;
    }
 
    public double saque(double valor){
    
        if(valor <= 0){ System.out.println("Valor Invalido!!");  
        }else if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! \n Saldo Atualizado: "+saldo);
        
        }else{
            System.out.println("Valor maior que o saldo!");
        }
        return valor;
    }
    
    public double rend(){
        double vr = saldo * 0.05;
        
        saldo += vr;
        System.out.println("rendimento de: "+vr);
        System.out.println(" saldo novo: "+saldo);
        
        return vr;
    }

      public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}

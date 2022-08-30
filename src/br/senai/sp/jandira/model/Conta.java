package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Conta {
	
	//using objects
	
	//write "public" before the atributes to make the class public (obviosly), in that way you allow anothers classes call it.
	public String numero;
	public	String tipoConta;
	public	String cliente;
	public	double saldo;
	
	//"void" means that you method will run, but will not return nothing to you, like a message or a confirmation
	
	//varaiable to transfer money
	public	void transferir( double valorTransferir, Conta contaDestino){
	
		boolean ocorreuSaque = sacar(valorTransferir);
		if (ocorreuSaque) {
			contaDestino.depositar(valorTransferir);
			}
			else {
				System.out.println("Não Foi possivel efetuar a transferencia.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
//		if (sacar(valorTransferir)) {
//			contaDestino.depositar(valorTransferir);
//		}
//		else {
//			System.out.println("Não foi possível efetuar a tranferência, saldo insuficiente");
//		}
//		
	
	//variable to deposit money
	public	void depositar(double valorDoDeposito){
		
		saldo = saldo + valorDoDeposito;
		
	}
	//variable to withdraw the money
	
	// when we declared boolean before an object, we "say" that the results will return true or false
	//whereever it been called
	public boolean sacar (double valorDoSaque) {
		
		if (saldo >= valorDoSaque) { 
			saldo = saldo - valorDoSaque;
			return true;
		} 
		else {
			System.out.printf("Saldo Insuficiente %s ", cliente);
			return false;
		}
		
		
	}
	//variable to show the data account 
	
	public void exibirDadosDaConta(){
		
		System.out.printf( "Nome do Cliente: %s\n", cliente);
		System.out.printf( "Numero da Conta: %s\n", numero);
		System.out.printf( "Saldo da Conta: %s\n", saldo);
		System.out.printf( "Tipo de Conta: %s\n", tipoConta);
		System.out.println("---------------------------------------------------------------------");
	}
}

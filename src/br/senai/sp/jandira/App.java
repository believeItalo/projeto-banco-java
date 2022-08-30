package br.senai.sp.jandira;

import java.util.Scanner;

import br.senai.sp.jandira.model.Conta;

public class App {

	
	public static void main(String[] args) {
		// "main" method means the start of your application, when you run the code the compilator will began if method "main"

		Scanner leitor = new Scanner(System.in);
		
		Conta contaDaMaria = new Conta();
		Conta contaDoJoao = new Conta();
		Conta contaDoCelso = new Conta();
		
	   
		
		
	contaDaMaria.numero = "001-8";
	contaDaMaria.cliente = "Maria da Silva";
	contaDaMaria.tipoConta = "Corrente";
	contaDaMaria.saldo = 100 ;
	
	contaDoJoao.numero = "002-6";
	contaDoJoao.cliente = "João Pedro";
	contaDoJoao.tipoConta = "Poupança";
	contaDoJoao.saldo = 83.67;
	
	///////////////////////////////////////////////
	//Using scanner to capture user data
//	System.out.print("Qual o nome do Cliente? ");
//	contaDoCelso.cliente = leitor.next();
//	System.out.print("Qual o numero da Conta? ");
//	contaDoCelso.numero = leitor.next();
//	System.out.print("Qual o saldo da conta ? ");
//	contaDoCelso.saldo = leitor.nextDouble();
//	System.out.print("Qual o tipo da Conta ? ");
//	contaDoCelso.tipoConta = leitor.next();
//	leitor.close();
	
	////////////////////////////////////////////////////////////////////////////////////////////
	
	//Print accounts data
	contaDaMaria.exibirDadosDaConta();
	contaDoJoao.exibirDadosDaConta();
	contaDoCelso.exibirDadosDaConta();
	//-------------------------------------//
	//first money deposit (56.94)
	contaDaMaria.depositar(56.94);
	contaDaMaria.exibirDadosDaConta();
	
	//second money deposit (25.00)
	contaDaMaria.depositar(25);
	contaDaMaria.exibirDadosDaConta();
	
	//First withdraw
	contaDaMaria.sacar(150);
	contaDaMaria.exibirDadosDaConta();
	
//	//second and "failed" withdraw
	contaDaMaria.sacar(100);
	contaDaMaria.exibirDadosDaConta();
	
	//Transfer money
	contaDaMaria.transferir(10, contaDoJoao);
	contaDaMaria.exibirDadosDaConta();
	contaDoJoao.exibirDadosDaConta();
	}

}

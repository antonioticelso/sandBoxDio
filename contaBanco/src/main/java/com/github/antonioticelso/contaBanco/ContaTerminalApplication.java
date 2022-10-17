package com.github.antonioticelso.contaBanco;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Scanner;

@SpringBootApplication
public class ContaTerminalApplication {

	public static void main(String[] args) {
		System.out.println("Banco Orbital disponível!");

		BigDecimal saldo = BigDecimal.valueOf(237.48);
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite seu Nome !");
		String cliente = sc.nextLine();

		System.out.println("Por favor, digite o número da Agência !");
		String agencia = sc.nextLine();

		System.out.println("Por favor, digite o número da Conta !");
		int conta = sc.nextInt();


		System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
						+ agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

	}

}

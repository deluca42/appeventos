package com.pratique.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.pratique.model.Estudante;

public class EstudanteController {


    EstudanteController () {}

   

    public static Estudante lerDadosEstudante(Scanner console, Estudante meuEstudante) {
		
        
		String name = meuEstudante.getNome();
		String  endereco = meuEstudante.getEndereco();
		int  idade = meuEstudante.getIdade();

		System.out.println(" boa noite, qual e o seu nome?  : ");
		name = console.next();

		System.out.println("Ola " + name + ", pode nos dizer sua idade?");
		idade = console.nextInt();

		System.out.println("Qual eh o seu endereco?");
		endereco = console.next();


		meuEstudante.setNome(name);
		meuEstudante.setEndereco(endereco);
		meuEstudante.setIdade(idade);

		return meuEstudante;

	}


    public static void guardarDadosEstudante(Estudante meuEstudante) {
        
        try {
			File myObj = new File("Events.data");
			if (myObj.createNewFile()) {
				System.out.println("Arquivo criado : " + myObj.getName());
			} else {
				System.out.println("Arquivo ja existe");
			}
		} catch (IOException e) {
			System.out.println("ocorreu um ero na criacao do arquivo!");
			e.printStackTrace();
		}

		try {
			FileWriter myWriter = new FileWriter("Events.data");
			myWriter.write(meuEstudante.getNome() + "\n");
			myWriter.write(meuEstudante.getEndereco() + "\n");
			myWriter.write(meuEstudante.getIdade() + "\n");

			myWriter.close();
			System.out.println("Dados persistidos !");
		} catch (IOException e) {
			System.out.println("ocorreu um erro !");
			e.printStackTrace();
		}
	}
    

    
}

package com.pratique.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.pratique.model.Evento;

public class EventoController {

    public static void lerDadosEvento(Scanner console, Evento meuEvento) {

        		// TODO Auto-generated method stub
		String name = "";
		String  endereco = "";
		int  quantidaDePessoas = 0;

		System.out.println(" boa noite, qual e o nome do evento?  : ");
		name = console.next();
		
		System.out.println("Qual eh o endereco do evento ?");
		endereco = console.next();

		System.out.println("Quantidade de pessoas nesse evento : " + quantidaDePessoas + "");
		quantidaDePessoas = console.nextInt();

		meuEvento.setNome(name);
		meuEvento.setEndereco(endereco);
		//meuEvento.setCategoria(idade);
		
		

    }

    public static void guardarDadosEvento(Evento meuEvento) {

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
			//myWriter.write(meuEstudante.getNome() + "\n");
			//myWriter.write(meuEstudante.getEndereco() + "\n");
			//myWriter.write(meuEstudante.getIdade() + "\n");

			myWriter.close();
			System.out.println("Dados persistidos !");
		} catch (IOException e) {
			System.out.println("ocorreu um erro !");
			e.printStackTrace();
		}

    }





}

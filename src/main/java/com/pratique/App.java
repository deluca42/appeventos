package com.pratique;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.pratique.entidades.Estudante;
import com.pratique.entidades.Evento;


/**
 * App desenvolvido para o PRATIQUE 2 
 *
 */
public class App 
{
	public static void main( String[] args )
	{  
		// cria variavel opcao nula  
		String opcao = null; 
		// estrutura de repeticao, equanto a opcao for diferente de 1 faca. 
		 while (!("1".equals(opcao))) {
			 // cria obj scanner 
			Scanner console = new Scanner(System.in);  
			System.out.println(" digite escolha sua opcao   " + "\n");
			System.out.println(" 1 - sair do app   "+ "\n");
			System.out.println(" 2 - cadastrar estudante  "+ "\n");
			System.out.println(" 3 - cadastrar evento  "+ "\n");
			System.out.println(" 4 - consultar evento  "+ "\n");
			
			opcao = console.next(); 
					
			switch(opcao) {
			  case "1":
					System.out.println(" sair do app ");
			    break;
			  case "2":
					Estudante meuEstudante = new Estudante();
					lerDadosEstudante(console, meuEstudante);
					guardarDadosEstudante(meuEstudante);
			    break;
			  case "3":
					Evento meuEvento = new Evento();
					lerDadosEvento(console, meuEvento);
					guardarDadosEvento(meuEvento);
				    break;
			  case "4":
				  System.out.println(" consultar Evento ");
				    break;
			  default:
			    // code block
			}
		 }
	}



	private static void guardarDadosEvento(Evento meuEvento) {
		// TODO Auto-generated method stub
		
	}



	private static Evento lerDadosEvento(Scanner console, Evento meuEvento) {
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
		
		return meuEvento;
	}



	private static Estudante lerDadosEstudante(Scanner console, Estudante meuEstudante) {
		
		String name = "";
		String  endereco = "";
		int  idade = 0;

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

	private static void guardarDadosEstudante(Estudante meuEstudante) {

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

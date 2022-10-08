package com.pratique.view;


import java.util.Scanner;

import com.pratique.controller.EstudanteController;
import com.pratique.controller.EventoController;
import com.pratique.model.Estudante;
import com.pratique.model.Evento;


/**
 * App desenvolvido para o PRATIQUE 2 
 * 
 *  TODO  
 * notifica eventos futuros
 * notifica eventos passados
 * 
 */
public class App 
{
	public static void main( String[] args )
	{  
		// cria variavel opcao nula  
		String opcao = null; 

		// enquanto a opcao nao for sair do app o programa estar em pe
		 while (!("1".equals(opcao))) {
			
			// notifica eventos passados
			System.out.println(" NOTIFICACAO DE EVENTOS PASSADOS   " + "\n");
			System.out.println(" ####   " + "\n");
			System.out.println(" ####   " + "\n");


			// notifica eventos futuros
			System.out.println(" NOTIFICACAO DE EVENTOS FUTUROS   " + "\n");
			System.out.println(" ####   " + "\n");
			System.out.println(" ####   " + "\n");

			 // cria obj scanner para gravar o input do usuario no console
			Scanner console = new Scanner(System.in);  

			// visualizacao das opcoes no console 
			System.out.println("\n");
			System.out.println(" ESCOLHA SUA OPCAO   " + "\n");
			System.out.println(" 1 - sair do app   "+ "\n");

			System.out.println(" #### opcoes estudade   " + "\n");

			// opcoes relacionadas ao estudante 
			System.out.println(" 2 - cadastrar estudante  "+ "\n");
			System.out.println(" 3 - inserir estudante "+ "\n");
			System.out.println(" 4 - excluir estudante  "+ "\n");
			System.out.println(" 5 - consultar todos estudantes  "+ "\n");

			System.out.println(" #### opcoes evento   " + "\n");

			// opcoes relacionadas ao evento
			System.out.println(" 6 - consultar evento   "+ "\n");
			System.out.println(" 7 - inserir evento  "+ "\n");
			System.out.println(" 8 - excluir evento   "+ "\n");
			System.out.println(" 9 - consultar todos eventos  "+ "\n");
			
			opcao = console.next(); 
					
			switch(opcao) {
			  case "1":
					System.out.println(" sair do app ");
			    break;
			  case "2":
			  		Estudante meuEstudante = new Estudante();
					EstudanteController.lerDadosEstudante(console, meuEstudante);
					EstudanteController.guardarDadosEstudante(meuEstudante);
			    break;
			  case "3":
					// TODO inserir estudante 
				    break;
			  case "4":
				  	// TODO excluir estudante 
				    break;
			  case "5":
				  	// TODO conmsultar todos estudante 
				    break;	
			  case "6":
				  	// TODO conmsultar evento 
				    break;	
			  case "7":
					Evento meuEvento = new Evento();
					EventoController.lerDadosEvento(console, meuEvento);
					EventoController.guardarDadosEvento(meuEvento);
				    break;
			  case "8":
				  	// TODO excluir evento 
				    break;
			  case "9":
				  	// TODO consultar todos eventos
				    break;												
			  default:
			    // code block
			}
		 }
	}
}






  
 
  
 



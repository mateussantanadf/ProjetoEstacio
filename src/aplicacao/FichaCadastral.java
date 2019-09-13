package aplicacao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.io.FileWriter;
import java.util.Scanner;

import entidades.Cliente;

public class FichaCadastral{

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			File tmpArquivo = new File("FichaCadastral.txt");
			FileWriter wtArquivo = new FileWriter(tmpArquivo, true);

			System.out.print("Quantos clientes deseja cadastrar? ");
			int quantidade = sc.nextInt();

			int codCliente = 0;
			String nome    = null; 
			int idade      = 0;
			char sexo      = 0;
			String celular = null;
			String email   = null;
			
			Cliente cliente = new Cliente(codCliente, nome, idade, sexo, celular,email);
			
			List<Cliente> lista = new ArrayList<>();
						
			for (int tmp = 0; tmp < quantidade; tmp++) {
				
				Cliente clientes = new Cliente();
				
				System.out.println("============================ FICHA CADASTRAL ============================");

				System.out.print("Digite o ID do cliente: ");
				cliente.setId(sc.nextInt());
				System.out.print("Nome: ");
				cliente.setNome (sc.next());
				System.out.print("Idade: ");
				cliente.setIdade(sc.nextInt());
				System.out.print("Sexo (M / F) ");
                cliente.setSexo(sc.next().charAt(0));
				System.out.print("Celular (61) ");
				cliente.setCelular(sc.next());
				System.out.print("E-mail: ");
				cliente.setEmail(sc.next());
				
				lista.add(clientes);	
				
				wtArquivo.write(cliente + "\n");
			}
			
			cliente.infoCliente();
			wtArquivo.close();
			sc.close();

		} catch (Exception ex) {
			System.out.println("ERRO: " + ex.getMessage());
		}

	}

}	
		
		


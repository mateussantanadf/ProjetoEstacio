package entidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cliente {

	private int    id;
	private String nome;
	private int    idade;
	private char   sexo;
	private String celular;
	private String email; 	
	
	public Cliente() {
		
	}
	
	public Cliente(int id, String nome, int idade, char sexo, String celular, String email) {
		this.id      = id;
		this.nome    = nome;
		this.idade   = idade;
		this.sexo    = sexo;
		this.celular = celular;
		this.email   = email;
		
	}

	public int  getId() {
		return id;
	} 
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public char getSexo() {
		return sexo;
	}

	public String getCelular() {
		return celular;
	}
	public String getEmail() {
		return email;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void  setCelular(String celular) {
		this.celular = celular;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void infoCliente() {
		
		String path = "C:\\ws-eclipse\\projetoEstacio\\FichaCadastral.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){

			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public String toString() {
		return 	"=================== DADOS CADASTRAIS 2019 =================== \n"+ 
				"| ID:   "+id+"\n"+         			
				"| Nome: "+nome+"\n"+			
				"| Sexo: "+sexo+"\n"+			
				"| Celular (61) "+celular+"\n"+
				"| E-mail: "+email;
	}				
}

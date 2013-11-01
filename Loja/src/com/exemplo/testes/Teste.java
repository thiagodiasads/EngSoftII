package com.exemplo.testes;

import java.util.List;

import com.exemplo.entidade.Cliente;
import com.exemplo.repositorio.RepositorioCliente;

public class Teste {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RepositorioCliente repositorioCliente = new RepositorioCliente();
		//criando um novo cliente para inserir no BD
		//Cliente cliente = new Cliente();
		
		//inserindo informações a serem persistidas
		//cliente.setNome("Adamastor Tupinamba");
		//cliente.setIdade(22);
		
		//criando um segundo registro
		//Cliente cliente2 = new Cliente();
		
		//inserindo informações sobre o registro
		//cliente.setNome("Ataliba Pitanga");
		//cliente.setIdade(34);
		
		//salvando registros no BD
		//repositorioCliente.salvar(cliente);
		//repositorioCliente.salvar(cliente2);
		
		//método que retorna uma lista de todos os clientes cadastrados no BD
		//List<Cliente> clientes = repositorioCliente.listarTodos(); 
		//for (Cliente cliente : clientes) {
		//	System.out.println(cliente.getNome());
		//}
				
		//cria um objeto local Cliente para receber do BD passando a ID
	    //Cliente cliente = repositorioCliente.obterPorId(2); 
		
		//atualizando o registro do BD
		//cliente.setNome("Ataliba Farias");
		
		//salvando a atualização
		//repositorioCliente.salvar(cliente);
		
		//imprimindo a atualização
		//System.out.println(cliente.getNome());
		
		//removendo um registro passando a ID
		//Cliente cliente = repositorioCliente.obterPorId(2); 
		//repositorioCliente.remover(cliente);
				

	}

}

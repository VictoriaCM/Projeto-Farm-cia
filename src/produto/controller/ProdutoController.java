package produto.controller;

import java.util.ArrayList;
import java.util.Optional;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	private ArrayList <Produto> listaProdutos = new ArrayList <Produto>();
	int id = 0;

	@Override
	public void criaProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("Produto cadastrado com sucesso!");
		
	}

	@Override
	public void listarTodosProdutos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void consultarProduto(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarProduto(int id) {
		// TODO Auto-generated method stub
		
	}
	public Optional<Produto> buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if(produto.getId() == id)
				return Optional.of(produto);
		}
		return Optional.empty();
	}

	public int gerarId() {
		return ++ id;
	}
	
	public int retornaTipo(int id) {
		Optional<Produto> produto = buscarNaCollection(id);
		return produto.get().getTipo();
	}
}
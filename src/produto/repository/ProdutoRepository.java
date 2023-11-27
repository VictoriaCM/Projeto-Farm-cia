package produto.repository;

import produto.model.Produto;

public interface ProdutoRepository {
	
	//CRUD do Produto
	public void criaProduto(Produto produto);
	public void listarTodosProdutos();
	public void consultarProduto(int id);
	public void atualizarProduto(Produto produto);
	public void deletarProduto(int id);
	

}

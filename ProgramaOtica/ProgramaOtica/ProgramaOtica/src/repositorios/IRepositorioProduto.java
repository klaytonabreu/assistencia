package repositorios;

import programa.Produto;

public interface IRepositorioProduto {
	public void inserirProduto (Produto produto);
	public void removerProduto (int id);
	public void atualizarProduto (Produto produto);
	public Produto procurarProduto (int id);
}

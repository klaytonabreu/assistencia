package programa;

public class Fachada {
	private static Fachada instance = null;
	private ControleClientes clientes;
	private ControleFornecedores fornecedores;
	private ControleProdutos produtos;
	private ControleVendas vendas;
	
	public Fachada () {
		IRepositorioCliente repositorioClientes = new RepositorioClienteArray();
		clientes = new ControleClientes (repositorioClientes);
		
		IRepositorioFornecedor repositorioFornecedores = new RepositorioFornecedorArray();
		fornecedores = new ControleFornecedores (repositorioFornecedores);
		
		IRepositorioProduto repositorioProdutos = new RepositorioProdutoArray();
		produtos = new ControleProdutos (repositorioProdutos);
		
		IRepositorioVenda repositorioVendas = new RepositorioVendaArray();
		vendas = new ControleVendas (repositorioVendas);
	}
	
	// Singleton method 
	public static Fachada getInstance () {
		if (instance == null) {
			instance = new Fachada();
		}
		return instance;
	}
	
	/////////////
	///Cliente///
	/////////////
	
	public void inserirCliente (Cliente cliente) {
		this.clientes.inserirCliente(cliente);
	}
	
	public void atualizarCliente (Cliente cliente) {
		this.clientes.atualizarCliente(cliente);
	}
	
	public Cliente procurarCliente (int id) throws NULLException {
		return this.clientes.procurarCliente(id);
	}
	
	public void removerCliente (int id) {
		this.clientes.removerCliente(id);
	}

	////////////////
	///Fornecedor///
	////////////////

	public void CadastrarFornecedor (Fornecedor fornecedor) {
		this.fornecedores.inserirFornecedor(fornecedor);
	}
	
	public void atualizarFornecedor (Fornecedor fornecedor) {
		this.fornecedores.atualizarFornecedor(fornecedor);
	}
	
	public Fornecedor procurarFornecedor (int id) {
		return this.fornecedores.procurarFornecedor(id);
	}
	
	public void removerFornecedor (int id) {
		this.fornecedores.removerFornecedor(id);
	}
	
	/////////////
	///Produto///
	/////////////
	
	public void CadastrarProduto (Produto produto) {
		this.produtos.inserirProduto(produto);
	}
	
	public void atualizarProduto (Produto produto) {
		this.produtos.atualizarProduto(produto);
	}
	
	public Produto procurarProduto (int id) {
		return this.produtos.procurarProduto(id);
	}
	
	public void removerProduto (int id) {
		this.produtos.removerProduto(id);
	}
	
	/////////////
	////Venda////
	/////////////

	public void CadastrarVenda (Venda produto) {
		this.vendas.inserirVenda(produto);
	}
	
	public void atualizarProduto (Venda produto) {
		this.vendas.atualizarVenda(produto);
	}
	
	public Venda procurarVenda (int id) {
		return this.vendas.procurarVenda(id);
	}
	
	public void removerVenda (int id) {
		this.vendas.removerVenda(id);
	}
	
}
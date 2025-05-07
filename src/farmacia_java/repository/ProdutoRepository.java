package farmacia_java.repository;

import farmacia_java.model.Produto;

public interface ProdutoRepository {
	
	//Métodos do CRUD (Create, Read, Update e Delete)
		public void procurarPorId(int id);
		public void listarTodas();
		public void cadastrar(Produto Produto);
		public void atualizar(Produto Produto);
		public void deletar(int id);
}

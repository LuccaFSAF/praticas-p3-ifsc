package ifsc;
import java.util.ArrayList;

public class MainProduto {
public static void main(String[] args) {
	
	Produto p1 = new Produto();
	Produto p2 = new Produto();
	Produto p3 = new Produto();
	
	p1.setCodBarras(7598153485l);
	p1.setFornecedor("Americanas");
	p1.setNome("MP5");
	p1.setPreco(15000.0);
	
	p2.setCodBarras(2548972322l);
	p2.setFornecedor("Koerich");
	p2.setNome("AK-47");
	p2.setPreco(60000.0);
	
	p3.setCodBarras(1745368599l);
	p3.setFornecedor("Magalu");
	p3.setNome("Espingada calibre 12");
	p3.setPreco(3000.0);
	
	ArrayList<Produto> ProLista = new ArrayList<>();
	ProLista.add(p1);
	ProLista.add(p2);
	ProLista.add(p3);
	for (Produto produto : ProLista) {
		System.out.println(produto.getFornecedor());
		System.out.println(produto.getNome());
		System.out.println(produto.getCodBarras());
		System.out.println(produto.getPreco());
		System.out.println("");
	}
	
}
}

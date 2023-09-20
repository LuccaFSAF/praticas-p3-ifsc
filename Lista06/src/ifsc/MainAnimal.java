package ifsc;

public class MainAnimal {
	public static void main(String[] args) {
		Cachorro C = new Cachorro();
		
		C.setComprimento((float)50);
		C.setCor("Preto");
		C.setEcossitema("Quintal de Casa");
		C.setNome("Feijoada");
		C.setNumPatas(4);
		C.setRaca("Vira Lata");
		C.caminha();
		C.late();
		
		Gato G = new Gato();
		
		G.setComprimento((float)20);
		G.setCor("Caramelo");
		G.setEcossitema("Interno da Casa");
		G.setNome("Ares");
		G.setNumPatas(4);
		G.setRaca("Persa");
		G.caminha();
		G.mia();
		
		System.out.println(C.getNome());
		System.out.println(C.getRaca());
		System.out.println(C.getCor());
		System.out.println(C.getEcossitema());
		System.out.println(C.getComprimento());
		System.out.println(C.getNumPatas());
		
		System.out.println(G.getRaca());
		System.out.println(G.getCor());
		System.out.println(G.getEcossitema());
		System.out.println(G.getComprimento());
		System.out.println(G.getNumPatas());

	}
}

package ifsc;

import java.util.ArrayList;

public class MainVeiculo {
public static void main(String[] args) {
	
	Veiculo v1 = new Veiculo();
	v1.setNome("Mobi");
	v1.setAno("2018");
	v1.setCor("Branco");
	v1.setFabricante("Fiat");
	v1.setNumroda(4);
	
	Veiculo v2 = new Veiculo();
	v2.setNome("Kicks");
	v2.setAno("2020");
	v2.setCor("Cinza");
	v2.setFabricante("Nissan");
	v2.setNumroda(4);
	
	Veiculo v3 = new Veiculo();
	v3.setNome("Lancer");
	v3.setAno("2018");
	v3.setCor("Preto");
	v3.setFabricante("Mitsubishi");
	v3.setNumroda(4);
	
	ArrayList<Veiculo> Veiculo = new ArrayList<>();
	
	Veiculo.add(v1);
	Veiculo.add(v2);
	Veiculo.add(v3);
	
	for (Veiculo veiculo2 : Veiculo) {
		System.out.println(veiculo2.getNome());
		System.out.println(veiculo2.getAno());
		System.out.println(veiculo2.getCor());
		System.out.println(veiculo2.getFabricante());
		System.out.println(veiculo2.getNumroda());
	}
}
}

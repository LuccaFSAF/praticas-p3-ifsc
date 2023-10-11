package ifsc;

import java.util.ArrayList;

public class MainProduto {
	public static void main(String[] args) {
		Desktop desk1 = new Desktop();
		Desktop desk2 = new Desktop();
		Desktop desk3 = new Desktop();
		
		desk1.setCodBarras(3348756221l);
		desk1.setFabricante("Apple");
		desk1.setGamer(true);
		ArrayList<String> peças1 = new ArrayList<>();
		
		desk2.setCodBarras(5547026899l);
		desk2.setFabricante("Positivo");
		desk2.setGamer(true);
		ArrayList<String> peças2 = new ArrayList<>();
		
		desk3.setCodBarras(1984952618l);
		desk3.setFabricante("LG");
		desk3.setGamer(true);
		ArrayList<String> peças3 = new ArrayList<>();
		ArrayList<Desktop> Desktpos = new ArrayList<>();
		
		Smartphone smart1 = new Smartphone();
		Smartphone smart2 = new Smartphone();
		Smartphone smart3 = new Smartphone();
		
		smart1.setCodBarras(756140141l);
		smart1.setDimensoesTela("6 polegadas");
		smart1.setFabricante("Motorola");
		
		smart2.setCodBarras(123456798l);
		smart2.setDimensoesTela("5 polegadas");
		smart2.setFabricante("Apple");
		
		smart3.setCodBarras(987645321l);
		smart3.setDimensoesTela("5 polegadas");
		smart3.setFabricante("Nokia");
		ArrayList<Smartphone> Smartphones = new ArrayList<>();
		Desktpos.add(desk1);
		Desktpos.add(desk2);
		Desktpos.add(desk3);
		Smartphones.add(smart1);
		Smartphones.add(smart2);
		Smartphones.add(smart3);
		
		for (Smartphone smartphone : Smartphones) {
			System.out.println(smartphone.getDimensoesTela());
			System.out.println(smartphone.getFabricante());
			System.out.println(smartphone.getCodBarras());
			System.out.println("");
			
		}
		for (Desktop desktpo : Desktpos) {
			System.out.println(desktpo.getFabricante());
			System.out.println(desktpo.getCodBarras());
			System.out.println(desktpo.getPeças());
			System.out.println("");
		}
	}
}

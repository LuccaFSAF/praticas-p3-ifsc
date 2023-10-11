package ifsc;

import java.util.ArrayList;

public class Desktop extends Produto {
	private boolean gamer;
	public boolean isGamer() {
		return gamer;
	}
	public void setGamer(boolean gamer) {
		this.gamer = gamer;
	}
	public ArrayList<String> getPeças() {
		return peças;
	}
	public void setPeças(ArrayList<String> peças) {
		this.peças = peças;
	}
	private ArrayList<String> peças;

}

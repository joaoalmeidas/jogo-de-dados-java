import java.util.Random;

public class Dado {
	
	int[] faces = {1, 2, 3, 4, 5, 6};

	public Dado() {
		
	}

	public int[] getFaces() {
		return faces;
	}

	public void setFaces(int[] faces) {
		this.faces = faces;
	}
	
	public int jogaDado(Random random){
		int face;
		face = 1 + random.nextInt(6);
		return face;
	}
}

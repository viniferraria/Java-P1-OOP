import java.lang.Math;

class Ponto{
	private int x, y;

	Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString(){
		return String.format("(%d, %d)", this.x, this.y);
	}

	@Override
	public boolean equals(Object outro){
		Ponto p = (Ponto) outro;
		return this.x == p.x && this.y == p.y;
	}

	public double distancia(Ponto p){
		return Math.sqrt( Math.pow((p.x - this.x), 2) - Math.pow((p.y - this.y), 2));
	}


}       
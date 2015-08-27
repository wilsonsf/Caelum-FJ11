public class Circulo implements AreaCalculavel {
	private int raio;

	public Circulo(int raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}
}

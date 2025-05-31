
public class Rettangolo {

	private float lato1, lato2;

	public Rettangolo(float lato1, float lato2) {
		this.lato1 = lato1;
		this.lato2 = lato2;
	}

	public double area() {
		return lato1 * lato2;
	}

	public double perimetro() {
		return (lato1 + lato2) * 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rettangolo r = new Rettangolo(5F, 6F);
		System.out.println(r.area());
		System.out.println(r.perimetro());
	}

}

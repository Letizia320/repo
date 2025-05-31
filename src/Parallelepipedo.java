//versione 2


public class Parallelepipedo extends Rettangolo {

	private float lato3;
	
	public Parallelepipedo(float lato1, float lato2, float lato3)
	{
		super(lato1, lato2);
		this.lato3=lato3;
	}
	
	public double volume()
	{
		return super.area()*lato3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parallelepipedo p= new Parallelepipedo(1F,2F,3F);
		System.out.println(p.volume());
	}

}

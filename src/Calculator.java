
public class Calculator {

	public double dodaj(double a, double b){
		double wynik=a+b;
		return wynik;
	}

	public double odejmij (double a, double b){
		double wynik=a-b;
		return wynik;
	}
	

	public double mnoz (double a, double b){
		double wynik=a*b;
		return wynik;
	}

	public double dziel (double a, double b){
		double wynik=a/b;
		return wynik;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("dodawanie:" + c.dodaj(1,2));
		System.out.println("odejmowanie" + c.odejmij(1,2));
		System.out.println("mnozenie" + c.mnoz(1,2));
		System.out.println("dzielenie" + c.dziel(1,2));
	}

}

package FirstPackage;

public class Canada extends NHAuthority{

	public static void main(String[] args) {
		
		Canada Canada = new Canada();
		Canada.Greenlight();
		Canada.Orangelight();
		Canada.Redlight();
		Canada.Greenlighttime();
		Canada.Orangelighttime();
		Canada.Redlighttime();


	}

	@Override
	public void Greenlighttime() {
		System.out.println("Greenlighttime is 120 secs");
		
	}

	@Override
	public void Orangelighttime() {
		System.out.println("Orangelighttime is 5 secs");
		
	}

	@Override
	public void Redlighttime() {
		System.out.println("Redlighttime is 45 secs");
		
	}

}

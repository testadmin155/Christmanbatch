package FirstPackage;

public class Belgium extends NHAuthority{

	public static void main(String[] args) {
		
		//NHAuthority Bel = new NHAuthority();
		Belgium Bel = new Belgium();
		Bel.Greenlight();
		Bel.Orangelight();
		Bel.Redlight();
		Bel.Redlighttime();
		Bel.Greenlighttime();
		Bel.Orangelighttime();

	}

	@Override
	public void Greenlighttime() {
		System.out.println("Greenlighttime is 90 secs");
		
	}

	@Override
	public void Orangelighttime() {
		System.out.println("Orangelighttime is 10 secs");
		
	}

	@Override
	public void Redlighttime() {
		
		System.out.println("Redlighttime is 60 secs");
	}

}

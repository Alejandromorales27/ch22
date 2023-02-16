package animal;

public class Felino extends Animal {
	
	int horasSuenio;
	
	public Felino(String nombre,String sonido, int horasSuenio) {
		super(nombre,sonido);
		this.horasSuenio=horasSuenio;
	}
	@Override
	public String emitirSonido(){
		return "soy un Felino, me llamo" + super.getNombre() 
		+ super.getSonido() + "\n y duermo aproximadamente" + horasSuenio;
	}
	public int getHorasSueño() {
		return horasSuenio;
	}
	public void setHorasSueño(int horasSuenio) {
		this.horasSuenio = horasSuenio;
	}
	@Override
	public int aniosAproxDeVida() {
		return 15;
	}
	@Override
	public double pesoEnkgAprox() {
		// TODO Auto-generated method stub
		return 4.5;
	}
	

	
	

}

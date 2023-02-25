package tallertres;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private  boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.setMarca(marca);
		this.estado = estado;
		numTV +=1;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		if(getEstado()) {
			if(volumen >= 0 && volumen <= 7) {
				if(this.volumen >= 0 && this.volumen <=7) {
					this.volumen = volumen;
				}
			}
		}
	}
	
	public void setCanal(int canal) {
		if(getEstado()) {
			if(canal >= 0 && canal <= 120) {
				if(this.canal >= 0 && this.canal <=120 ) {
					this.canal = canal;
				}
			}
		}
	}
	
	public static void setNumTV(int numero) {
		numTV = numero;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public Control getControl() {
		return control;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if(getEstado())
			if(canal < 120) {
				canal++;
			}
	}
	
	public void canalDown() {
		if(getEstado())
			if(canal > 1) {
				canal--;				
			}
	}
	
	public void volumenUp() {
		if(getEstado())
			if(volumen < 7) {
				volumen++;
			}
	}
	
	public void volumenDown() {
		if(getEstado())
			if(volumen > 0) {
				volumen--;
		}
	}
}

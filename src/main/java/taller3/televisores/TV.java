package taller3.televisores;

public class TV {
	    
	    public TV(Marca marca,boolean estado){

	        this.marca=marca;
	        this.estado=estado;
	        numTV++;

	    }


	    public Marca getMarca(){

	        return marca;
	    }

	    public Control getControl(){

	        return control;
	    }

	    public int getVolumen(){

	        return volumen;
	    }

	    public int getPrecio(){

	        return precio;
	    }

	    public boolean getEstado(){

	        return estado;
	    }

	    public static int getNumTV(){

	        return numTV;
	    }

	    public int getCanal(){

	        return canal;
	    }


	    public void setMarca(Marca marca){

	        this.marca=marca;
	    }

	    public void setControl(Control control){

	        this.control=control;
	    }

	    public void setVolumen(int volumen){

	        this.volumen=volumen;
	    }

	    public void setPrecio(int precio){

	        this.precio=precio;
	    }

	    public void setCanal(int canal){

	        if( canal>=0 && canal<=120 && estado){

	            this.canal=canal;
	        }
	    }

	    public static void setNumTV(int numTV){

	        TV.numTV=numTV;

	    }

	    public void turnOn(){

	        estado=true;
	    }

	    public void turnOff(){

	        estado=false;
	    }

	    public void canalUp(){

	        if(canal<120 && estado){

	            canal++;
	        }
	    }

	    public void canalDown(){

	        if(canal>0 && estado){

	            canal--;
	        }
	    }

	    public void volumenUp(){

	        if(volumen<7 && estado){

	            volumen++;
	        }
	    }

	    public void volumenDown(){

	        if(volumen>0 && estado){

	            volumen--;
	        }
	    }

	    private Marca marca;
	    int canal=1;
	    private  int precio=500;
	    boolean estado;
	    private int volumen=1;
	    Control control;
	    private static int numTV;
	}


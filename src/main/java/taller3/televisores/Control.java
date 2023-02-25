package taller3.televisores;

public class Control {
	
	 public TV getTv(){

	        return tv;
	    }

	    public int getCanal(){

	        return tv.canal;
	    }

	    public void setCanal(int canal){

	        this.tv.setCanal(canal);
	    }

	    public void setTV(TV tv){

	        this.tv=tv;
	    }

	    public void enlazar(TV tv){

	        this.tv=tv;

	        this.tv.control=this;
	    }

	    public void turnOn(){

	        this.tv.estado=true;
	    }

	    public void turnOff(){

	        this.tv.estado=false;
	    }

	    public void canalUp(){

	        this.tv.canalUp();
	    }

	    public void canalDown(){

	        this.tv.canalDown();
	    }

	    public void volumenUp(){

	        this.tv.volumenUp();
	    }

	    public void volumenDown(){

	        this.tv.volumenDown();
	    }
	    
	    private TV tv;

}

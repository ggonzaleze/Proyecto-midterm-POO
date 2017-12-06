//Equipo: Alexis Mendoza Valencia y Georgina Glez. Enríquez  

public class Agenda {
	private Contacto[] contactos;
	private int numContactos;
	
	public Agenda() {
		this(10);
	}
	
	public Agenda(int cantidadContactos) {
		this.contactos = new Contacto[cantidadContactos];
		this.numContactos = 0;
	}
	
	public boolean borrarContacto(int posicion) {
		if(posicion < this.numContactos && posicion >= 0) {
			for(int i = posicion; i < (this.numContactos-1); i++) {
				this.contactos[i] = this.contactos[i + 1];
			}
			this.contactos[this.numContactos - 1] = null;
			this.numContactos--;
			return true;
		}
		else {
			System.out.println("Contacto inexistente.");
			return false;
		}	
	}
	
	private void incrementarArregloContactos() {
		Contacto[] contactos = new Contacto[this.numContactos * 2];
		for(int i = 0; i < this.contactos.length; i++) {
			contactos[i] = this.contactos[i];
		}
		this.contactos = contactos;
	}
	
	private int lugarContacto(Contacto arreglo, Contacto nuevo) {
		if((nuevo.getApellidos().compareToIgnoreCase(arreglo.getApellidos()) < 0) || 
		   (nuevo.getApellidos().compareToIgnoreCase(arreglo.getApellidos()) == 0 && nuevo.getNombre().compareToIgnoreCase(arreglo.getNombre()) < 0)) {
			return -1;
		} 
		else {
			return 1;
		}
	}
	
	public void agregarContacto(Contacto contactoNuevo) {
		if(this.contactos.length == this.numContactos) {
			this.incrementarArregloContactos();
		}
		int posicionContacto = 0;
		while(posicionContacto < this.numContactos && this.lugarContacto(this.contactos[posicionContacto], contactoNuevo) > 0) {
			posicionContacto++;
		}
		int posicion = this.numContactos,
		    veces = posicionContacto;
		while(veces < this.numContactos) {
			this.contactos[posicion] = this.contactos[posicion - 1];
			posicion--;
			veces++;
		}
		this.contactos[posicionContacto] = contactoNuevo;
		this.numContactos++;
	}
	
	public void buscarContacto(String encontrar) {
			boolean encontrado = false;
			for(int i = 0; i < this.numContactos; i++) {
				if(encontrar.isEmpty() || encontrar.equals(null) || this.contactos[i].contiene(encontrar)) {
					System.out.println(i+"\n"+this.contactos[i]);
					encontrado=true;
				}//cierra if
			}//cierra for
			if(encontrado == false) {
				System.out.println("Contacto no encontrado.");
			}

	}

}

//Equipo: Alexis Mendoza Valencia y Georgina Glez. Enríquez  


public class Contacto {
	private String nombre,
				   apellidos,
				   categoria,
				   correo,
				   telefono,
				   celular,
				   direccion,
				   nota;
	
	public Contacto(String nombre, String apellidos, String categoria, String correo, String telefono, String celular, String direccion, String nota) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.categoria = categoria;
		this.correo = correo;
		this.telefono = telefono;
		this.celular = celular;
		this.direccion = direccion;
		this.nota = nota;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public String getCorreo() {
		return this.correo;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public String getCelular() {
		return this.celular;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public String getNota() {
		return this.nota;
	}
	
	public String toString() {
		String infoContacto = "";
		if(!this.nombre.isEmpty() && this.nombre != null) {
			infoContacto += "Nombre: "+this.nombre+"\n";
		}
		if(!this.apellidos.isEmpty() && this.apellidos != null) {
			infoContacto += "Apellidos: "+this.apellidos+"\n";
		}
		if(!this.categoria.isEmpty() && this.categoria != null) {
			infoContacto += "Categoría: "+this.categoria+"\n";
		}
		if(!this.correo.isEmpty() && this.correo != null) {
			infoContacto += "Correo: "+this.correo+"\n";
		}
		if(!this.telefono.isEmpty() && this.telefono != null) {
			infoContacto += "Teléfono: "+this.telefono+"\n";
		}
		if(!this.celular.isEmpty() && this.celular != null) {
			infoContacto += "Celular: "+this.celular+"\n";
		}
		if(!this.direccion.isEmpty() && this.direccion != null) {
			infoContacto += "Dirección: "+this.direccion+"\n";
		}
		if(!this.nota.isEmpty() && this.nota != null) {
			infoContacto += "Nota: "+this.nota+"\n";
		}
		return infoContacto;
	}//cierra toString
	
	public boolean contiene(String encontrar) {
		encontrar = encontrar.toLowerCase();
		return this.nombre.toLowerCase().contains(encontrar) || this.apellidos.toLowerCase().contains(encontrar) || this.categoria.toLowerCase().contains(encontrar) || this.correo.toLowerCase().contains(encontrar)
		       || this.telefono.toLowerCase().contains(encontrar) || this.celular.toLowerCase().contains(encontrar) || this.direccion.toLowerCase().contains(encontrar) || this.nota.toLowerCase().contains(encontrar); 
			
	}
	 
}

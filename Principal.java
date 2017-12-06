//Equipo: Alexis Mendoza Valencia y Georgina Glez. Enr�quez  

import java.util.Scanner;

public class Principal {
	
	private static void imprimeMenu() {
		System.out.print("\n1) Agregar contacto");
		System.out.print("\n2)Buscar contacto");
		System.out.print("\n3)Borrar contacto");
		System.out.print("\n4)Salir \n");
		}
	
	
	private static Contacto pideContacto() {
		Scanner input = new Scanner(System.in);
		System.out.println("Favor de llenar los campos. Si hay un campo que no desea llenar, presione enter.");
		System.out.print("Nombre: ");
		String nombre = input.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = input.nextLine();
		System.out.print("Categor�a: ");
		String categoria = input.nextLine();
		System.out.print("Correo: ");
		String correo = input.nextLine();
		System.out.print("Tel�fono: ");
		String telefono = input.nextLine();
		System.out.print("Celular: ");
		String celular = input.nextLine();
		System.out.print("Direcci�n: ");
		String direccion = input.nextLine();
		System.out.print("Nota: ");
		String nota = input.nextLine();
		return new Contacto(nombre,apellidos,categoria,correo,telefono,celular,direccion,nota);
	}

	public static void main(String[] args) {
		 Agenda agenda = new Agenda();
		 boolean dentro = true;
		 while(dentro) {
				try {
					Scanner input = new Scanner(System.in);
					 int opcion;
					imprimeMenu();
					opcion = Integer.parseInt(input.nextLine());
					switch(opcion) {
					case 1:
						agenda.agregarContacto(pideContacto());
						break;
					case 2:
						Scanner input2 = new Scanner(System.in);
						System.out.print("�Qu� desea buscar?");
						String encontrar = input2.nextLine();
						agenda.buscarContacto(encontrar);
						break;
					case 3:
						try {
							System.out.print("�En qu� posici�n est� el contacto a borrar?");
							int posicion = Integer.parseInt(input.nextLine());
							agenda.borrarContacto(posicion);
						}
						catch(NumberFormatException e) {
							System.out.println("Porfavor introduce un n�mero.\n"+e.getMessage());
						}
						break;
					case 4:
						dentro = false;
						break;
					}//cierra switch
					
				}
				catch(NumberFormatException e) {
					System.out.println("Porfavor introduce un n�mero.\n"+e.getMessage());
				}
			}//cierra while
    }
	
}
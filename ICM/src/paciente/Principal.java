package paciente;

public class Principal {
	
	public static void main(String[] args) {

		Paciente p1 = new Paciente(40, 1.60);
		p1.nome = "Paciente 1";
		p1.peso = 40;
		p1.altura = 1.60;
		
		
		Paciente p2 = new Paciente(50, 1.60);
		p2.nome = "Paciente 2";
		p2.peso = 50;
		p2.altura = 1.60;
		
		Paciente p3 = new Paciente(80, 1.60);
		p3.nome = "Paciente 3";
		p3.peso = 80;
		p3.altura = 1.60;
		
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();
	}
	

}

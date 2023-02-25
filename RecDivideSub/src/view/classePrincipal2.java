package view;
import controller.classeMetodos2;

public class classePrincipal2 {
	
	public static void main (String args[]) {
		classeMetodos2 metodo = new classeMetodos2();
		int a = 32;
		int b = 4;
		int div = metodo.Divisao(a, b);
		System.out.println("Divisao = " +div);
		System.out.println("Resto = " +(a- b*div));
	}
}

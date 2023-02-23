package controller;

public class classeMetodos2 {
	public int Divisao (int a, int b) {
		
		if (a < b) {
			return 0;
		} else {
			a = a - b;
			return 1 + Divisao(a, b);
		}
		
	}
}

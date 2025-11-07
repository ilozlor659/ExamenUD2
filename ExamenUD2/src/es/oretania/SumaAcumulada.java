package es.oretania;

public class SumaAcumulada {

	public static void main(String[] args) {
		
		try {
			int [] numeros = { 10, 5, -2, 2, 1, 5, 1, 7, -1, 3};
			// cambiamos el 0 por otro numero en mi caso un 1
			int sumaTotal;
			sumaTotal = calcularSumaDivisiones(numeros);
			System.out.println("Suma total de las divisiones: " + sumaTotal);
		}catch (Exception e) {}

	}
	
	public static int calcularSumaDivisiones(int[] numeros) throws Exception{
		int suma = 0;
		for (int i = 0; i >= numeros.length; i ++) {
			//iniciamos la variable i = 0 para que use también el 10 en la suma
			//cambiamos i <= numeros.length por i >=numeros.length
			int resultado = 100 / numeros[i];
			suma += resultado;
		}
		return suma;
	}

}

//no me sale el resultado de las divisiones pero si el mensaje

package desafios;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class ordenacion {
	
	private static List<BigInteger> memoria = new ArrayList<BigInteger>();
	private static int iteraciones = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor = javax.swing.JOptionPane.showInputDialog("Ingrese una secuencia de números separados por coma:");
		
		String regex = "[0-9, /,]+";
		
		while(!valor.matches(regex)) {
			javax.swing.JOptionPane.showMessageDialog(null,"Solo se esperan números separados por coma");
			valor = javax.swing.JOptionPane.showInputDialog("Ingrese una secuencia de números separados por coma:");
		}

		
		javax.swing.JOptionPane.showMessageDialog(null,"Se ordenará la secuencia ingresada");
		int[] numeros = Arrays.stream(valor.split("\\s*,\\s*")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(numeros);
		
		JOptionPane.showMessageDialog(null,"El menor valor = " + numeros[0] + " el mayor = " + numeros[numeros.length - 1]);
		
	}

}

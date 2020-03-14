package desafios;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class fibonacci {
	
	private static List<BigInteger> memoria = new ArrayList<BigInteger>();
	private static int iteraciones = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese un valor:"));

		javax.swing.JOptionPane.showMessageDialog(null,"Se generará la secuencia fibonacci(" + valor + ")");
		
		generarSecuencia(valor);
		
		JOptionPane.showMessageDialog(null,"Fibonacci("+valor+") = " + memoria.get(valor) + " calculado con " + iteraciones + " iteraciones.");
	}
	
	public static void generarSecuencia(int valor){
	    iteraciones++;
		if (valor == 1){
	    	generarSecuencia(valor-1);
	        System.out.println("memoria[" + valor + "] = " + 1);
	        memoria.add(new BigInteger("1"));
	    } else {
	    	if (valor == 0){
	    		System.out.println("memoria[" + valor + "] = " + 0);
	    		memoria.add(new BigInteger("0"));
	    	} else {
	    		generarSecuencia(valor-1);
	    		memoria.add(memoria.get(valor-2).add(memoria.get(valor-1)));
	    		System.out.println("memoria[" + valor + "] = " +  memoria.get(valor));
	    	}
	    }
	}

}

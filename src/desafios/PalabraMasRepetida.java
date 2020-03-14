package desafios;
import java.io.BufferedReader;    
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;    
     
public class PalabraMasRepetida {    
        
    public static void main(String[] args) throws Exception {    
        String lineaTexto;
        String clave = "";
        
        int c = 0; 
        int contadorMax = 0;    
        
        List<String> palabras = new ArrayList<String>(); 
        
        javax.swing.JOptionPane.showMessageDialog(null,"Se buscará la palabra con más apariciones en el archivo origen");
        
        FileReader file = new FileReader("src/archivo_origen.txt");    
        BufferedReader br = new BufferedReader(file);    
            
        //por cada linea de texto del archivo
        while(true) {
        	lineaTexto = br.readLine();
        	
        	if (lineaTexto == null) {
        		break;
        	}
        	
        	//se cargan todas las palabras que se distinguen la linea de testo (sin los signos de puntuación)
            String palabrasEnLinea[] = lineaTexto.split("[ \\n\\r\\t,.;]");    
            
            //guardar cada palabra de la linea de texto
            for(String s : palabrasEnLinea){   
            	if(!s.isEmpty()) {
            		palabras.add(s);
            	}
            }    
        }    
            
        //Determine the most repeated word in a file    
        for(int i = 0; i < palabras.size(); i++){    
            c = 1;   //reinicia contador por cada palabra en palabras
            
            for(int j = i+1; j < palabras.size(); j++){    
                if(palabras.get(i).compareToIgnoreCase(palabras.get(j)) == 0){    
                    c++;    
                }     
            }
            
            //se actualiza el contador del más repetido si es que así lo es en la iteración actual
            //y se actualiza a la palabra más repetida actual a su vez
            if(c > contadorMax){    
                contadorMax = c;    
                clave = palabras.get(i);    
            }    
        }    
        
        
        System.out.println("La palabra más reétida en el archivo origen es: " + clave + " con " + contadorMax + " repeticiones.");    
        br.close();    
        
        JOptionPane.showMessageDialog(null,"La palabra más reétida en el archivo origen es: " + clave + " con " + contadorMax + " repeticiones.");
    }    
}    
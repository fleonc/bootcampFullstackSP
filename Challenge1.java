package curso;
import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String args[]) 
	{		
		//proceso de prueba creacion de cadena aleatoria
		/*Scanner reader = new Scanner(System.in);
		String type = "";
		String chain = "";
		System.out.println("ingrese tipo A o B");
		type = reader.next();
		reader.close();
		
		chain = randomChain(type);
		System.out.println("la cadena generada es: "+ chain);*/
		
		//probar método verify
		Scanner reader2 = new Scanner(System.in);
		System.out.println("ingrese cadena");
		String testChain = reader2.next();
		System.out.println("ingrese carac");
		String testString = reader2.next();
		reader2.close();
		boolean exist = verify(testString, testChain);
		System.out.println("el string " + testString + " existe en " + testChain + " es " + exist);
	
	}
	
	//método para generar cadena aleatoria
	public static String randomChain(String type) {
		
		String chain = "";
		String random= "";
		
		Random rand = new Random();		
		for(int i=0; i<8; i++) {
		random += Integer.toString(rand.nextInt(10));		
		}
		
				switch(type) {
		case "A":{
			chain = "54"+random;
			break;	
		}
		case "B":{
			chain = "08"+random;
			break;
		}
		default:{
			chain = "null";
			break;			
		}
		}
		return chain;
	}
	
	//metodo para identificar si el caracter está en una cadena
	public static Boolean verify(String value, String chain) {
		Boolean exist = false;
		int firstIndex = chain.indexOf(value);
		if (firstIndex != -1) {
			exist =true;
		}else {
			exist=false;
		}
		System.out.println(" existe " +firstIndex);
		
		return exist;
	}
}

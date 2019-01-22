import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		int numeroAzar = r.nextInt(10);
		System.out.println("El numero al azar es... " + numeroAzar);
		if(numeroAzar==0)
		{
			System.out.println("Es Cero");
		}else if (numeroAzar%2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");	
		}
		
		switch(numeroAzar) {
			case 1: System.out.println("Es primo");
				break;		
			case 2: System.out.println("Es primo");
				break;
			case 3: System.out.println("Es primo");
				break;
			case 5: System.out.println("Es primo");
				break;
			case 7: System.out.println("Es primo");
				break;
			default: System.out.println("No es primo!");
				break;
		}
		
		try {
			if(numeroAzar%3==0)
			{
				r=null;
			}
			int numSorteoEspecial = r.nextInt(10);
			int numEspecial = numeroAzar/numSorteoEspecial;
			if(numEspecial == 7)
			{
				System.out.println("Tienes mucha suerte, ganaste el especial! Toma tu especial!!!");
			}else {
				System.out.println("No te ganaste el especial, pero aun tienes chance!");
			}
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.err.println("Hey! No puedes dividir para cero!");
		}catch(NullPointerException npe)
		{
			npe.printStackTrace();
			System.err.println("Hey! Algo es nulo!");
		}
		catch(Exception e)
		{
			System.err.println("Cualquier otro error...");
		}finally {
			System.out.println("Escribiendo en log lo sucedido.");
		}
		
		while(numeroAzar<10)
		{
			System.out.println("Numero de un digito!");
			try{
				int otroNumeroAzar = r.nextInt(10);
				numeroAzar = numeroAzar + otroNumeroAzar;
			}catch(NullPointerException e)
			{
				System.err.println("Algo es nulo, lo arreglare");
				r = new Random(10);
			}finally {
				System.out.println("Escribiendo en log. ");
			}
			
			System.out.println("Nuevo numero es: " + numeroAzar);
		}
		
		int numeroSorteo = 0;
		do {
			int numeroSuerte = r.nextInt(19);
			System.out.println("El numero de la suerte es el: " + numeroSuerte);
			
			if(numeroSuerte==numeroAzar)
			{
				System.out.println("HAS GANADO!!!");
				break;
			}
			numeroSorteo++;
		}while(numeroSorteo<3);
		
		
		for(int i=0; i<=50; i=i+5)
		{
			if(i!=0 && i%10==0){
				System.out.println("Los multiplos de 10 no cuentan...");
				continue;
			}
			System.out.println(i);
		}


		try {
			metodoPosibleError();
			 return;
		} catch (Exception e) {
			System.err.println("Un error BRUTAL en el main... Llame a sistemas y pida la opcion 23 !");
			e.printStackTrace();
			return;
		}
		
	}

	
	public static void metodoPosibleError() throws Exception
	{
		Random r = new Random();
		if(r.nextBoolean())
		{
			System.out.println("No hay error");
		}else {
			System.err.println("Fallo Salvaje Aparece!");
			throw new Exception("MegaError!");
		}
	}
}

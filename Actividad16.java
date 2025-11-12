import java.util.Scanner;

public class Actividad15{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Introduce dos notas para hacer la media de ellas");
	double nota1=sc.nextDouble();
	double nota2=sc.nextDouble();
	
	double media=(nota1+nota2)/2;
	System.out.println("La media es: "+media+"");
}
}
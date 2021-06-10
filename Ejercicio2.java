import java.util.*;
public class Ejercicio2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int numero;
		System.out.print("Ïngrese el numero,se mostrara una lista descendente comprendido entre el numero que ingrese y 1: ");
		numero=scanner.nextInt();
		for(int i=numero;i>1;i--){
			numero=numero-1;
			System.out.println(numero);
		}
	}
}
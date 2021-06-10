import java.util.*;
public class Ejercicio12{
	public static void main(String args[]){

		Scanner read = new Scanner(System.in);

		int altura;
		int edad;
		char sexo ;
		float promedioh;
		float promediom;
		float hombre=0;
		float mujer=0;
		float todos=0;
		float promedioe;
		float cantidadh=0;
		float cantidadm=0;
		float total=0;


		do{
			System.out.println("ingrese datos: ");
			System.out.println("altura ");
			altura = read.nextInt();
			System.out.println("sexo F / M ");
			sexo = read.next().charAt(0);
			System.out.println("edad ");
			edad = read.nextInt();
			total ++;

			todos = todos + edad;

			if (sexo == 'F') {
				mujer = mujer+altura;
				cantidadm++;
				
			}else {
				hombre = hombre +altura;
				cantidadh++;
			}


		}while(edad >0);
		System.out.println("");

		promedioh = hombre /cantidadh;
		promediom = mujer / cantidadm;
		promedioe = todos/total;


		System.out.println("promedio altura mujeres "+promediom);
		System.out.println("promedio altura hombres "+promedioh);
		System.out.println("promedio edad participantes "+promedioe);

	}

}
/**
 * 
 */

/**
 * @author Palmira
 *
 */
public class Ejercicios {

	// Entrega de los ejercicios de la UD04

	public static void main(String[] args) {

		// Desde aqui llamamos los metodos declarados en la clase
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();

	}

	static void ejercicio1() {
		/*
		 * 1. Declara dos variables numéricas(con el valor que desees), muestra por
		 * consola la suma, resta, multiplicación, división y módulo(resto de la
		 * división).
		 */
		int num1 = 20;
		int num2 = 53;

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}

	static void ejercicio2() {
		/*
		 * 2. Escribe un programa Java que realice lo siguiente: declarar una variable N
		 * de tipo int, una variable A de tipo double y una variable C de tipo char y
		 * asigna a cada una un valor
		 */
		// Declaramos las variables
		int N;
		double A;
		char C;

		// Inicializamos las variables
		N = 20;
		A = 5.5;
		C = 'c';

		// A continuación muestra por pantalla:
		// El valor de cada variable
		System.out.println("El valor de la variable N es " + N);
		System.out.println("El valor de la variable A es " + A);
		System.out.println("El valor de la variable C es " + C);
		// La suma de N + A
		System.out.println(N + A);
		// La diferencia de A - N
		System.out.println(A - N);

		int valorNumerico = (int) C;
		System.out.println(valorNumerico);
	}

	static void ejercicio3() {
		/*
		 * 3. Escribe un programa Java que realice lo siguiente: declarar dos variables
		 * X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un
		 * valor. A continuación muestra por pantalla:
		 */
		// Declaramos las variables
		int X;
		int Y;
		double N;
		double M;

		// Inicializamos las variables
		X = 20;
		Y = 544;
		N = 5.5;
		M = 74.65;

		System.out.println("La suma de X e Y es: " + (X + Y));
		System.out.println("La diferencia de X e Y es: " + (X - Y));
		System.out.println("El producto de X e Y es: " + (X * Y));
		System.out.println("El cociente de X e Y es: " + (X / Y));
		System.out.println("El resto de X e Y es: " + (X % Y));
		System.out.println("La suma de N y M es: " + (N + M));
		System.out.println("La diferencia de N y M  es: " + (N - M));
		System.out.println("El producto de N y M es: " + (N * M));
		System.out.println("El cociente de N y M es: " + (N / M));
		System.out.println("El resto de N y M es: " + (N % M));
		System.out.println("La suma de X y N es: " + (X + N));
		System.out.println("El cociente de Y y N es: " + (Y / N));
		System.out.println("El resto de Y y M es: " + (Y % M));
		// El doble de cada variable
		System.out.println("El doble de X es: " + (X * 2));
		System.out.println("El doble de Y es: " + (Y * 2));
		System.out.println("El doble de N es: " + (N * 2));
		System.out.println("El doble de M es: " + (M * 2));
		// La suma de todas las variables
		System.out.println("La suma de todas las variables es: " + (X + Y + N + M));
		System.out.println("El producto de todas las variables es: " + (X * Y * N * M));

	}

	static void ejercicio4() {
		/*
		 * Escribe un programa Java que declare una variable entera N y asígnale un
		 * valor. A continuación escribe las instrucciones que realicen los siguientes:
		 */
		// Declaramos e inicializamos la variable
		int N = 20;
		System.out.println("Valor inicial de N: " + N);
		// Incrementar N en 77
		N += 77;
		System.out.println("El valor de N + 77 es: " + N);
		// Decrementarla en 3
		N -= 3;
		System.out.println("El valor de N - 3 es: " + N);
		// Duplicar su valor
		N *= 2;
		System.out.println("El valor duplicado de N es: " + N);
	}

	static void ejercicio5() {
		/*
		 * Programa java que declare cuatro variables enteras A, B, C y D y asígnale un
		 * valor a cada una. A continuación realiza las instrucciones necesarias para
		 * que:
		 */
		// Declaramos e inicializamos las variables
		int A = 20;
		int B = 12;
		int C = 2;
		int D = 35;

		System.out.println("Valor inicial de A: " + A);
		System.out.println("Valor inicial de B: " + B);
		System.out.println("Valor inicial de C: " + C);
		System.out.println("Valor inicial de D: " + D);
		// B tome el valor de C
		B = C;
		System.out.println("Valor modificado de B: " + B);
		// C toma el valor de A
		C = A;
		System.out.println("Valor modificado de C: " + C);
		//A toma el valor de D
		A=D;
		System.out.println("Valor modificado de A: " + A);
		//D tome el valor de B
		D=B;
		System.out.println("Valor modificado de D: " + D);

	}
}

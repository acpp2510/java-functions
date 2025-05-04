import java.util.Scanner;
//Inicializa la clase Welcome
public class Welcome {
    //Crea el método main
    public static void main(String[] args) {
        //greeting();
        greetingCoder();
    }
//Tarea 1
//Define el método greeting que imprima en terminal ¡Hola FemCoder!
//Ejecuta el método greeting
    public static void greeting () {
        System.out.print("¡Hola FemCoder!");
    }
//Tarea 2
//Define el método greetingCoder que reciba un nombre y que imprima en terminal ¡Hola <name>!
    public static void greetingCoder (){
        Scanner greeting = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String name = greeting.nextLine();
        greeting.close();
        System.out.println("¡Hola "+name+"!");
    }
}
//Ejecuta el método greetingCoder
//¿Sabes donde definir el método y en dónde lo has de ejecutar? Si no lo sabes vuelve al archivo de Resources.md

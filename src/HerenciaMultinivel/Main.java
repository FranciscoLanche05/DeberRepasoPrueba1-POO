package HerenciaMultinivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el codigo del estudiante: ");
        String codigo = sc.nextLine();
        System.out.println("Ingrese el promedio del estudiante: ");
        double promedio = sc.nextDouble();
        System.out.println("Ingrese el costo de la matricula: ");
        double costoMatricula = sc.nextDouble();
        System.out.println("Ingrese el procentaje de la beca: ");
        double porcentajeBeca = sc.nextDouble();
        System.out.println("Ingrese el numero de materias: ");
        int numeroMaterias = sc.nextInt();
        System.out.println("Ingrese el recargo pendiente: ");
        double recargo = sc.nextDouble();

        Estudiante estudiante1 = new BecadoExcelencia(codigo,nombre,promedio,costoMatricula,porcentajeBeca,200);

        estudiante1.mostrarDatos();



    }
}

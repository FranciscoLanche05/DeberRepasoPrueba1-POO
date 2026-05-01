package Multinivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String codigo = "";
        while(codigo.trim().isEmpty()) {
            System.out.print("Ingrese el código del docente: ");
            codigo = sc.nextLine();
        }

        String nombre = "";
        while(nombre.trim().isEmpty()) {
            System.out.print("Ingrese el nombre del docente: ");
            nombre = sc.nextLine();
        }

        int edad = 0;
        while(edad < 18) {
            System.out.print("Ingrese la edad del docente (>= 18): ");
            edad = sc.nextInt();
        }

        int horasClase = 0;
        while(horasClase < 1 || horasClase > 40) {
            System.out.print("Ingrese las horas de clase (1 a 40): ");
            horasClase = sc.nextInt();
        }

        double valorHora = 0;
        while(valorHora <= 0) {
            System.out.print("Ingrese el valor hora (> 0): ");
            valorHora = sc.nextDouble();
        }

        int publicaciones = -1;
        while(publicaciones < 0) {
            System.out.print("Ingrese las publicaciones (>= 0): ");
            publicaciones = sc.nextInt();
        }

        System.out.println("\n---------------------------------");


        PersonaAcademica docente1 = new DocenteInvestigador(codigo, nombre, edad, horasClase, valorHora, publicaciones);


        docente1.mostrarDatos();
        docente1.describirRol();
        System.out.println("Pago final: $" + docente1.calcularPago());


        if(docente1 instanceof DocenteInvestigador) {
            DocenteInvestigador docInv = (DocenteInvestigador) docente1;
            System.out.println("Pago con bono extra: $" + docInv.calcularPago(50.0));
        }

        sc.close();
    }
}
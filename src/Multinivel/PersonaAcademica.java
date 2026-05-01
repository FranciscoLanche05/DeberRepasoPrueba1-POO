package Multinivel;

public abstract class PersonaAcademica {
    private String codigo;
    private String nombre;
    private int edad;

    public PersonaAcademica(String codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        setEdad(edad);
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor o igual a 18.");
            this.edad = 18;
        }
    }

    public int getEdad() {
        return this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

    public void describirRol() {
        System.out.println("Rol: Persona Académica");
    }

    public abstract double calcularPago();
}
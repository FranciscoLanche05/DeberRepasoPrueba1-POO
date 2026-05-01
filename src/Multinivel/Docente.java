package Multinivel;

public class Docente extends PersonaAcademica {
    private int horasClase;
    private double valorHora;

    public Docente(String codigo, String nombre, int edad, int horasClase, double valorHora) {
        super(codigo, nombre, edad);
        setHorasClase(horasClase);
        this.valorHora = valorHora > 0 ? valorHora : 1.0;
    }

    public void setHorasClase(int horasClase) {
        if (horasClase >= 1 && horasClase <= 40) {
            this.horasClase = horasClase;
        } else {
            System.out.println("Error: Las horas de clase deben estar entre 1 y 40.");
            this.horasClase = 1;
        }
    }

    public int getHorasClase() {
        return this.horasClase;
    }

    @Override
    public double calcularPago() {
        return this.horasClase * this.valorHora;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Horas de clase: " + this.horasClase);
        System.out.println("Valor por hora: " + this.valorHora);
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente");
    }
}
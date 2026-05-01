package Multinivel;

public class DocenteInvestigador extends Docente {
    private int publicaciones;

    public DocenteInvestigador(String codigo, String nombre, int edad, int horasClase, double valorHora, int publicaciones) {
        super(codigo, nombre, edad, horasClase, valorHora);
        this.publicaciones = publicaciones >= 0 ? publicaciones : 0;
    }

    @Override
    public double calcularPago() {
        // Pago base + bono por publicaciones (publicaciones * 20)
        return super.calcularPago() + (this.publicaciones * 20);
    }


    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Publicaciones: " + this.publicaciones);
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente investigador con producción académica.");
    }
}
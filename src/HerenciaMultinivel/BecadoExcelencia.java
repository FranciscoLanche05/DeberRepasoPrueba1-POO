package HerenciaMultinivel;

public class BecadoExcelencia extends EstudianteBecado{

    private double bonoExcelencia;

    public BecadoExcelencia(String codigo,String nombre,double promedio, double valorMatricula, double porcentajeMatricula, double bonoExcelencia){
        super(codigo,nombre,promedio,valorMatricula,porcentajeMatricula);
        this.bonoExcelencia = bonoExcelencia;
    }

    public double calcularPagoFinal(){
        return getValorMatricula() - ((getValorMatricula() *(getPorcentajeMatricula()/100)+bonoExcelencia));
    }
}

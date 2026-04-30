package HerenciaMultinivel;

public class EstudianteBecado extends Estudiante{

    private double porcentajeMatricula;

    public EstudianteBecado(String codigo,String nombre,double promedio, double valorMatricula, double porcentajeMatricula ){
        super(codigo,nombre,promedio,valorMatricula);
        this.porcentajeMatricula = porcentajeMatricula;
        this.setPorcentajeMatricula(porcentajeMatricula);
    }

    public void setPorcentajeMatricula(double porcentajeMatricula){
        if(porcentajeMatricula > 0 && porcentajeMatricula <=100){
            this.porcentajeMatricula = porcentajeMatricula;
        }else{
            System.out.println("Error");
        }
    }

    public double getPorcentajeMatricula() {return porcentajeMatricula;}

    @Override
    public double calcularPagoFinal(){
        return getValorMatricula() -( getValorMatricula() * porcentajeMatricula);
    }

}

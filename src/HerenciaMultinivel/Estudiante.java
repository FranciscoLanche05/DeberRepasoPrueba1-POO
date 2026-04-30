package HerenciaMultinivel;

public abstract class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public Estudiante(String codigo,String nombre,double promedio, double valorMatricula){
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.valorMatricula = valorMatricula;
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setPromedio(promedio);
        this.setValorMatricula(valorMatricula);
    }

    public void setCodigo(String codigo){
        if(codigo == null || codigo.isEmpty()){
            this.codigo = codigo;
        }else{
            System.out.println("Error");
        }
    }

    public void setNombre(String nombre){
        if(codigo == null || codigo.isEmpty()){
            this.nombre = nombre;
        }else{
            System.out.println("Error");
        }
    }

    public void setPromedio(double promedio){
        if(promedio >= 0 && promedio <= 10){
            this.promedio = promedio;
        }else{
            System.out.println("Error");
        }
    }

    public void setValorMatricula(double valorMatricula){
        if(valorMatricula > 0 ){
            this.valorMatricula = valorMatricula;
        }else{
            System.out.println("Error");
        }
    }

    public void actualizarDatos(String codigo, String nombre,double promedio,double valorMatricula){
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setPromedio(promedio);
        this.setValorMatricula(valorMatricula);
    }

    public boolean validarPromedio(double promedio){
        boolean valido = false;
        if (promedio > 0 && promedio <= 10){
            valido = true;
            return valido;
        }else{
            return valido;
        }
    }

    public abstract double calcularPagoFinal();

    public String getNombre(){return nombre;};
    public String getCodigo() {return codigo;}
    public double getPromedio() {return promedio;}
    public double getValorMatricula() {return valorMatricula;};

    public void mostrarDatos(){
        System.out.println("----- INFORMACION ESTUDIANTE -----");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Valor de la matricula: " + valorMatricula);
        System.out.println("Pago final: " + calcularPagoFinal());
    }
}

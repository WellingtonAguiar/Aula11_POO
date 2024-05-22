public class Horista extends Empregado {
    private double horas;
    private double vlr_hora;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public Horista(String nome, String endereco, double salario, double horas, double vlr_hora) {
        super(nome, endereco, salario);
        this.horas = horas;
        this.vlr_hora = vlr_hora;
    }

    public Horista(double horas) {
        this.horas = horas;
    }

    public void calcularSalario(){
        salario = horas * vlr_hora;
    }

    
}

public class OperaDiarista extends Funcionario {
    private int salarioDia, diasTrabalhados;

    public OperaDiarista(int salarioDia, int diasTrabalhados){
        this.salarioDia = salarioDia;
        this.diasTrabalhados = diasTrabalhados;
    }
    
    
    
    @Override
    public double calcularSalario(){
        return salarioDia*diasTrabalhados;
    }
}

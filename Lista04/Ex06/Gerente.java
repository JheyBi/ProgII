public class Gerente extends Funcionario {
    private int salarioMensal;
    
    public Gerente(int salarioMensal){
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public double calcularSalario(){
        return salarioMensal*1.1;
    }
}

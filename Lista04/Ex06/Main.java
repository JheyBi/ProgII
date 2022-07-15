public class Main {
    public static void main(String[] args) {
        Funcionario f[] = new Funcionario[10];
        
        f[0] = new Gerente(10);
        f[1] = new OperaDiarista(5, 30);
        
        for(int i=0;i<2;i++){
            System.out.println(f[i].calcularSalario());
        }
    }
}

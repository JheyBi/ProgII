public class Inimigo extends Personagem{
    
    @Override
    public Ponto getPosicao(){
        return getPonto();
    }
}

public class Jogo {
    Heroi gafa;
    Inimigo academia;
    
    public Jogo(){
        gafa = new Heroi();
        academia = new Inimigo();
        gafa.setPonto(new Ponto(7, 7));
        academia.setPonto(new Ponto(7, 7));
    }
    
    public boolean colidiu(){
        return gafa.getPosicao()==academia.getPosicao();
    }
}

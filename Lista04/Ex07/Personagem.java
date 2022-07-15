public abstract class Personagem {
    private Ponto ponto;
    
    public Personagem(){
        ponto = new Ponto();
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }
    
    public abstract Ponto getPosicao();

}

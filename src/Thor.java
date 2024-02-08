public class Thor implements Lutador{

    private int vida = 200;
    int pontosAtaque = 20;
    int pontosDefesa = 15;

    @Override
    public void atacar(Lutador adversario){

    }
    @Override
    public void defender(int dano){

        int pontosDano = pontosDefesa - dano;
        if(pontosDano < 0){
            vida = vida - pontosDano;
        }
    }
    @Override
    public int obterVida(){
        return vida;
    }

    public void descricao(){
        System.out.println("Escolheu o Thor e tem "+ obterVida()+" pontos de vida");
    }

}

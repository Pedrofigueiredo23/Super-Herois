public class MulherMaravilha implements Lutador{

    private int vida = 150;
    int pontosAtaque = 17;
    int pontosDefesa = 15;

    @Override
    public void atacar(Lutador adversario){

    }
    @Override
    public void defender(int dano){

    }
    @Override
    public int obterVida(){
        return vida;
    }

    public void descricao(){
        System.out.println("Escolheu o Mulh e tem "+ obterVida()+" pontos de vida");
    }
}

public class Superman implements Lutador{

   private int vida;
   private int ataque;
    private int defesa;

    @Override
    public void atacar(Lutador adversario){
        adversario.getVida();
    }
    @Override
    public void defender(){
        this.defesa = 2;
    }
    @Override
    public int getAtaque(){
        return this.ataque;
    }
    @Override
    public int getVida(){
        return this.vida;
    }

    public void Refresh(){
        this.defesa = 0;
    }

}

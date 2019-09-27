public class PeruAdpter implements Pato{
    private Peru peru;

    public PeruAdpter(Peru peru){
        this.peru = peru;

    }

    @Override
    public void grasnar() {
        peru.soar();
    }

    @Override
    public void voar() {
        peru.voar();
    }

}

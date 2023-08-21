public class Manequim {
    private RoupaDeCima tronco;
    private RoupaDeBaixo pernas;
    private Calcado pes;

    public Manequim(TrajeFactory trajeFactory) {
        this.tronco = trajeFactory.criarRoupaDecima();
        this.pernas = trajeFactory.criarRoupaDeBaixo();
        this.pes = trajeFactory.criarCalcado();
    }
}

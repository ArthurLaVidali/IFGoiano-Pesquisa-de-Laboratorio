public class TrajeFactoryFormal implements TrajeFactory{
    @Override
    public RoupaDeCima criarRoupaDecima() {
        return new Camisa();
    }

    @Override
    public RoupaDeBaixo criarRoupaDeBaixo() {
        return new Calca();
    }

    @Override
    public Calcado criarCalcado() {
        return new Sapato();
    }
}

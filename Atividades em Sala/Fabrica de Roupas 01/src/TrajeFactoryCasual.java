public class TrajeFactoryCasual implements TrajeFactory{

    public RoupaDeCima criarRoupaDecima() {
        return new Camiseta();
    }

    public RoupaDeBaixo criarRoupaDeBaixo() {
        return new Bermuda();
    }

    public Calcado criarCalcado() {
        return new Tenis();
    }
}

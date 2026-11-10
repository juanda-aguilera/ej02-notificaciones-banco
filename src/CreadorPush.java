public class CreadorPush extends CreadorCanal {
    @Override
    public Canal crearCanal() {
        return new Push();
    }
}

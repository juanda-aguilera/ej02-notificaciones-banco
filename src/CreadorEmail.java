public class CreadorEmail extends CreadorCanal {
    @Override
    public Canal crearCanal() {
        return new Email();
    }
}

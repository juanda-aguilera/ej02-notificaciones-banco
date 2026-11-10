public class CreadorSms extends CreadorCanal {
    @Override
    public Canal crearCanal() {
        return new Sms();
    }
}

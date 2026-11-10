public class CreadorWhatsApp extends CreadorCanal {
    @Override
    public Canal crearCanal() {
        return new WhatsApp();
    }
}

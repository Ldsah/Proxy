public class Main {
    public static void main(String[] args) {
        Extender extender = new Extender();
//        extender.passElectricity(1.0f, 0.1f);
//        extender.passElectricity(2.0f, 0.05f);

        SafeExtender safeExtender = new SafeExtender();
        safeExtender.passElectricity(1.0f, 0.6f);

    }
}

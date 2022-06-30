public class SafeExtender extends Extender {
    @Override
    public float passElectricity(float w, float a) {
        if (a > 0.1) {
            a = 0.1f;
        }
        return super.passElectricity(w, a);
    }
}

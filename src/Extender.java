public class Extender {
    private float power = 0f;
    public float passElectricity(float w, float a) {
        power += a*w;
        System.out.println("Electicity is passing through " + power);
        return power;
    }

}

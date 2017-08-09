public class NauticalMiles {
    public static void main(String[] args) {
        float KIL = 1.852f;
        float MIL = 1.150f;
        double nautical = 5.0;
        double resultKm = KIL * nautical;
        double resultM = MIL * nautical;
        System.out.println(resultKm + " km's");
        System.out.println(resultM + " miles");
    }
}

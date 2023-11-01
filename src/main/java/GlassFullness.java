public class GlassFullness {
    public static void main(String[] args) {
        final double GlassCapacity = 400;
        // GlassCapacity - объем стакана в миллилитрах
        final double Filling = 0.13;
        double AmmountOfWater = GlassCapacity * Filling;
        // AmmountOfWater - количество воды в стакане в миллилитрах

        System.out.println(AmmountOfWater);
    }
}

public class Glass_Fullness {
    public static void main (String[] args){
        double GlassCapacity = 400;
        // GlassCapacity - объем стакана в миллилитрах
        double Filling = 0.13;
        double AmmountOfWater = GlassCapacity * Filling;
        // AmmountOfWater - количество воды в стакане в миллилитрах

        System.out.println(AmmountOfWater);
    }
}

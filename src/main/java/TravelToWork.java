public class TravelToWork {
    public static void main(String[] args) {
        final int Distance = 12; // Дистанция до места в км
        final double AvgSpeed = 65; // Средняя скорость в км/ч
        double TravelToWork = Distance / AvgSpeed;
        final double DecelerationFactor = 1.3; // Коэффицент вечернего замедления транспорта
        double TravelFromWork = (TravelToWork * DecelerationFactor) * 60; // Умножение на 60 для перевода в минуты

        System.out.println(TravelFromWork);
    }
}
public class TravelToWork {
    public static void main(String[] args) {
        int Distance = 12; // Дистанция до места в км
        double AvgSpeed = 65; // Средняя скорость в км/ч
        double TravelToWork = Distance / AvgSpeed;
        double DecelerationFactor = 1.3; // Коэффицент вечернего замедления транспорта
        double TravelFromWork = (TravelToWork * DecelerationFactor) * 60; // Умножение на 60 для перевода в минуты

        System.out.println(TravelFromWork);
    }
}

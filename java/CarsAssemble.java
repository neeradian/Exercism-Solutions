public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double rate = 221;
        if (speed >= 1 && speed <= 4) {
            return rate * speed;
        } else if (speed >= 5 && speed <= 8) {
            return rate * speed * 0.9;
        } else if (speed == 9) {
            return rate * speed * 0.8;
        } else {
            return rate * speed * 0.77;
        }

    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}

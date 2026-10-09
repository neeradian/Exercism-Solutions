public class Lasagna {

    int expectedMinutesInOven = 40;

    public int expectedMinutesInOven() {
        return this.expectedMinutesInOven;
    }

    public int remainingMinutesInOven(int actualMinutesInOven) {
        int result = this.expectedMinutesInOven() - actualMinutesInOven;
        // return expectedMinutesInOven - actualMinutesInOven;
        return result;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven) {
        int result = this.preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
        // return ((numberOfLayers*2)+ actualMinutesInOven);
        return result;

    }
}

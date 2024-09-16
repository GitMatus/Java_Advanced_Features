package advanced_coding.Example6;

public enum Runner {
    BEGINNER(241, 6000),
    INTERMEDIATE(181, 240),
    ADVANCED(1, 180);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int runTime) {
        if (runTime <= ADVANCED.minTime && runTime <= ADVANCED.maxTime) {
            return ADVANCED;
        }

        if (runTime <= INTERMEDIATE.minTime && runTime <= INTERMEDIATE.maxTime) {
            return INTERMEDIATE;
        };

        return ADVANCED;
    }
}

package com.sda.advanced.collections.enums;

public enum Zodiac {
    ARIES(3, 21, 4, 19),
    TAURUS(4, 20, 5, 20),
    GEMINI(5, 21, 6, 20),
    CANCER(6, 21, 7, 22),
    LEO(7, 23, 8, 22),
    VIRGO(8, 23, 9, 22),
    LIBRA(9, 23, 10, 22),
    SCORPIO(10, 23, 11, 21),
    SAGITTARIUS(11, 22, 12, 21),
    CAPRICORN(12, 22, 1, 19),
    AQUARIUS(1, 20, 2, 18),
    PISCES(2, 19, 3, 20);

    private final int startMonth;
    private final int startDay;
    private final int endMonth;
    private final int endDay;

    Zodiac(int startMonth, int startDay, int endMonth, int endDay) {
        this.startMonth = startMonth;
        this.startDay = startDay;
        this.endMonth = endMonth;
        this.endDay = endDay;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public int getStartDay() {
        return startDay;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public int getEndDay() {
        return endDay;
    }

    public boolean isDateInRange(int month, int day) {

        if (startMonth <= month && endMonth >= month && startDay <= day && endDay >= day) {
            return true;
        } return false;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}

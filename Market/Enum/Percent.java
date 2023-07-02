package Enum;

public enum Percent {
    ZERO("0"), FIVE("5"), TEN("10"), FIFTEEN("15"), TWENTY("20");

    String percent;

    Percent(String percent) {
        this.percent = percent;
    }

    public String getPercent() {
        return percent;
    }

    void setPersent(String percent) {
        this.percent = percent;
    }
}
package Lesson2.AdditionalExercise;

public enum ExpendMonths {
    JANUARY_EXPENSE (Math.random() * 10000, "January"),
    FEBRUARY_EXPENSE (Math.random() * 10000, "February"),
    MARCH_EXPENSE (Math.random() * 10000, "March"),
    APRIL_EXPENSE (Math.random() * 10000, "April"),
    MAY_EXPENSE (Math.random() * 10000, "May"),
    JUNE_EXPENSE (Math.random() * 10000, "June"),
    JULY_EXPENSE (Math.random() * 10000, "July"),
    AUGUST_EXPENSE (Math.random() * 10000, "August"),
    SEPTEMBER_EXPENSE (Math.random() * 10000, "September"),
    OCTOBER_EXPENSE (Math.random() * 10000, "October"),
    NOVEMBER_EXPENSE (Math.random() * 10000, "November"),
    DECEMBER_EXPENSE (Math.random() * 10000, "December");

    private Double value;
    private String month;

    ExpendMonths(Double value, String month){
        this.value = value;
        this.month = month;
    }

    public Double getValue() {
        return value;
    }

    public String getMonth() {
        return month;
    }
}

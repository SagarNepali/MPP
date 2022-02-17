package prob4C;

public class Hourly extends Employee{

    private int hourlyWage;
    private int hoursPerWeek;

    public Hourly(int hourlyWage, int hoursPerWeek){
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {

        return hoursPerWeek * hourlyWage * 4;

    }
}

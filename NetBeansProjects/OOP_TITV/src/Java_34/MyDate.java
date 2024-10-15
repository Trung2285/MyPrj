package Java_34;

public class MyDate 
{
    private int day;
    private int month;
    private int year;

    public MyDate(int d, int m, int y) 
    {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }

    public void setDay(int d) {
        this.day = d;
    }
    public void setMonth(int m) {
        this.month = m;
    }
    public void setYear(int y) {
        this.year = y;
    }

    @Override
    public String toString() 
    {
        return this.day + "/" + this.month + "/" + this.year;
    }
    
}

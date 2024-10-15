package Java_32;

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
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
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
    
    public static void main(String[] args) 
    {
        MyDate md = new MyDate(22,8,2005);
        md.setDay(20);
        System.out.println("Day = "+md.getDay());
    }
}

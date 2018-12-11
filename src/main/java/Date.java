import java.util.StringTokenizer;

public class Date {

    private int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date(){

    }


    public String toString(){
        System.out.println(day + "/" + month + "/" + year);
        return null;
    }

    public static Date writeYourDate(String data, String divider){
        StringTokenizer parser = new StringTokenizer(data, divider);
        int[] dateData = new int[3];
        int counter = 0;
        while(parser.hasMoreElements()){
            dateData[counter++] = Integer.parseInt(parser.nextElement().toString());
        }
        Date dateFromString = new Date();
        dateFromString.day = dateData[0];
        dateFromString.month = dateData[1];
        dateFromString.year = dateData[2];
        System.out.println(dateFromString.day + "/" + dateFromString.month + "/" + dateFromString.year);
        return dateFromString;
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}


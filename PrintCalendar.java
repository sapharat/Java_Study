import java.util.Scanner;
public class PrintCalendar {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Year");
        int year = kb.nextInt();
        System.out.print("Enter month");
        int month = kb.nextInt();
        year = year-543;
        if(year <=0||month<1|| month > 12){
            System.out.print("error :invalid year or month");
        }else{
            printMonth(month, year);
        }
        
    }


public static void printMonth(int m, int y){
    System.out.println("SUM MON TUE WED THU FRI SAT");
    int numDays = daysInMonth(m, y);
    int firstDay = dayOfWeek(1, m,y);
    int gap  = firstDay;
    gap = (numDays+3+gap)%7;
    for (int i = 0; i < gap; i++)
        System.out.print("    ");
       
    for (int i = 1; i <= numDays; i++) {
        System.out.printf(" %2d ", i);
        if (((i + gap) % 7 == 0) || (i == numDays)) 
        System.out.println();
    }
    System.out.println();
}

public static int daysInMonth(int m, int y){
    int day=0;
    if (y % 400 == 0 || y % 4 == 0 && y % 100 !=0)
    {
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
        {
             day=31;
        }
        if(m == 4 || m == 6 || m == 9 || m == 11)
        {
            day=30;
         }
        else if (m == 2 )
        {
            day=29;
        }
    }
    else
    {
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
        {
             day=31;
        }
        if(m == 4 || m == 6 || m == 9 || m == 11)
        {
            day=30;
         }
        else if (m == 2 )
        {
            day=28;
        }
    }
    return day;
}

public static int dayOfWeek(int d ,int m, int y){
    if (m < 3) {
                m = m + 12;
                y = y - 1;
               }
        int c = y / 100, 
            t = y % 100;
        int n = (d + 26 * (m + 1) / 10 + t + t / 4 + c / 4 - 2 * c) % 7;
        return n;
}
}
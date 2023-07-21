package OOP;

public class mainholiday {
    public static void main(String[] args) {
        holiday h1 = new holiday("holi", 5, "Jan");
        holiday h2 = new holiday("diwali", 11, "dec");
        holiday h3 = new holiday("newyear", 12, "dec");
        holiday h4 = new holiday("bhaibij", 13, "dec");


        holiday[] arrholiday = {h1, h2, h3, h4};
        holiday.sameMonth(h1, h3);
    }
}

class holiday {
    private String name;
    private int day;
    private String month;

    public holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public static boolean sameMonth(holiday h1, holiday h2) {
        if (h1.getMonth().equals(h2.getMonth())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return false;
    }


    public static float avgDate(holiday[] arrholiday) {
        int total = 0;
        for (int i =0;i<arrholiday.length;i++){
            total+=arrholiday[i].day;
        }
        int avg = total/arrholiday.length;
        return  avg;
    }

}

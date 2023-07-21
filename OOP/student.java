package OOP;

public class student {
    public static void main(String[] args) {
        studentdemo s1 = new studentdemo();
        s1.setRollNum(15);
        s1.setMark1(10);
        s1.setStudName("kevin");
        s1.setMark1(10);
        s1.setMark2(50);
        s1.setMark3(70);
//        s1.calculate();
        s1.displayStudDetails();
        System.out.println(s1.calculate());
    }

}

class studentdemo {
    private int rollNum;
    String studName;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks = mark1 + mark2 + mark3;

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public int calculate() {
        totalMarks = mark1 + mark2 + mark3;
        return totalMarks;
    }


    public void displayStudDetails() {
        System.out.println(rollNum);
        System.out.println(studName);
//        System.out.println(totalMarks);


    }

}

package OOP;

public class top3student {
    public static void main(String[] args) {

        Student1 s1 = new Student1(1, "Kevin", 10, 20, 30);
        Student1 s2 = new Student1(2, "dakshit", 40, 50, 60);
        Student1 s3 = new Student1(3, "krish", 90, 20, 30);
        Student1 s4 = new Student1(4, "harsh", 80, 20, 30);
        Student1 s5 = new Student1(5, "sahil", 10, 20, 70);
        Student1 s6 = new Student1(6, "kartik", 10, 20, 80);

        Student1[] students = new Student1[6];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;
        students[5] = s6;
        Student1.getTop3(students);

    }

}

class Student1 {
    int rollNo;
    String Name;
    int marks1;
    int marks2;
    int marks3;
    int total;
    double per;

    public Student1(int rollNo, String name, int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.Name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        total = marks1 + marks2 + marks3;
        per = total / 3;
    }


    public static void getTop3(Student1[] students) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (students[j].per < students[j + 1].per) {
                    Student1 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;

                }
            }
        }
        Student1 max1 = students[0];
        Student1 max2 = students[1];
        Student1 max3 = students[2];
        for (int i = 3; i < students.length; i++) {
            if (students[i].per > max1.per) {
                max3 = max2;
                max2 = max1;
                max1 = students[i];
            } else if (students[i].per > max2.per && max2.per != max1.per) {
                max3 = max2;
                max2 = students[i];
            } else if (students[i].per > max3.per && max3.per != max2.per && max3.per != max1.per) {
                max3 = students[i];
            }

        }
        System.out.println(max1.Name + "  " + max1.per);
        System.out.println(max2.Name + "  " + max2.per);
        System.out.println(max3.Name + "  " + max3.per);

    }
}










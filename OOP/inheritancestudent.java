package OOP;

import java.util.Scanner;

public class inheritancestudent {
    public static void main(String[] args){

        Student2 s1 = new Student2();
        s1.input();
        s1.show();
//        Student s2 = new Student();
//        s2.input();
//        s2.show();
        System.out.println("Total Marks of s1 is: " + s1.TotalMarks());
        System.out.println("Highest Mark of s1 is: " + s1.getHighest());
        System.out.println("Lowest Mark of s1 is: " + s1.getLowest());
        System.out.println("Average Marks of s1 is: " + s1.getAverage());
        System.out.println("Number of subjects in which s1 is passed: " + s1.getPassCount());
        Student2.TotalStudents();
    }
}

class Student2{
    private static int id=0;
    int rollNo;
    String name;

    int[] marks = new int[5];

    public Student2(){
        id++;
        this.rollNo = id;
        name = null;
        marks[0] = 0;
        marks[1] = 0;
        marks[2] = 0;
        marks[3] = 0;
        marks[4] = 0;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
    }

    public void show(){
        System.out.print(rollNo + " " + name + " ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    public static void TotalStudents(){
        System.out.println("Total students is: " + id);
    }

    public int TotalMarks(){
        int total = 0;
        for(int i=0; i<marks.length; i++){
            total += marks[i];
        }
        return total;
    }

    public int getHighest(){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<marks.length; i++){
            max = Math.max(max, marks[i]);
        }
        return max;
    }

    public int getLowest(){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<marks.length; i++){
            min = Math.min(min, marks[i]);
        }
        return min;
    }

    public int getAverage(){
        int average = TotalMarks() / marks.length;
        return average;
    }

    public int getPassCount(){
        int count =0;
        for(int i=0; i<marks.length; i++){
            if(marks[i] > 49){
                count++;
            }
        }
        return count;
    }
}
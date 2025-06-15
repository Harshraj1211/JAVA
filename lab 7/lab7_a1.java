// // Declare a class called Student having following data members:id_no, 
// // no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi. 
// // Define constructor and calculate_spi methods. Define main to instantiate an array for 
// // objects of class student to process data of n students to be given as command line 
// // arguments. [A] 
// import java.util.*;


import java.util.*;

class Student {
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    public Student(int id_no, int no_of_subjects_registered, int[] subject_code, int[] subject_credits,String[] grade_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = calculate_spi();
    }

    public void Display() {
        System.out.println("ID Number: " + this.id_no);
        System.out.println("Number of subjects registered: " + this.no_of_subjects_registered);
        System.out.println("Subject Codes: " + Arrays.toString(this.subject_code));
        System.out.println("Subject Credits: " + Arrays.toString(this.subject_credits));
        System.out.println("Grades Obtained: " + Arrays.toString(this.grade_obtained));
        System.out.println("SPI: " + this.spi);
    }

    public double gradePoints(String grade) {
        String str=grade.toUpperCase();
        if(str=="A"){
            return 10;
        }
        else if(str=="B"){
            return 8;
        }
        else if(str=="C"){
            return 6;
        }
        else if(str=="D"){
            return 4;
        }
        else if(str=="E"){
            return 2;
        }
        return 0;
    }
    public double calculate_spi() {         
        // cradit*grade/totalcradit
        double point=0.0,total_credit=0;
        for (int i = 0; i < this.no_of_subjects_registered; i++) {
            point+=this.subject_credits[i] * gradePoints(this.grade_obtained[i]); 
            total_credit+=this.subject_credits[i];
        }
        double spi=point/total_credit;
        return spi;
    }
}

public class lab7_a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int size = sc.nextInt();
        Student[] s1 = new Student[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Details for student " + (i + 1) + ": ");
            System.out.println("Enter ID Number: ");
            int id_no = sc.nextInt();

            System.out.println("Enter number of subjects registered: ");
            int no_of_subjects_registered = sc.nextInt();
            
            int[] subject_code = new int[no_of_subjects_registered];
            int[] subject_credits = new int[no_of_subjects_registered];
            String[] grade_obtained = new String[no_of_subjects_registered];
            
            for (int j = 0; j < no_of_subjects_registered; j++) {
                System.out.println("Enter Subject Code of subject " + (j + 1) + ": ");
                subject_code[j] = sc.nextInt();
                System.out.println("Enter Credits of subject " + (j + 1) + ": ");
                subject_credits[j] = sc.nextInt();
                System.out.println("Enter Grade obtained in subject " + (j + 1) + ": ");
                grade_obtained[j] = sc.next();
            }
            
            s1[i] = new Student(id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained);
            s1[i].calculate_spi();
        }
        
        System.out.println("------- Details -------");
        for (int i = 0; i < size; i++) {
            System.out.println("Student " + (i + 1) + " Details: ");
            s1[i].Display();
        }
    }
}
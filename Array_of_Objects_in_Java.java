class Student {
    int rollno;
    String name;
    int marks;
}

public class Array_of_Objects_in_Java {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Varshith";
        s1.marks = 84;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Priya";
        s2.marks = 88;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Prthivi";
        s3.marks = 92;

        Student students[] = new Student[3]; // array of objects declaration and instantiation
        students[0] = s1; // initialization
        students[1] = s2;
        students[2] = s3;

        for (int i=0;i<students.length;i++){
            System.out.println(students[i].name+ " : " +students[i].marks);
        }

       // int num1[] = new int[4]; // declaration and instantiation
        //num1[0] = 4; // initialization
        //num1[1] = 6;
        //num1[2] = 3;
        //num1[3] = 9;
       
        //for (int i = 0; i < num1.length ; i++){
            //System.err.println(num1[i]);
        //}
    }
}
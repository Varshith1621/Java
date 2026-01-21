 class Student {
    int rollno;
    String name;
    int marks;
}
 
 public class Enhanced_for_loop{
    public static void main(String[] args) {
    int nums[] = new int[4]; // declaration and instantiation
        nums[0] = 4; // initialization
        nums[1] = 6;
        nums[2] = 3;
        nums[3] = 9;
       
        //for (int i = 0; i < num1.length ; i++){
            //System.err.println(num1[i]);
        //}

        for (int n : nums){ // enhanced for loop
            System.out.println(n);
        }





       //Example 2
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

        //for (int i=0;i<students.length;i++){
            //System.out.println(students[i].name+ " : " +students[i].marks);
        //}

        for (Student stud : students){
            System.out.println(stud.name + " : " + stud.marks);
        }
    }
}
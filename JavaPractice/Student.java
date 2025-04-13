public class Student {

    int studentId;
    String studentName;
    String grade;

    Student(){
        this.studentId=studentId;
        this.studentName=studentName;
        this.grade=grade;
    }
    Student(int studentId,String studentName,String grade){
        this.studentId=studentId;
        this.studentName=studentName;
        this.grade=grade;
    }
    public static void main(String[] args){
        Student student1=new Student();
        System.out.println("Student1 ID:"+ student1.studentId );
        System.out.println("Student1 ID:"+ student1.studentName);
        System.out.println("Student1 ID:"+ student1.grade);

        Student student2=new Student(100,"Priyanka","A");
        System.out.println("Student1 ID:"+ student2.studentId );
        System.out.println("Student1 ID:"+ student2.studentName);
        System.out.println("Student1 ID:"+ student2.grade);



    }


}

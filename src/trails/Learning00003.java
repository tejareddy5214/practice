package trails;
//Create a class Student with private fields name, rollNumber, and marks.
// Provide public getter and setter methods to access and update the data. Test the class in a main() method.
public class Learning00003 {
    public static void main(String[] args){
        Student s=new Student();
        s.setMarks("Teja",10192,100);
        System.out.println(s.getMarks("Teja",10192));
        Student m=new Student();
        m.setMarks("Rohit",10193,100);
        System.out.println(m.getMarks("Rohit",10193));
        System.out.println(s.getMarks("Teja",10192));

    }
}
class Student{
    private String name;
    private int rollNumber;
    private  int marks;

    public int getMarks(String candName, int candNum){
        if(this.name == candName && this.rollNumber ==candNum) {return marks;}
        else{ return 00;}
    }
    public void setMarks(String candName,int candNum,int candMarks){
        this.name = candName;
        this.rollNumber=candNum;
        this.marks = candMarks;
        System.out.println(candName);
    }
}

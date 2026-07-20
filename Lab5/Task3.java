class Person{
    private String firstName;
    private String lastName;

    public Person(){
        firstName="";
        lastName="";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getfirstName(){
        return firstName;
    }

    public void setfirstName(String firstName){
        this.firstName=firstName;
    }

    
    public String getlastName(){
        return lastName;
    }

    public void setlastName(String lastName){
        this.lastName=lastName;
    }

    public void displayDetails(){
        System.out.println("First name is :"+ firstName);
        System.out.println("Last name is :"+ lastName);

    }
}

class Student extends Person{
            private int StudentId;
            private String course;
            private String teacherName;

            public Student(String firstName, String lastName,int StudentId,String course,String teacherName){
                super(firstName,lastName);
                this.StudentId=StudentId;
                this.course=course;
                this.teacherName=teacherName;
            }

            public void displayDetails(){
                super.displayDetails();

                System.out.println("Student Id : " +StudentId);
                System.out.println("Course name : " +course);
                System.out.println("Teacher name : " +teacherName);
            }
}

class Teacher extends Person{
    private String sub;
    private double salary;

    public Teacher(String firstName, String lastName,String sub,double salary){
        super(firstName,lastName);
        this.sub=sub;
        this.salary=salary;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Subject name : " +sub);
        System.out.println("Salary : " +salary);
        
    }

}

public class Task3{
    public static void main(String args[]){
        Student s1=new Student("Ghulam","Mustafa",1234,"OOP","Mr.Atif");
        Student s2=new Student("Azhar","Ali",3456,"DSA","Dr Faheem");

        Teacher t1 = new Teacher("Ahsan","Iqbal","Software Engineering",85000);
        Teacher t2 = new Teacher("Fatima","Noor","Database Systems",90000);

        System.out.println("----- Student 1 -----");
        s1.displayDetails();

        System.out.println();

        System.out.println("----- Student 2 -----");
        s2.displayDetails();

        System.out.println();

        System.out.println("----- Teacher 1 -----");
        t1.displayDetails();

        System.out.println();

        System.out.println("----- Teacher 2 -----");
        t2.displayDetails();
    }
}
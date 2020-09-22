/**
 *  31.	Create a class Student with 2 data members rno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. Create one more method showData() to print the data member values. Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.
 */


class Student{
    private int rNo;
    private String name;
    void setData(int id, String sName){
        rNo = id;
        name = sName;
    }
    
    void showData(){
        System.out.println(rNo+" "+name);
    }
}

class StudentDemo{
    public static void main(String[] args) {
        Student s  = new Student();
        s.setData(45,"Suraj");
        s.showData();
    }
}
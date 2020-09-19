/**
 *  32.	Modify the above program (no. 31) to count the no of Student objects created. [ In this program static variable is required ]
 */


class Student{
    private int rNo;
    private String name;
    private static int no;
    void setData(int id, String sName){
        rNo = id;
        name = sName;
        no++;
    }
    
    void showData(){
        System.out.println(no+"    "+rNo+"     "+name);
    }
}

class StudentDemo1{
    public static void main(String[] args) {
        System.out.println("SrNo RollNo Name");
        Student s  = new Student();
        s.setData(45,"Suraj");
        s.showData();

        Student s1  = new Student();
        s1.setData(47,"Rajendra");
        s1.showData();

        Student s2  = new Student();
        s2.setData(48,"Pingate");
        s2.showData();
    }
}
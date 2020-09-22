/**
 *  33.	Write a program to demonstrate functionalities of this keyword in java. 
 */

class This{
    private int rollNo;
    private String studentName;

    void getData(int rollNo, String studentName){
        this.rollNo = rollNo;
        this.studentName = studentName;

        // rollNo = rollNo;
        // studentName = studentName;
    }

    void showData(){
        System.out.println(rollNo+" "+studentName);
    }

}


class ThisKeyWord{
    public static void main(String[] args) {
        This t = new This();
        t.getData(45, "Suraj");
        t.showData();
    }
}
/**
 *  36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
 */

 class MathOperation{
     void multiply(int a, int b){
         System.out.println("Multiplication of two int : "+(a*b));
     }

     void multiply(float x,float y,float z){
         System.out.println("Multiplication of three floats : "+(x*y*z));
     }

     void multiply(int arr[]){
         int x = 1;
        for(int a : arr){
            x = x * a;
        }
        System.out.println("Multiplication of array elements : "+x);
     }

     void multiply(double p,int  q){
         System.out.println("Multiplication of double and int : "+(q*p));
     }
 }

 class MathOperationDemo{
     public static void main(String[] args) {
         MathOperation mt = new MathOperation();
         int ar[] = new int[] {2,3,5,9};

         mt.multiply(5,10);
         mt.multiply(2.5f,1.5f,0.5f);
         mt.multiply(ar);
         mt.multiply(1.5d,10);
     }
 }
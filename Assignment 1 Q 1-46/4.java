/*
*04.	Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable. [Note: primitive down casting is required in this program ] 
 */

   class downCasting{
        public static void main( String args[]){

  byte b1 = 5;
  byte b2 = 6;

 byte b3 = (byte)(b1 + b2);
     System.out.println(b3);
}
}
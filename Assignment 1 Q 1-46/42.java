/**
 *  42.	Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
 */
import java.util.*;
 class Tile{
     int length;
     int tile;
     int areaTile(int le){
         length = le;
         tile = length * length;
         return tile;
     }
 }

 class Floor extends Tile{
     int length;
     int width;
     int floor;

     void floor(int l,int w){
         length = l;
         width = w;
         }
     int areaFloor(){
         floor =  (length * width);
         return floor;
         }

    int totalTiles(int tile){
        int i = areaFloor();
        int totalTile = i / tile;
        return totalTile;
     }
 }


 class totalTiles{
     public static void main(String args[]){
         Floor f = new Floor();
         Scanner sc = new Scanner(System.in);

         int tile = f.areaTile(5);

         System.out.println("Enter the length of Floor");
         int l = sc.nextInt();
         System.out.println("Enter the Width of Floor");
         int w = sc.nextInt();
         f.floor(l,w);
        int totalTile = f.totalTiles(tile);
        System.out.println("Total tiles require for "+f.floor+" Area is : "+totalTile);
     }
 }
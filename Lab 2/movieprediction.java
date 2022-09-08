//Java Program to print the array elements using for-each loop  
import java.util.*;
import java.lang.Math;
class movieprediction{  
    static double distance(int x1, int y1, int x2, int y2){
        double s = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return s;
      }
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
    int x[]={100,0,90,21};  
    //remember first and third are action
    //remember second and fourth are comedy
    int y[]={0,100,17,80};
    int newpoint[]={sc.nextInt(),sc.nextInt()};
    //double action = distance(x[0], y[0], x[2], y[2]);
    //double comedy = distance(x[1], y[1], x[3], y[3]);
    Vector<Double> v = new Vector<Double>();
    for(int i=0;i<4;i++){  
        double d = distance(newpoint[0], newpoint[1], x[i], y[i]); 
        v.add(d);
    }  
    int minimum = (int)v.indexOf(Collections.min(v));
    //System.out.println(minimum);
    if (minimum==1 || minimum==3){
        System.out.println("Action");}
    else {
        System.out.println("Comedy");
    }
    
    }}  
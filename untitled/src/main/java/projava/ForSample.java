package main.java.projava;

import java.sql.SQLOutput;
import java.util.stream.StreamSupport;

public class ForSample {
    public static void main(String[] args) {
     for(int i =0;i < 9;i++){
         if(i != 6){
             System.out.println(i);
             continue;
         }
         System.out.println(i);
         break;
     }
    }
}

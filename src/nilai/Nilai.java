/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;

/**
 *
 * @author ASUS X450JN
 */
import java.util.Scanner;
public class Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int benar, salah, nilai, soal=50;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Soal = "+soal);
        
        System.out.print("Total Salah = ");
    salah = input.nextInt();
    
    nilai = (soal - salah)*2;     
    
    System.out.println("Total nilai = "+nilai);
  
    
    
    if (nilai > 90){
        System.out.println("Grade = A");
        System.out.println("Selamat !!!");
    }else if (nilai > 80){
        System.out.println("Grade = B+");
        System.out.println("Selamat !!!");
    }else if (nilai > 70) {
        System.out.println("Grade = B");
        System.out.println("Semangat !!!");
    }else{
        System.out.println("Grade = F");
        System.out.println("Semangat !!!");
        
        
        
        
        
        
    }
        }
    
}
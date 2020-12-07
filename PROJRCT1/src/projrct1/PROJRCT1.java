/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projrct1;

import static java.lang.Double.sum;
import java.util.Scanner;

/**
 *
 * @author Suriya
 */
public class PROJRCT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eng=80,acc=95,bs=92,ip=84,eco=85,t,per;
        t=eng+acc+bs+ip+eco;
        per=t*100/500;
        
        if (per>=80)
         System.out.println("Grade is A");
        
        else if(per>=60&&per<80)
            System.out.println("Grade is B");
        
        else if(per>=40&&per<60)
            System.out.println("Grade is C");
        
        else System.out.println("Grade is D");
    }
    
}

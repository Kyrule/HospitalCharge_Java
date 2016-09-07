/*
 * Calculate patient charges
 * 	Determine if it is an overnight stay
 * 		Hospital overnight charge
 * 		Medication charge
 * 		Lab service charge
 * 
 * 		if not overnight stay
 * 			Medication charge
 * 			Lab charge
 * 
 * Calc for another patient?
 * 
 * */

package net.hospital;
import java.util.Scanner;
public class HospitalStay {

	public static void main(String[] args){
		
		String go="y";
		double overnightCharge=.0,medicationCharge=.0,labCharge=.0;
		Scanner s=new Scanner(System.in);
		
		do {
			System.out.print("Is this an overnight stay? (y/n) ");
			go=s.next();
			if(go.equalsIgnoreCase("y")) {
				System.out.print("How much is the overnight stay? ");
				overnightCharge=s.nextDouble();
			}
			System.out.print("How much is the medication charge? ");
			medicationCharge=s.nextDouble();
			System.out.print("How much is the lab charge? ");
			labCharge=s.nextDouble();			
			System.out.printf("Hence, total charge is $%.2f\n",overnightCharge+medicationCharge+labCharge);
			System.out.print("Calculate for another patient? (y/n) ");
			go=s.next();
			overnightCharge=.0;medicationCharge=.0;labCharge=.0;
		}while(go.equalsIgnoreCase("y"));
	}
}

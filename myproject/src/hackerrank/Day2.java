package hackerrank;

import java.util.*;
import java.math.*;
class Day2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int  tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        double tip=mealCost*((double)tipPercent/100);
        double tax=mealCost*((double)taxPercent/100);
		double total=mealCost+tip+tax;
		int totalcost = (int) Math.round(total);
		System.out.println("The total meal cost is"+totalcost+" dollars.");
    }
}
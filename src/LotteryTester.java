import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTester {
public static void main(String[] args) {
////	String stringnum = JOptionPane.showInputDialog("Enter a number between 1 and 80");
//	int times = 0;
////	int num = Integer.parseInt(stringnum);
	Random rand = new Random();
//	for (int i = 0; i < 1000000; i++) {
//		int x = rand.nextInt(80)+1;
//		int y = rand.nextInt(80)+1;
//		if(x==y){
//			times += 1;
//		}
//	}
	//System.out.println(times);
	int count = 0;
	int[] array = new int[6];
	int[] randarray = new int[6];
	for (int i = 0; i < 6; i++) {
		String s = JOptionPane.showInputDialog("input a number");
		array[i] = Integer.parseInt(s);
	}
	while(!dante(array, randarray)){
	for (int i = 0; i < 6; i++) {
		randarray[i] = rand.nextInt(80)+1;
	}
	count++;
	}
	System.out.println("it took " + count + " weeks");
}
static boolean contains(int hi, int[] h){
	for (int l = 0; l < h.length; l++) {
		if(hi == h[l]){
			return true;
		}
	}
	return false;
}
static boolean dante(int[]a, int[]b){
	for (int i = 0; i < b.length; i++) {
		if(!contains(a[i], b)){
			return false;
		}
	}
	return true;
}
}

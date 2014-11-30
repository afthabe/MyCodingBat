package moh.academic.files;
public class BetterProgrammerTask {
	public static void main(String[] args) {
		int[] a= {10,9,-10,-9,-2,19,89,45,-4,4};
		System.out.println(BetterProgrammerTask.getClosestToZero(a));
	}
	public static int getClosestToZero(int[] a) {
		int lowest = a[0];
		for (int i = 1; i < a.length; i++) {
			//System.out.println(lowest +  " cur value " + a[i] +" abs " + Math.abs(a[i]));

			if (Math.abs(a[i]) < Math.abs(lowest)) {
				lowest = a[i];
			} else if (Math.abs(a[i]) == Math.abs(lowest) && a[i] != lowest) {
 				lowest = Math.abs(lowest);
			}
		}	
		return lowest;
	}
}

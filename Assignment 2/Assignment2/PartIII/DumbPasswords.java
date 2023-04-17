import java.util.Scanner;

public class DumbPasswords {
	
	public static void printDumbPasswords(int m, int n) {
		for(int i = 1; i <=m; i++) {
			for(int j = 1; j <= m; j++) {
				for(int k = 1; k <= n; k++) {
					for(int p = 1; p <= n; p++) {
						for(int q = 1; q <= m; q++) {
							if(q > i && q > j) {
								System.out.print(i);
								System.out.print(j);
								char c1 = (char)(k + 96);
								char c2 = (char)(p + 96);
								System.out.print(c1);
								System.out.print(c2);
								System.out.print(q);
								System.out.print(" ");
							}
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter value for m: ");
		int m = input.nextInt();
	    System.out.print("Enter value for n: ");
		int n = input.nextInt();
		
		if(m > 0 && n > 0 && n < 27) {
			printDumbPasswords(m, n);
		}
		else {
			System.out.print("Check values for m and n.");
		}
	
	}

}

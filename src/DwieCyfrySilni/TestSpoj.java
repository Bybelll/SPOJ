package DwieCyfrySilni;

import java.util.Scanner;

public class TestSpoj {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int liczba = scan.nextInt();
		
		for (int i = 0; i < liczba; i++) {

			int cyfra;
			if(scan.hasNextInt()){
			cyfra = scan.nextInt();
			}else cyfra=0;
			int dzies = 0;
			int jedn=1;
			
			switch (cyfra) {
			
			case 0: dzies=0; jedn=1; break;
			case 1: dzies=0; jedn=1; break;
			case 2: dzies=0; jedn=2; break;
			case 3: dzies=0; jedn=6; break;
			case 4: dzies=2; jedn=4; break;
			case 5: dzies=2; jedn=0; break;
			case 6: dzies=2; jedn=0; break;
			case 7: dzies=4; jedn=0; break;
			case 8: dzies=2; jedn=0; break;
			case 9: dzies=8; jedn=0; break;
			
			default: dzies=0; jedn=0;
				break;
			}
			
			System.out.println(dzies + " "+ jedn);
		}
		
		scan.close();
	}

}

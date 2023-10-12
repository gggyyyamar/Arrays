package multiarray;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int rollNo[]=new int[4];
		String studName[]=new String[4];
		int total[]=new int[4];
	    float average[]=new float[4];
	    String grade[]=new String[4];
	    String result[]=new String[4];
	    
	
		
		int studData[][]=new int[4][3];
		for(int i=0;i<4;i++) {
			System.out.println("Enter the student Roll Number:");
			rollNo[i]=scanner.nextInt();
			System.out.println("Enter the student Name:");
			studName[i]=scanner.next();
			System.out.println("Enter the three Marks:");
		for(int j=0;j<3;j++) {
			studData[i][j]=scanner.nextInt();
			total[i]+=studData[i][j];
			average[i]=total[i]/3;
			if (average[i]>50) {result[i]="p";}
			else{result[i]="F";}
            if (average[i]>70) {grade[i]="A";}
            else if (average[i]>50) {grade[i]="B";}
            else if (average[i]<50) {grade[i]="c";}
           	 
			
		}
		System.out.println("The total is:"+total[i]);
	
		}
		
		
		System.out.println("******************************************************************************************************");
		System.out.println("\t\t\t\t STUDENT MARKLIST");
		System.out.println("******************************************************************************************************");
		System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");
		for(int i = 0; i<4; i++) {
			System.out.println(rollNo[i]+ "\t" + studName[i] +"\t" + studData[i][0] +"\t" + studData[i][1]+"\t" +studData[i][2] +"\t" + total[i] +"\t" + result[i] +"\t" + average[i] +"\t" + grade[i]);
		}
		
	scanner.close();
	}
	}



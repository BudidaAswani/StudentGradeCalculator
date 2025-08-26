package SGC;
import java.util.Scanner;
class StudentGradeCalculator {
	public static void main(String[] args) { 
		Scanner scanner=new Scanner(System.in);
		int i;
		System.out.println("******Student Grade Calculator for all Students******");
		System.out.println("\nEnter number of students : ");
		int n=scanner.nextInt();
		scanner.nextLine();
		String[] names=new String[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Enter name of the Student "+(i+1)+": ");
			names[i]=scanner.nextLine();
		}
		System.out.print("\nEnter no of Subjects :");
		int nS=scanner.nextInt();
		scanner.nextLine();
		String[] sub = new String[nS];
		for(i=0;i<nS;i++)
		{
			System.out.print("Enter subject "+(i+1)+" name : ");
			sub[i]=scanner.nextLine();
		}
		int total=0;
		int[] marks = new int[nS];
		for(i=0;i<n;i++)
		{
		        System.out.print("\n"+names[i]+" Details>>>>> \n");
				System.out.println("\tSubject\tMarks\n\t-------\t-----");
        		for (int j = 0; j< nS;j++) {
					System.out.print("\t"+sub[j]+"\t");
					marks[j] = scanner.nextInt();
            		total += marks[j];
        		}
       		double average= (double)total / nS;
			char Grade;
			if(average>=90) {
				Grade= 'O';}
			else if(average>=80){
				Grade ='A';}
			else if(average>=70){
				Grade='B';}
			else if(average>=60){
				Grade='C';}
			else{
				Grade ='D';}
			System.out.println("\t-------\t-----");
        	System.out.println("\tTotal  : " + total);
        	System.out.println("\tAverage: " + average);
       		System.out.println("\tGrade  : " + Grade);
			System.out.println("\t-------\t-----");
		}
 	scanner.close();
    }
}
import java.util.Scanner;
class SGC4 {
	public static void main(String[] args) { 
		Scanner scanner=new Scanner(System.in);
		int i;

		System.out.print("Enter number of students : ");
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
			//scanner.nextLine();
			System.out.print("Enter subject "+(i+1)+" name : ");
			sub[i]=scanner.nextLine();
			//scanner.nextLine();
		}

		int total=0;
		int[] marks = new int[nS];


		System.out.println("\n\n\n\t----------Enter Student Details----------");
		for(i=0;i<n;i++)
		{
		        System.out.print("\n<<<<<Enter "+names[i]+" details>>>>> \n\n");

        		for (int j = 0; j< nS;j++) {
            			System.out.print("Enter marks for "+sub[j]+" : " );
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
        		System.out.println("******Student Grade Calculator for "+names[i]+" ******");
	        	System.out.println("  Student Name   : " + names[i]);
			System.out.println("\n\tSubject\tMarks\n\t-------\t-----");
			for(int j=0;j<nS;j++)
				System.out.println("\t"+sub[j]+"\t"+marks[j]);
        		System.out.println("Total  : " + total);
        		System.out.println("Average: " + average);
        		System.out.println("Grade  : " + Grade);
		}
/*
		System.out.println("***Student Grade Calculator***");
		//for(i=0;i<nS;i++)
		//	System.out.println("StudentName\t"+sub[i]+"\t");

		for(i=0;i<n;i++)
		{
			System.out.println(

		}
*/   
        	scanner.close();
    }
}
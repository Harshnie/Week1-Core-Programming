import java.util.Scanner;
class marksTwoDim{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students = scan.nextInt();
		int[][] marks = new int[students][3];
		double[] percentage = new double[students];
		for(int i =0; i< students; i++){
			System.out.print("Enter the Physics marks: ");
			int physics_marks = scan.nextInt();
			if(physics_marks <0){
				System.out.println("Invalid input");
				i--;
				continue;
			}
			marks[i][0] = physics_marks;
			System.out.print("Enter the Chemistry marks: ");
			int chem_marks = scan.nextInt();
			if(chem_marks <0){
				System.out.println("Invalid input");
				i--;
				continue;
			}
			marks[i][1]  = chem_marks;
			System.out.print("Enter the maths marks: ");
			int math_marks = scan.nextInt();
			if(math_marks <0){
				System.out.println("Invalid input");
				i--;
				continue;
			}
			marks[i][2]  = math_marks;
		}
		for(int i = 0; i<students; i++){
			percentage[i] = (marks[i][0] +marks[i][1] +marks[i][2])/3.0;
		}
		for(int i =0; i< students; i++){
			if(percentage[i]  >= 80){
			System.out.println("Total marks: "+(marks[i][0] +marks[i][1] +marks[i][2])+" and the percentage is "+percentage[i]+" and the grade: A and the remark: Level 4, above agency-normalized standards");
			}
			else if(percentage[i] >= 70 && percentage[i] <= 79){
				System.out.println("Total marks: "+(marks[i][0] +marks[i][1] +marks[i][2])+" and the percentage is "+percentage[i]+" and the grade: B and the remark: Level 3, at agency-normalized standards");
			}
			else if(percentage[i] >= 60 && percentage[i] <= 69){
				System.out.println("Total marks: "+(marks[i][0] +marks[i][1] +marks[i][2])+" and the percentage is "+percentage[i]+" and the grade: C and the remark: Level 2, below, but approaching agency-normalized standards");
			}
			else if(percentage[i] >= 50 && percentage[i] <= 59){
				System.out.println("Total marks: "+(marks[i][0] +marks[i][1] +marks[i][2])+" and the percentage is "+percentage[i]+" and the grade: D and the remark: Level 1, well below agency-normalized standards");
			}
			else if(percentage[i] >= 40 && percentage[i] <= 49){
				System.out.println("Total marks: "+(marks[i][0] +marks[i][1] +marks[i][2])+" and the percentage is "+percentage[i]+" and the grade: E and the remark: Level 1-, too below agency-normalized standards");
			}
			else if(percentage[i] <= 39){
				System.out.println("Total marks: "+(marks[i][0] +marks[i][1] +marks[i][2])+" and the percentage is "+percentage[i]+" and the grade: R and the remark: Remedial standards");
			}
		}
		
		scan.close();
	}
}
import java.util.*;

public class StudentList {
	
	private Student[] list;
	
	public StudentList() {
		Scanner scnr = new Scanner(System.in);
		int numStudents;
		String last, first;
		int grade;
		double gpa;
		System.out.print("How many students? ");
		numStudents = scnr.nextInt();
		System.out.println();
		list = new Student[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.println();
			System.out.println("STUDENT " + i + "...");
			System.out.print("First Name: ");
			first = scnr.nextLine();
			System.out.print("Last Name: ");
			last = scnr.nextLine();
			System.out.print("Grade Level: ");
			grade = scnr.nextInt();
			System.out.print("GPA: ");
			gpa = scnr.nextDouble();
			list[i] = new Student(first, last, grade, gpa);
		}
		scnr.close();
	}
	
	public String toString() {
		String outString = "";
		for (Student stu : list) {
			outString += stu.toString() + "\n";
		}
		outString += "\n";
		return outString;
	}
	
	public void bubbleSort() {
		
		int a = list.length;
		for (int i = a - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				String last1 = list[j].getLastName();
				String last2 = list[j+1].getLastName();
					if (last1.compareTo(last2) > 0) {
						Student temp1 = new Student(list[j].getFirstName(), list[j].getLastName(), list[j].getGradeLevel(), list[j].getGPA());
						list[j] = new Student(list[j+1].getFirstName(), list[j+1].getLastName(), list[j+1].getGradeLevel(), list[j+1].getGPA());
						list[j+1] = new Student(temp1.getFirstName(), temp1.getLastName(), temp1.getGradeLevel(), temp1.getGPA());
					}
			}
		}
	}

}
import java.util.Scanner;

public class Menu_Manager {

	public static void main(String[] args) {
		int n=0;
		Scanner input = new Scanner(System.in);

		while(n!=6)
		{
			System.out.println("*** Private Lesson Management System Menu ***");
			System.out.println("1. Add Students");
			System.out.println("2. Delete Students");
			System.out.println("3. Edit Students");
			System.out.println("4. View Students");
			System.out.println("5. Shaw a menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1 - 6 : ");
			n = input.nextInt();
			input.nextLine();
			System.out.println("");

			if(n==1) {
				addStudents();
			}
			else if(n==2) {
				deleteStudents();
			}
			else if(n==3) {
				editStudents();
			}
			else if(n==4) {
				viewStudents();
			}
			else if(n==5) {
				continue;
			}
	         else if(n>=7)
	         {
	            System.out.println("1-6 ������ ���ڸ� ���ÿ�");
	            System.out.println("");
	         }
		}
		 System.out.println("End.");
	}

	public static void addStudents() {
		Scanner input = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = input.nextLine();
		System.out.print("�г��� �Է��Ͻÿ� : ");
		String year = input.nextLine();
		System.out.print("��ȭ��ȣ�� �Է��Ͻÿ� : ");
		String phone_number = input.nextLine();
		System.out.print("���� �Է��Ͻÿ� : ");
		String subject = input.nextLine();
		System.out.print("���� ����� �Է��Ͻÿ� : ");
		String grade = input.nextLine();
		System.out.print("��ǥ��� �Է��Ͻÿ� : ");
		String goal = input.nextLine();
		System.out.println("");
	}

	public static void deleteStudents() {
		Scanner input = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = input.nextLine();
	}

	public static void editStudents() {
		Scanner input = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = input.nextLine();
	}

	public static void viewStudents() {
		Scanner input = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = input.nextLine();
	}

	public static void ShowMenu() {
		
	}

}
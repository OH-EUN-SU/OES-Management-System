import java.util.Scanner;

public class MenuㅡManager {

	public static void main(String[] args) {
		int n=0;
		Scanner input = new Scanner(System.in);
		
		while(n!=6)
		{
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. Add Students");
			System.out.println("2. Delete Students");
			System.out.println("3. Edit Students");
			System.out.println("4. View Students");
			System.out.println("5. Shaw a menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1 - 6 : ");
			n = input.nextInt();
			System.out.println("");
			
			if(n==1)
			{
				Scanner input1 = new Scanner(System.in);
				System.out.print("id를 입력하시오 : ");
				String id = input1.nextLine();
				System.out.print("이름을 입력하시오 : ");
				String name = input1.nextLine();
				System.out.print("이메일을 입력하시오 : ");
				String e_mail = input1.nextLine();
				System.out.print("전화번호를 입력하시오 : ");
				String phone_number = input1.nextLine();
				System.out.println("");
			}
			else if(n==2)
			{
				Scanner input2 = new Scanner(System.in);
				System.out.print("id를 입력하시오 : ");
				String id_in = input2.nextLine();
				System.out.println("");
			}
			else if(n==3)
			{
				Scanner input3 = new Scanner(System.in);
				System.out.print("id를 입력하시오 : ");
				String id_in = input3.nextLine();
				System.out.println("");
			}
			else if(n==4)
			{
				Scanner input4 = new Scanner(System.in);
				System.out.print("id를 입력하시오 : ");
				String id_in = input4.nextLine();
				System.out.println("");
			}
			
			if(n==6)
			{
				System.out.println("End.");
			}
		}
		
	}

}

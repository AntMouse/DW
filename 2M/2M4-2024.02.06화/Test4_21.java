package m2_02_06;

import java.util.Scanner;

public class Test4_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("직책 : ");
		String jobTitle = sc.next();
		boolean valueCheck = true;
		
		String jobMission = switch (jobTitle) {
			case "Security" -> "순찰";
			case "Cleaning" -> "청소";
			case "Feeding" -> "먹이 주기";
			case "Tour Guiding" -> "고객 안내";
			default ->  { 
				System.out.println("제대로된 값을 입력해주세요.");
				valueCheck = false;	
				yield ""; 
			}
		};
		
		if (valueCheck) {
			System.out.println(jobMission);
		}
		
	}

}

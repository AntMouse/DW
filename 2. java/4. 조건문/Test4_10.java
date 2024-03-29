package pkg1;

import java.util.Scanner;

public class Test4_10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nLetters = 0;
        String name = "Jane";
        System.out.print("Enter name -> ");
        name = sc.next();

        nLetters = switch (name) {
            case "Jane", "Sean", "Alan", "Paul" -> 4;
            case "Janet", "Susan" -> 5;
            case "Maaike", "Alison", "Miriam" -> 6;
            default -> {
                System.out.println("Unrecognized name : " + name);
                yield -1;
            }
        };
        System.out.println(nLetters);
	}
}

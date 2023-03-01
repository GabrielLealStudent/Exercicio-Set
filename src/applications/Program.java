package applications;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many students for course A?");
		int A = sc.nextInt();

		Set<Student> set = new HashSet<>();

		for (int i = 0; i < A; i++) {
			int id = sc.nextInt();

			set.add(new Student(id));

		}

		System.out.print("How many students for course B?");
		int B = sc.nextInt();

		for (int i = 0; i < B; i++) {
			int id = sc.nextInt();

			set.add(new Student(id));

		}

		System.out.print("How many students for course C?");
		int C = sc.nextInt();

		for (int i = 0; i < C; i++) {
			int id = sc.nextInt();

			set.add(new Student(id));

		}

		System.out.println("Total students: " + set.size());

		sc.close();
	}
}
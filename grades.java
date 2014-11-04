/**
 * @author ocawley
 * Updated ....
 */

public class grades
{
	public static void main(String[] args) {
1		String grade = new String();
1		int exam, ca;

1		exam = Integer.parseInt(args[0]);
1		ca = Integer.parseInt(args[1]);

5		if (exam < 0 || exam > 100 || ca < 0 || ca > 100) {
6			grade = "Invalid input";
7		} else if (exam < 40 || ca < 40) {
8			grade = "Component Fail";
9		} else {
10			int combined = (60 * exam + 40 * ca) / 100;
11			if (combined < 60) {
12				grade = "Fail";
			} else if (combined >= 60 && combined <= 80) {
				grade = "Pass";
			} else if (combined > 80 && combined <= 100) {
				grade = "Pass with distinction";
			}
		}
		System.out.println(grade);
	}
}

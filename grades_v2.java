/**
 * @author ocawley
 */

public class grades_v2
{
	public static void main(String[] args) {
		String grade = new String();
		int exam, ca;
		try {
			exam = Integer.parseInt(args[0]);
			ca = Integer.parseInt(args[1]);			

			if (exam < 0 || exam > 100 || ca < 0 || ca > 100) {
				grade = "Invalid input";
			} else if (exam < 40 || ca < 40) {
				grade = "Component Fail";
			} else {
				int combined = (60 * exam + 40 * ca) / 100;
				if (combined < 50) {
					grade = "Fail";
				} else if (combined >= 50 && combined < 80) {
					grade = "Pass";
				} else if (combined > 80 && combined <= 100) {
					grade = "Pass with distinction";
				}
			}
		} catch (Exception e) {
			grade = "Invalid input";
		}
		System.out.println(grade);
	}
}
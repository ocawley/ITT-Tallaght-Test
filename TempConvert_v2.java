/**
 *
 * @author Oisin
 */
public class TempConvert_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp;
        String scale;
        double celsius, fahrenheit;
		try {
			temp = Integer.parseInt(args[0]);
			scale = String.valueOf(args[1]);
			if ("C".equalsIgnoreCase(scale)) {
				celsius = temp;
				fahrenheit = 32 + (celsius * 9 / 5);
				System.out.println(celsius + " C = " + fahrenheit + " F");
			} else if ("F".equalsIgnoreCase(scale)) {
				fahrenheit = temp;
				celsius = (fahrenheit - 32) * 5 / 9;
				System.out.println(fahrenheit + " F = " + celsius + " C");
			} else {
				System.out.println("Invalid Temperature Scale");
			}
        } catch (Exception e) {
            System.out.println("Invalid parameters");
        }            
    }
}

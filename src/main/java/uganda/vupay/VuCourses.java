

package uganda.vupay;
  import java.util.Scanner;

/**
 *
 * @author anita
 */
public class VuCourses {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        String moduleCode;
        String moduleName = "";
        int tuition = 0;

        System.out.print("Enter Module Code (BSF, BIT, BCS, BCE): ");
        moduleCode = input.nextLine().toUpperCase();

        if (moduleCode.equals("BSF")) {
            moduleName = "BSc. Software Engineering";
            tuition = 900000;
        } 
        else if (moduleCode.equals("BIT")) {
            moduleName = "BSc. Information Technology";
            tuition = 750000;
        } 
        else if (moduleCode.equals("BCS")) {
            moduleName = "BSc. Computer Science";
            tuition = 800000;
        } 
        else if (moduleCode.equals("BCE")) {
            moduleName = "BSc. Computer Engineering";
            tuition = 950000;
        } 
        else {
            System.out.println("Wrong Module Code details");
            return;
        }

        System.out.println("\nCourse Details:");
        System.out.println("Course Name: " + moduleName);
        System.out.println("Tuition: UGX " + tuition);
    }
}
    


package ex;
import java.util.*;

public class pan_card {
    String val;
    String randomChars;
    String firstLetter;
    String randomNumbers;
    char randomLastChar;

    void rannum() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int rannum = (int) (Math.random() * 10);
            sb.append(rannum);
        }
        randomNumbers = sb.toString();
    }

    void ranchar() {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            char randomchar = (char) (r.nextInt(26) + 'A');
            sb.append(randomchar);
        }
        randomChars = sb.toString();
    }

    void randomLastCharacter() {
        Random r = new Random();
        randomLastChar = (char) (r.nextInt(26) + 'A');
    }

    void purpose() {
        System.out.println("\nP -> individual\nC -> company\nA -> Association\nH -> HUF\nT -> Trust");
        System.out.println("Choose any one option:");
        Scanner pu = new Scanner(System.in);
        String purpose = pu.next().toUpperCase(); // Convert input to uppercase to match cases

        switch (purpose) {
            case "P":
                val = "P";
                break;
            case "C":
                val = "C";
                break;
            case "A":
                val = "A";
                break;
            case "H":
                val = "H";
                break;
            case "T":
                val = "T";
                break;
            default:
                System.out.println("Invalid option. Please choose a valid purpose.");
                purpose();
                return; // Exit the current method and restart
        }
    }

    void first_letter() {
        System.out.println("\nEnter your Name:");
        Scanner name = new Scanner(System.in);
        String n = name.nextLine();
        firstLetter = String.valueOf(n.charAt(0)).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println("PAN CARD NUMBER GENERATION");
        pan_card random = new pan_card();
        
        // Call methods to generate parts of PAN number
        random.ranchar();
        random.purpose();
        random.first_letter();
        random.rannum();
        random.randomLastCharacter();
        
        // Concatenate all parts
        String panNumber = random.randomChars + random.val + random.firstLetter + random.randomNumbers + random.randomLastChar;
        
        // Display the final PAN number
        System.out.println("Generated PAN Number: " + panNumber);
    }
}

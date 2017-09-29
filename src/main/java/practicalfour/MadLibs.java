package practicalfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class MadLibs {

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Gregory M. Kapfhammer " + new Date());
    // declare the starting file and scanner
    File madInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      madInputsFile = new File("input/madlibs_inputs.txt");
      scanner = new Scanner(madInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the words and numbers in a story

    // Step Two: Display a final thankyou message
    System.out.print("\nThanks for using the MadLibs program. \nHave an awesome day.");
  }

}

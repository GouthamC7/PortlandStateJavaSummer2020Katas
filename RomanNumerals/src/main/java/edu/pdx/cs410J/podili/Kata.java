package edu.pdx.cs410J.podili;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {


  public static String toRomanNumeral(int number) {
    switch (number) {
      case 1: return "I";

      case 5: return "V";

      case 10: return "X";

      case 50: return "L";

      case 100: return "C";

      case 500: return "D";

      case 1000: return "M";

      default: throw new IllegalStateException("Invalid number");
    }

  }
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }
}
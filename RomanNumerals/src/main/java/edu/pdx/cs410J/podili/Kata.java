package edu.pdx.cs410J.podili;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {


  public static String toRomanNumeral(int number) {
    StringBuilder numeral = new StringBuilder();

    if (number < 5) {
      // Up to III
      if (number < 4) {
        for (int i = 0; i < number; i++) {
          numeral.append("I");
        }
      } else {
        // number == 4
        numeral.append("IV");
      }
    } else if (number < 10) {
      // number is 5-9
      if (number == 5) {
        numeral.append("V");
      }

      /*
      else if (number == 9) {
        numeral.append("IX");
      }


      if (number < 9) {
        for (int i = 0; i < number; i++) {
          numeral.append("I");
        }
      } else {
        // number == 4
        numeral.append("IV");
      }
      */

    } else if (number < 50) {
      // number is 10-49
      if (number == 10) {
        numeral.append("X");
      }

    } else if (number < 100) {
      // number is 50-99
      if (number == 50) {
        numeral.append("L");
      }

    } else if (number < 500) {
      // number is 100-499
      if (number == 100) {
        numeral.append("C");
      }

    } else if (number < 1000) {
      // number is 500-999
      if (number == 500) {
        numeral.append("D");
      }

    } else {
      // number is >= 1000
      if (number == 1000) {
        numeral.append("M");
      }
    }

    return numeral.toString();
  }
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }
}
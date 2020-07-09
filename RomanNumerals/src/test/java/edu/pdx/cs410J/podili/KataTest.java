package edu.pdx.cs410J.podili;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class KataTest
{



  @Test
  public void toRomanNumeral_One_ShouldReturnI() {
    assertThat(Kata.toRomanNumeral(1),equalTo("I"));
  }

  @Test
  public void toRomanNumeral_Five_ShouldReturnV() {
    assertThat(Kata.toRomanNumeral(5),equalTo("V"));
  }

  @Test
  public void toRomanNumeral_Ten_ShouldReturnX() {
    assertThat(Kata.toRomanNumeral(10),equalTo("X"));
  }

  @Test
  public void toRomanNumeral_Fifty_ShouldReturnL() {
    assertThat(Kata.toRomanNumeral(50),equalTo("L"));
  }

  @Test
  public void toRomanNumeral_Hundred_ShouldReturnC() {
    assertThat(Kata.toRomanNumeral(100),equalTo("C"));
  }

  @Test
  public void toRomanNumeral_FiveHundred_ShouldReturnD() {
    assertThat(Kata.toRomanNumeral(500),equalTo("D"));
  }

  @Test
  public void toRomanNumeral_Thousand_ShouldReturnM() {
    assertThat(Kata.toRomanNumeral(1000),equalTo("M"));
  }

  @Test
  public void toRomanNumeral_Two_ShouldReturnII() {
    assertThat(Kata.toRomanNumeral(2),equalTo("II"));
  }

  @Test
  public void toRomanNumeral_Three_ShouldReturnIII() {
    assertThat(Kata.toRomanNumeral(3),equalTo("III"));
  }

  @Test
  public void toRomanNumeral_Four_ShouldReturnIV() {
    assertThat(Kata.toRomanNumeral(4),equalTo("IV"));
  }

  // We left off here!
  @Ignore
  @Test
  public void toRomanNumeral_Seven_ShouldReturnVII() {
    assertThat(Kata.toRomanNumeral(7),equalTo("VII"));
  }

  @Ignore
  @Test
  public void toRomanNumeral_Nine_ShouldReturnIX() {
    assertThat(Kata.toRomanNumeral(9),equalTo("IX"));
  }
}

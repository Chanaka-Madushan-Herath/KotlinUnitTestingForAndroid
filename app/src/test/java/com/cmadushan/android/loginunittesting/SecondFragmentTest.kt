package com.cmadushan.android.loginunittesting

import org.junit.Assert.*
import org.junit.Test

class SecondFragmentTest{

  //Test String
  @Test
  fun should_return_fullName(){
    val secondFragment = SecondFragment()
    assertEquals("Hello, Chanaka Herath",secondFragment.createFullName("Chanaka","Herath"))
  }
  @Test
  fun should_not_return_fullName(){
    val secondFragment = SecondFragment()
    assertNotEquals("Chanaka Herath",secondFragment.createFullName("Chanaka","Madushan"))
  }


  //Test SquareRoot
  @Test
  fun squareRoot_for_positive_number(){
    val secondFragment = SecondFragment()
    assertEquals(9,secondFragment.findSquareRoot(81))
  }
  @Test
  fun squareRoot_for_negative_number(){
    val secondFragment = SecondFragment()
    assertEquals(0,secondFragment.findSquareRoot(-81))
  }
  @Test
  fun squareRoot_for_Zero(){
    val secondFragment = SecondFragment()
    assertEquals(0,secondFragment.findSquareRoot(0))
  }
}
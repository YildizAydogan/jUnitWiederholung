package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class Assertions {

//===============To Assert=======================================================================

    @Test
    @DisplayName("ToAssert Testi")   //varsayimlar, iddialar
    void testToAssert() {
        int actual = "Neumeier".length();
        int erwarter = 8;
        // assertEquals(8,actual);//inline style :Nicht immer empfehlenswert!!!
        //assertEquals(erwarter,actual);
        // assertEquals(erwarter,beklenen);//Der erwartete und der tatsächliche Wert  können vertauscht werden!!
        assertEquals(erwarter, actual, "Der erwartete und der tatsächliche Wert sind nicht gleich.");//Wenn geschaffenen Zustand false ist, schreibt die Message....
        //1  assertEquals--> positive test :Es testet den erwarteten und den tatsächlichen Zustand auf Gleichheit, wenn sie gleich sind, ist der Test bestanden.
        //  assertEquals(4, "Inna".length(), "inline style not supperted");

        //2  assertNotEquals--> negative test :Wenn der erwartete und der tatsächliche Wert nicht GLEICH sind,passed der Test.
        assertNotEquals(9, actual);

        //3  assertTrue--> pozitive test :Wenn geschaffenen Zustand(blooen) true ist,  passed der Test.
        assertTrue(erwarter == actual);//passed
        erwarter = 7;
        // assertTrue(erwarter==actual);//failed --> 7!=8

        //4  assertFalse--> negative test :Wenn geschaffenen Zustand(blooen) false ist,  test passed.
        assertFalse(erwarter == actual);

    }

//===============Convert===========================================================================


    @Test
    @DisplayName("ConvertUpper Test") //dönüstürmek
    void testcUpper() {

        String erwarter = "HEIKE";
        String actual ="Heike".toUpperCase();
        assertEquals(erwarter, actual);  //Wenn Testdaten gleich sind, passed.Ansonst passed nicht.
        assertEquals(erwarter, actual, "Nicht gleich");//passed
        //////////////////////////////////////////////
        assertTrue(actual.endsWith("KE"));//passed
        assertTrue(erwarter.equals(actual));//passed
        //////////////////////////////////////////////
        actual =null;
        assertNull(actual,"Leider actuelle Wert ist nicht Null!!!");//passed
    }

//==============To Contain===========================================================================

      @Test
      @DisplayName("ToContain Test")  //icermek
         void testtoContain() {

        boolean erwarter="Sternchen".contains("chen");
        boolean actual =false;
       // assertEquals(erwarter, actual,"Es gibt keine String Wert"); //failed
     }

//==============Arrays===================================================================================

    @Test
    @DisplayName("Array Test")
    void arr(){
      String str="Hallo Welt";
      String actual[]=str.split(" ");
      String erwarter[]={"Hallo","Welt"};
      assertArrayEquals(erwarter, actual,"Naturlich falche Redewendung:)");










    }

























}

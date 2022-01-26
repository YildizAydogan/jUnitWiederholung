package org.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedDisableTesting {


    @BeforeEach
    void beforeMethod(){
      System.out.println("   Before hat gearbeited   ");
      System.out.println("         ******            ");

  }
    @AfterEach
    void afterMethod(){
        System.out.println("    After hat gearbeited  ");
        System.out.println("         *******         ");
}





    @RepeatedTest(5) //kac kere calisacak onu yaziyorum
    @DisplayName("Contains Method  runned 5mal")
    void testtoContain() {

        boolean erwarter="Sternchen".contains("chen");
        boolean actual =true;
         assertEquals(erwarter, actual,"Es gibt keine String Wert"); //failed
        System.out.println("   Containsmethod runned   ");
        System.out.println("     **********            ");




    }

    @RepeatedTest(7) //7mal gearbeited
    @DisplayName("Sum Method runned 7mal")
    void sum(){
     assertEquals(5,(2+3));
        System.out.println("    summethod runned    ");
        System.out.println("      ************      ");
    }

     @Disabled
     @Test
    void wassermelonTest(){

        String wassermelon="schreibe ich einfach einen Satz";
         assertEquals(31, wassermelon.length());




     }








}

package org.junit;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



    class Praktice_StringChangeTest {
    Praktice_StringChange  strChange; //class static olmadigindan strchange obj create edildi

    @BeforeEach
    void setUp() {

        strChange = new Praktice_StringChange();
        System.out.println("test verisi girişi yapılir");
    }

    @AfterEach
    void tearDown() {
        strChange=null;
        System.out.println("test verisi silinir");
    }

    @ParameterizedTest
    @CsvSource(value = {"BC,ABC","'',A","'',AA","B,B","BCDE,BCDE"})
    void ilkIkıASil(String expected,String actual) {


        assertEquals(expected,strChange.ilkIkıASil(actual));
   //  assertTrue(expected.equals(strChange.ilkIkıASil(actual)));
        System.out.println(" ilk iki A varsa silinir");

    }


}
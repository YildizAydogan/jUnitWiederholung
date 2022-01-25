package org.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
public class ParametirezedTesting {

    @Test
    void längegrößerals0 (){

    assertTrue("yildiz".length()>0);
    assertTrue("suleyman".length()>5);
    assertTrue("salim".length()>4);
    assertTrue("hakan".length()>2);
    assertTrue("hatice".length()>4);    //---> Dynamic nicht! Daher wird nicht empfohlen!!!!
                                                // Da nachdem FailedTest man defected Test nicht gefunden werden kann, wird es nicht empfohlen

}

    //Singular Kondition...
    //Testen Sie mit der Methode length(), ob für die folgenden Bedingungen ein Wert größer als 0 zurückgegeben wird.
    //Konditionen: "yildiz","suleyman","kursat","omer"

    @ParameterizedTest
 // @ValueSource(strings={"yildiz","suleyman","kursat","omer","x"}) // str.length()>2) --> Failed
    @ValueSource(strings={"yildiz","suleyman","kursat","omer"})  //bu test sadece bu isimler icin calisir baska birsey icin calismaz
    void längegrößerals0Prmtr(String str){
    assertTrue(str.length()>2);   //alle Passed
 // assertTrue(str.length()>5);   //Yildiz, suleyman, kursad Passed
 // assertTrue(str.length()>7);   //Nur SUleyman Passed

    }


    //Multipel Konditionen...
    //Jede Parameter wird mit Key and Value in den Test Method runned, getested.
    @ParameterizedTest
    @CsvSource(value={"yildiz,YILDIZ","suleyman,SULEYMAN","kursat,KURSAT"})  //CSV: COmma seperated values
    void großbuchstabenumwandeln (String expectedgb,String actualname){
    assertEquals(expectedgb.toUpperCase(),actualname); //Failed



    }

    @ParameterizedTest(name="Expected(BUYUKHARF):{0},actual(cevirilecek):{1}")//CsvFileSourse syntax
    //CSV : comma-separated values --> virgülle ayrılmış degerler
    //@CsvFileSource--> belirli bir dosyadan datalari okutarak test için parametre olarak kullanır.
    //@CsvFileSource--> src/test/resource klasoru altına konumlanmıs dosyaya direk ulaşır.
    // numLinesToSkip = a --> a:start line dan itibaren kalan satırlara parametre olarak method'da run edilir
    @CsvFileSource(resources = "/data.csv",numLinesToSkip = 1)//data.csv dosyasındaki 1. satır haric verileri parametre olarak test methoduna run eder
    void bykHrfCvrFile(String  cevrilecek ,String bykHrf){
        assertEquals(bykHrf,cevrilecek.toUpperCase());

    }



































}

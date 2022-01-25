package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Exceptions {
    /*=============================================================
    assertThrow() method -->Testet, ob der angegebene Prozess (Executable) eine Ausnahme des angegebenen Typs auslöst.
    Es braucht also 2 Parameter.
        1.Parameter --> expected(erwarter) Exception(istisna) art,
        2.Parameter --> actual(aktuell) ist der auszuführende Prozess (çalıştırılacak olan işlemdir.)
    Eğer işlem belirtilen türde bir exception oluşturursa test başarılı olur.TEST PASSED
    Ama exception oluşmaz ise veya türü yanlış olursa test başarısız olur.TEST FAILED
   TRİCKK : Exception.io türünde parent-child ilişkisi var ise yine test başarılı sayılır.
   ======================================================================================*/

    @Test
    @DisplayName("NumberFormatException Test")
    void testException01(){
        String strNum="202a";
      //  assertThrows(Exception.class,()->Integer.parseInt(strNum)); //Failed
          assertThrows(Exception.class,()->Integer.parseInt(strNum)); //Passed -->Dynamic
      //  assertThrows(Exception.class,()->Integer.parseInt("571")); //Failed  -->Dynamic nicht.

    }
    @Test
    @DisplayName("NulPointerException Test")
    void testException02(){
        String str=null;
        String str1="Stein";
          assertThrows(Exception.class,()->str.length()); //Passed -->Dynamic
   //     assertThrows(NullPointerException.class,()->str1.length()); //Failed -->Dynamic

    }

    @Test
    @DisplayName("IllegalArgumentException Test")
    void testException03(){
        String strNum="202a";
        //  assertThrows(Exception.class,()->Integer.parseInt(strNum)); //Failed
        //  assertThrows(Exception.class,()->Integer.parseInt(strNum)); //Passed -->Dynamic
        //  assertThrows(Exception.class,()->Integer.parseInt("571")); //Failed  -->Dynamic nicht.
          assertThrows(Exception.class,()->altPrint(-2));  //Passed
        //  assertThrows(Exception.class,()->altPrint(12));  //Failed

    }
       void altPrint(int alt){

       if(alt<0){
        throw new IllegalArgumentException();

       }else System.out.println(alt);


    }

    @Test
    @DisplayName("ArithmeticException Test")
    void testException04() {

         assertThrows(ArithmeticException.class,()->dvsn(5,0)); //Passed
    //   assertThrows(ArithmeticException.class,()->dvsn(5,5)); //Failed

    }

    int dvsn(int a, int b){
        return a/b;
    }


















}

package org.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Before_After_EachAll {
/* =========================================== @BeforeEach - @AfterEach ============================================

 A-) Eine Methode, die die @BeforeEach-Annotation verwendet, wird ausgeführt, bevor jede Testmethode ausgeführt wird.
     Dank dieser Funktion kann es zum Einstellen (Initialisieren) von Testdaten verwendet werden.
     Fahrzeug -> Kupplung drückt in allen Gängen
     Gebet --> Fatiha von jedem Rakat
 B-) Eine Methode mit @AfterEach-Anatation wird ausgeführt, nachdem jede Testmethode abgeschlossen ist.
     Dank dieser Funktion kann es zum Bereinigen von Testdaten verwendet werden.
     Fahrzeug --> Fuß nicht in jedem Gang von der Kupplung nehmen
     Gebet --> Aufstehen in jeder Rak'ah
 C-) JUnit4 verwendete statt dieser Annotationen @Before und @After.

 D-) In der Annotation @AfterEach oder @BeforeEach ist die Schreibreihenfolge nicht wichtig.
      (Hangisi önce önce yazılırsa yazılsın JAVA, önce @BeforeEach  sonra @AfterEach compile eder.)
*/
      @AfterEach
  //  @DisplayName("Clean method") -> Bunu yazdirmadi  onceki display name i yazdiriyor
      void cleanup(TestInfo info) {
       str = "";
       System.out.println(info.getDisplayName()+ " Alles wird geputzt");
       System.out.println("   ******************  ");
   }


     String str = "";
     @BeforeEach
     void setup(TestInfo info){
         str = "Wassermelon";
       System.out.println(info.getDisplayName());  //Length method test
       System.out.println(info.getTestClass());  //Optional[class org.junit.Before_After_EachAll]
       System.out.println(info.getTestMethod());  //Optional[void org.junit.Before_After_EachAll.strLength()]
       System.out.println(info.getTags()); //[]
       System.out.println("   ****************  ");


     }



     @Test
     @DisplayName("Length method test")
     void strLength(){
       int erwarter=11;
       int actual=str.length();
       assertEquals(erwarter,actual,"ungleichwert"); //passed
       System.out.println("Test String");
         System.out.println("   **************** ");
     }


    @Test
    @DisplayName("Array Test")
    void arr(){
        String str="Hallo Welt";
        String actual[]=str.split(" ");
        String erwarter[]={"Hallo","Welt"};
        assertArrayEquals(erwarter, actual,"Naturlich falche Redewendung:)");
        System.out.println("Test Array");
        System.out.println("   *****************   ");

    }

/*
      ========================================== @BeforeAll - @AfterAll ===============================================
A-) @BeforeALl tüm test methodlarından önce BİR KERE çalışan bir method oluşturmak için kullanılır.
       Dolayısıyla veritabanı içeren bir test işleminde ilk olarak veritabanına bağlanmak gerekeceğinden @BeforeAll
       anatosyonu ile bir method tanımlanarak ilk olarak veritabanına bağlanma prosedürü işletilebilir.
        Araç --> kontagı acma   Namaz --> Namazın tekbiri...


B-) @AfterAll ile tüm test metotlari bittikten sonra BİR KERE çalışan bir metot oluşturulabilir.
       Bu özelliği sayesinde testler bittikten sonra veritabani oturumu kapatılabilir.
       Araç --> kontagı kapatma   Namaz --> Namazın selamı...


   AHAN DA TRİCKKK: @BeforeAll ve @AfterAll anotasyonlarının kullanıldığı metotlar static olmalıdır.
   Not2: JUnit4 de @BeforeClass ve  @AfterClass metotları kulanılmaktadır.

   Kıng of TRICKK : @Before ve @After anotasyonları ayrı bir test gibi tek başına  çalışmaz test2lerin çalışma
                   hiyerraşisini organize eder. Anotasyonlarının yazım sırası run sırasını etkilemez anotasyonlar kendi hiyerarşisine göre run olur

   */

    @AfterAll
    static void veriTabanıBaglantıKapatma() {
        System.out.println("@AfterAll--> veritabanı baglantısı kapat (KONTAK KAPATILDI)");
        System.out.println("   *****************   ");

    }




    @BeforeAll
    static void veriTabanıBaglantıAcma() {
        System.out.println("@BeforeAll--> veritabanı baglantısı kuruldu (KONTAK AÇILDI)");
        System.out.println("   ******************   ");

    }





































}

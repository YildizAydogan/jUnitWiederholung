package org.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class Praktice_ArraysTest {


    @ParameterizedTest
    @MethodSource("arrayKaynagi")//test parametre kaynagı
    void arrayKiyasla(boolean sonuc,Object [] x,Object [] y) {
        assertEquals(sonuc,Praktice_Arrays.arrayTest(x,y));
        //arraySaglayici methoddan gelen boolen ve obj[] array parametreleri
        // esitmi methoda gönderip eşitliği iddia edilen sorgu.

    }
    //return type
    //Stream bize javadan aldigi interface ile bize akisi sagliyor
    //Akisin icerisine de Argumentleri yerlestiriyor. String vs ne deger verirseniz
    static Stream<Arguments> arrayKaynagi(){
        //Trick :Return; tek parametre için dondurulurken
        // Stream<Arguments> komutu; ile 3 parametre return edilebilir
        //arrayKaynagi()--> methodu Stream class'ına Argument parametreleri return eder
        //Argumentler jUnitten gelir, Stream ise java clasindan
        Integer []a1={1,2,3,4};
        Integer []a2={4,3,2,1};
        String [] s1={"h","a","y"};
        String [] s2={"h","y","a"};
        Double [] d1={1.2,2.3,5.6};
        Double [] d2={5.6,2.3,1.2};
        Float [] f1={1f,2f,67f,35f};
        Float [] f2={11f,20f,67f,35f};


        return Stream.of(Arguments.of(true,a1,a2),
                Arguments.of(true,s1,s2),
                Arguments.of(true,d1,d2),
                Arguments.of(false,f1,f2));

    }

  /*   :)     */












}
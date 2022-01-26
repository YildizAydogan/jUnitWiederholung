package org.junit;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;


public class TestingPerformance {
    @Test
    void performance() {

//assertTimeout(Duration.ofSeconds(2),()-> IntStream.rangeClosed(0,100).sum()); 0'dan yüze kadar sayilarin toplami 2 saniyede gerceklesir iddiasini test etti
//assertTimeout(Duration.ofSeconds(2),()-> IntStream.rangeClosed(0,100000).forEach(System.out::println)); //print komutu performansa dahil
//assertTimeout(Duration.ofSeconds(1),()-> IntStream.rangeClosed(0,100000)).forEach(System.out::println); //dahil degil
assertTimeout(Duration.ofMillis(1),()-> LongStream.rangeClosed(0,1000)).forEach(System.out::println); //dahil degil




    }



}

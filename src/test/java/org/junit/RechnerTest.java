package org.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RechnerTest {

    @Test
    void addition() { assertEquals(5, Rechner.addition(2,3));
    }

    @Test
    void multiplikation() { assertAll(()->assertEquals(8,Rechner.multiplikation(2,4)),
            ()->assertEquals(4,Rechner.multiplikation(2,2)),
            ()->assertEquals(10,Rechner.multiplikation(1,10)),
            ()->assertEquals(4,Rechner.multiplikation(-1,-4))

            );
    }
}
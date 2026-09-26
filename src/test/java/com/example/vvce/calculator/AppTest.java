package com.example.vvce.calculator;
//import com.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App app = new App();
    @Test
    void testAdd() {
    	assertEquals(25,app.add(20,5));
    }
    @Test
    void testSubtract() {
    	assertEquals(15,app.sub(20,5));
    }
    
}

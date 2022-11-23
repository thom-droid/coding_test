//package test;
//
//
//import org.junit.jupiter.api.Test;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class StringInternTest {
//
//    @Test
//    public void testStringInterned() {
//        String str = new String("String");
//        String newString = new String("String");
//        assertNotSame(str, newString);
//        assertEquals(str, newString);
//
//        String internedString = newString.intern();
//        assertSame(str, internedString);
//        assertEquals(str, internedString);
//
//    }
//}
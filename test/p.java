package test;

import test.m.Microwave;
import test.m.packedlunch;

public class p { 
      public static void main(String[] args) {
        Microwave m = new Microwave( );
        packedlunch f = new packedlunch("Kai", 200, 2);
        m.open();
        m.put(f);
        m.setLevel(2);
        m.setTime(2);
        m.close();
    }
}

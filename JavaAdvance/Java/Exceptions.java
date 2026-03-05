package JavaAdvance.Java;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions { 
    public static void main(String[] args) {
       try{
            FileInputStream file = new FileInputStream("file.txt");
            byte[] buffer = new byte[1024];
            int byteRead = 0;
            
       } catch(Exception e){
            e.addSuppressed(e);
       }
    }
}

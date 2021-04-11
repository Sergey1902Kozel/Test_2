package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        String text="Hello";

        byte [] bytes=text.getBytes();
        try  (ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(bytes);
              BufferedInputStream bufferedInputStream=new BufferedInputStream(byteArrayInputStream);
              FileOutputStream fileOutputStream=new FileOutputStream("C://java//t.txt");
              BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream)){
            int i;
            byte [] ints=new byte[bufferedInputStream.available()];
            bufferedInputStream.read(ints);
            bufferedOutputStream.write(ints);


        }
        catch (Exception er){
            System.out.println(er.getMessage());
        }
	// write your code here
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class CompressionDecorator extends DataSourceDecorator{
   public String decompress(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        try {
            String decode = URLDecoder.decode(str, "UTF-8");

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ByteArrayInputStream in = new ByteArrayInputStream(decode.getBytes("ISO-8859-1"));
            GZIPInputStream gunzip = new GZIPInputStream(in);
            byte[] buffer = new byte[256];
            int n;
            while ((n = gunzip.read(buffer)) >= 0) {
                out.write(buffer, 0, n);
            }
            return out.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
   public String compress(String str) {
       if (str == null || str.length() == 0) {
           return str;
       }
       try {
           ByteArrayOutputStream out = new ByteArrayOutputStream();
           GZIPOutputStream gzip = new GZIPOutputStream(out);
           gzip.write(str.getBytes());
           gzip.close();
           return URLEncoder.encode(out.toString("ISO-8859-1"), "UTF-8");
       } catch (IOException e) {
           e.printStackTrace();
       }
       return null;
   }
   @Override
   public void writeData(String data){
       super.writeData(compress(data));
   }
   public String writeData(){
       return decompress(super.readData());
   }
}

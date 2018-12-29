package com.tnpy.datacollector;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * ���𽫴����Exception�еĴ�����Ϣ��ȡ������ת�����ַ�����
 */
public class ExceptionWriter {

    public static String getErrorInfoFromException(Exception e) { 
            
            StringWriter sw = null;
            PrintWriter pw = null;
            
            try {  
                sw = new StringWriter();  
                pw = new PrintWriter(sw);  
                e.printStackTrace(pw);  
                return "\r\n" + sw.toString() + "\r\n";  
                
            } catch (Exception e2) {  
                return "��������δ��ȡ��������Ϣ�����������!";  
            } finally {
                try {
                    if (pw != null) {
                        pw.close();
                    }
                    if (sw != null) {
                        sw.close();
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
}
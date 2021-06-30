package com.ashish.test;


import java.text.MessageFormat;

public class Format {
    public static void main(String[] args) {
        //String queueStr = formatString("OFR.DISPATCH.{0}_UPDATE","6935");
    }
    private String formatString(String queueStr, String storeno) {
        String queueUrl = MessageFormat.format(queueStr,storeno);
        return queueUrl;
    }
}

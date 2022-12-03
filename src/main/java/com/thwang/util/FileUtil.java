package com.thwang.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FileUtil {
  public static void main(String[] args) {
    try {
      // 讀
      InputStreamReader inputStreamReader =
          new InputStreamReader(new FileInputStream("/Users/richard/Documents/hardWord.txt"), "gb18030");
      StringBuilder stringBuilder = new StringBuilder();
      // int n;
      // while ((n = in.read()) != -1) {
      //   stringBuilder.append((char) n);
      // }
      // in.close();

      // File file = new File("/Users/richard/Documents/hardWord.txt");
      // FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      while (bufferedReader.ready()) {
        stringBuilder.append(bufferedReader.readLine());
      }
      inputStreamReader.close();
      // fileReader.close();
      String textBig5 = stringBuilder.toString();
      // 難字處理
      String textUtf8 = new String(textBig5.getBytes("gb18030"), StandardCharsets.UTF_8);
      String textUtf81 = new String(textBig5.getBytes("utf8"), StandardCharsets.UTF_8);
      String textUtf82 = new String(textBig5.getBytes("big5"), StandardCharsets.UTF_8);
      // 寫
      FileWriter fileWriter = new FileWriter("/Users/richard/Documents/hardWordUtf8.txt");
      // fileWriter.write(textUtf8);
      fileWriter.write(textBig5);
      fileWriter.flush();
      fileWriter.close();
      System.out.println("done");
    } catch (IOException e) {
      System.out.println("error:" + e.getMessage());
      // throw new RuntimeException(e);
    }
  }
}

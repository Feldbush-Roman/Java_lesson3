package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.spi.AbstractResourceBundleProvider;

/*
2. Написать программу, которая считывает строки из файла, если в строке есть хоть одна цифра,
программа предлагает два варианта, либо продолжить работу, либо завершить работу
 и отпечать на экран все строки которые были до. Возбуждение программой предложения действий для
 пользователя сделать с помощью исключений
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        // Encyclopedia encyclopedia=new Encyclopedia(121,"21311","12312",2323,"3111");
        //Directory directory=new Directory(11221,"21312111","12121312",2312123,"31211211");
        //System.out.println(directory.toString());
        String inputFileName;
        String outFileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputFileName = reader.readLine();
            outFileName = reader.readLine();
        }
        ArrayList<String> box = new ArrayList<>();
        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFileName))) {
            while (inputFileReader.ready()) {
                box.add(inputFileReader.readLine());
            }
        }
        try (BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outFileName))) {
            for (String s : box) {
                outputFileWriter.write(s);
            }
        } catch (Exception e) {
            System.out.println("продолжить работу ?");
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            String s = rd.readLine();
            if (s.equals("да")) {

            } else if (s.equals("нет")) {
            }
        }
    }
}

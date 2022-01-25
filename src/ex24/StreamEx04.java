package ex24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

class MyScanner {

    InputStream in;// 고정된 길이의 숫자
    InputStreamReader ir;// 고정된 길이의 문자
    BufferedReader br;// 가변의 길이의 문자

    MyScanner(InputStream in) {
        this.in = in;
        this.ir = new InputStreamReader(in);
        this.br = new BufferedReader(ir);
    }

    public String readLine() throws IOException {
        String line = br.readLine();
        return line;
    }
}

public class StreamEx04 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner(System.in);
        try {
            String line = sc.readLine();
            System.out.println("받은 문자열" + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
 * package lotto;
 * 
 * import java.util.HashSet;
 * import java.util.Random;
 * import java.util.TreeSet;
 * 
 * public class 로또번호 {
 * public static void main(String[] args) {
 * Random r = new Random();
 * 
 * HashSet<Integer> lottoNum = new HashSet<Integer>();
 * 
 * for (int i = 0; i < 6; i++) {
 * 
 * int n = r.nextInt(45) + 1;
 * 
 * lottoNum.add(n);
 * 
 * if (lottoNum.size() == 6) {
 * break;
 * }
 * }
 * 
 * System.out.println(lottoNum);
 * 
 * TreeSet<Integer> arrange = new TreeSet<>(lottoNum);
 * 
 * System.out.println(arrange);
 * }
 * }
 */
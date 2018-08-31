import java.util.Scanner;

public class Concatinate {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println((stringconcatinate(name)));
}
public static String stringconcatinate(String name){
    String s="Hello ".concat(name).concat("!");
    return s;}
}

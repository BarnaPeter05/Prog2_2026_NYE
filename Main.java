import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        int szam = 0123;
        System.out.println("A szám értéke: "+ szam);
        //A szám mögötti f: float tipusú,nélküle double tipus
        float pi = 3.1415f;
        System.out.println("Pi = " + pi);
        double pi2 = 3.1415;
        System.out.println("Pi = " + pi);
        double tort = 45.7e3;
        System.out.println("Tört = " + tort);
        char karakter = '\u2713';
        System.out.println("Karakter = " + karakter);
        String szoveg = "barackpalinka";
        System.out.println("Szöveg: " +szoveg.substring(0,6));
        boolean flag = true;
        if (flag){
            System.out.println("Igaz a flag értéke");
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Adj egy számot: ");
        szam = input.nextInt();
        System.out.println("A kapott szám: " + szam);
        System.out.print("Adj meg egy szöveget: ");
        szoveg = input.nextLine();
        System.out.println("A kapott szöveg: " + szoveg);
    }
}
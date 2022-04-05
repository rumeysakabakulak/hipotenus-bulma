import java.util.Scanner;
public class HipotenüsHesaplama {
    public static void main(String[] args) {
        int a , b;
        double c ;
        Scanner inp = new Scanner(System.in);

        System.out.print("a kenarının uzunluğu : ");
        a = inp.nextInt();

        System.out.print("b kenarınun uzunluğu : ");
        b = inp.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs Uzunluğu : " + c);
    }
}

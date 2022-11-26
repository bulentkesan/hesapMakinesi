import java.util.Scanner;

import static java.awt.Color.white;
import static java.awt.SystemColor.menu;

public class hesapMakinesi {

    static int sum(int a , int b) {
        int result = a + b ;
        System.out.println("Toplam : " +result);
        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma : " +result);
        return result;
    }

    static int times(int a, int b){
        int result = a * b;
        System.out.println("Çarpma : " +result);
        return result;
    }

    static int divided(int a, int b){
        int result = a / b;
        System.out.println("Bölüm : " +result);
        return result;

    }

    static int mod(int a, int b){
        return a % b;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

         /*"1- Toplama İşlemi "
           "2- Çıkarma işlemi "
           "3- Çarpma İşlemi "
           "4- Bölme işlemi "
           "5- Modül alma İşlemi"

          */
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölüm işlemi\n"
                + "5- Modül alma\n"
                + "0- Çıkış";

        System.out.println(menu);
       while (true) {
           System.out.print("Lütfen bir işlem seçiniz :");
           select = scan.nextInt();


           if (select == 0) {
               break;
           }
           System.out.println("İlk Sayı :");
           int a = scan.nextInt();
           System.out.println(";İkinci Sayı :");
           int b = scan.nextInt();

           switch (select) {
               case 1:
                   sum(a, b);
                   break;
               case  2:
                   minus(a, b);
                   break;
               case 3:
                   times(a, b);
                   break;
               case 4:
                   divided(a, b);
                   break;
               case 5:
                   System.out.println("mod işlemi :" + mod(a,b));
                   break;
               default:
                   System.out.println("Geçersiz bir işlem girdiniz :");



           }

       }
        System.out.println("Çıkış  yaptınız!");

            }





    }


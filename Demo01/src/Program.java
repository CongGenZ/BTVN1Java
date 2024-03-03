import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args) {

        System.out.println("Hello, Word2!");
        System.out.println("Hello, Word3!");
        System.out.println("Hello, Word3!");


        // kiểu dữ liệu nguyên thuỷ
// số : int(-9 tỷ  +9 tỷ)
        // số: long (-9 tỷ tỷ ; + 9 tỷ tỷ)
        int age = 18;
        System.out.println("tuoi:" + age);

        long money = 15000000;
        System.out.println("money:" + money);


        // chuỗi : string

         String fullName = "nguyen cong";
        System.out.println("fullName:" + fullName);


        // số thực : float, double
         double score = 9.5;
        System.out.println("diem:" + score);


      // tạo thông tin 3 sinh viên
          //sv1
        String msv1 = "sv001";
        String namesv1 = "Tran Nam";
        int tuoisv1 = 25;
         double diemsv1 =5;

        // sv2
        String msv2 = "sv002";
        String namesv2 = "Nguyen Chien";
        int tuoisv2 = 25;
        double diemsv2 = 9.5;

        //sv3

        String msv3 = "sv003";
        String namesv3 = "Tran Nam";
        int tuoisv3 = 25;
        double diemsv3 = 6.6;


        System.out.println("thong sv 1 :" + msv1 + "  " + namesv1 + "  " + tuoisv1 + "  " + diemsv1);
        System.out.println("thong sv 2 :" + msv2 + "  " + namesv2 +"   "+ tuoisv2 +"  "+ diemsv2);
        System.out.println("thong sv 3 :" + msv3 + namesv3 + tuoisv3 + diemsv3);

    }




}

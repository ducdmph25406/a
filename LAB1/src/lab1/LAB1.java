/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LAB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Tính giờ hát");
        System.out.println("2: Tính diện tích");
        System.out.println("3: Tìm nghiệm");
        System.out.println("Mời bạn chọn: ");
        a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Mời bạn nhập thời gian bắt đầu: ");
                int batDau = sc.nextInt();
                System.out.println("Thời gian bắt đầu là: " + batDau + " giờ");
                System.out.println("Mời bạn nhập thời gian kết thúc: ");
                int ketThuc = sc.nextInt();
                System.out.println("Thời gian kết thúc là: " + ketThuc + " giờ ");
                System.out.println("Thời gian hát là: " + (ketThuc - batDau) + " giờ ");
                int tien;
                if (ketThuc - batDau <= 3) {
                    tien = (ketThuc - batDau) * 100;
                } else {
                    tien = (ketThuc - batDau - 3) * 90;
                }
                System.out.println("Số tiền hát là: " + tien);
                break;
            case 2:
                System.out.println("Mời bạn nhập cạnh a: ");
                int canhA = sc.nextInt();
                System.out.println("Mời bạn nhập cạnh b: ");
                int canhB = sc.nextInt();
                System.out.println("Mời bạn nhập cạnh c: ");
                int canhC = sc.nextInt();
                if (canhA + canhB > canhC && canhB + canhC > canhA && canhA + canhC > canhB) {
                    System.out.println("Đây là 3 cạnh của 1 tam giác!");
                    double p = (canhA + canhB + canhC) / 2;
                    double S = Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
                    System.out.println("Diện tích hình tam giác theo công thức heron là:" + S);
                } else {
                    System.out.println("Không tồn tại tam giác!");
                }
                break;
            case 3:
                System.out.println("Nhập vào các hệ số sau:");
                System.out.println("a : ");
                double d = sc.nextDouble();
                System.out.println("b : ");
                double e = sc.nextDouble();
                System.out.println("a : ");
                double f = sc.nextDouble();
                double delta = Math.pow(e, 2) - 4 * d * f;

                System.out.println("Delta = " + (delta));
                if (delta > 0) {
                    System.out.println("Phương trình có hai nghiệm:");
                    double n1 = (-e + Math.sqrt(delta)) / (2 * d);
                    System.out.println("Nghiệm thứ nhất: " + n1);
                    double n2 = (-e - Math.sqrt(delta)) / (2 * d);
                    System.out.println("Nghiệm thứ hai: " + n2);
                } else if (delta < 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else if (delta == 0) {
                    double n = (-e) / (2 * d);
                    System.out.println("Phương trình có nghiệm kép là: " + n);
                    break;
                }
            default:
                break;
        }
    }
}

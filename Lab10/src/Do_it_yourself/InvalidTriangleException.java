package Do_it_yourself;

import java.util.Scanner;

public  class InvalidTriangleException {
    public static void getArea() throws Exception{
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        String[] triangle = new String[5];
        triangle[0] = "Hình 1";
        triangle[1] = "Hình 2";
        triangle[2] = "Hình 3";
        triangle[3] = "Hình 4";
        triangle[4] = "Hình 5";
        for (int i=0;i< triangle.length;i++) {

            System.out.println("Nhập 3 cạnh của " + triangle[i]+" :");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            if (a+b<c || a+c<b || b+c<a ) throw new Exception("Các cạnh bạn nhập ko thể tạo thành 1 hình tam giác") {
            };
            else {
                double p = (a + b + c) / 2;
                double area = (p * (p - a) * (p - b) * (p - c));
                System.out.printf("Diện tích hình tam giác là: "+Math.sqrt(area));
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception{
        getArea();
    }
}


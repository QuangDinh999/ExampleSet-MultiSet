package Ex.MultiSet;

import java.util.Scanner;


public class MainMultiSet {
    public static void Menu() {
        System.out.println("------------Menu------------");
        System.out.println("0. Hiển thị danh sách tập hợp");
        System.out.println("1. Thêm phần tử vào tập hợp");
        System.out.println("----------------------------");

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        MultiSet s1 = new MultiSet();

        do{
            Menu();
            System.out.print("Nhập lựa chọn: ");
            int choice = input.nextInt();
            if(choice < 0 || choice > 1) {
                throw new RuntimeException("Nhập sai lưaj chọn");
            }
            if(choice == 0) {
                System.out.print("Danh sách phần tử: ");
                s1.getSet();
                System.out.println();
            }else {
                System.out.print("Nhập phần tử vào tập hợp: ");
                s1.setSet(input.nextInt());
            }
        }while (true);
    }
}
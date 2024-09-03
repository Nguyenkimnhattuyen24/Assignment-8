package assignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<>();
        String Check;
        while (true) {
            System.out.println("\n-------- Menu --------");
            System.out.println("1. Nhập Mảng");   
            System.out.println("2. Xuất Mảng");    
            System.out.println("3. Phần Tử Lớn Thứ 2 Trong Mảng");  
            System.out.println("4. Xóa Số Lẻ Trong Mảng");  
            System.out.print("Chọn Menu: ");   
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    mang = Assignment8.Nhap(mang);  
                    break;
                case 2:
                    Assignment8.Xuat(mang);    
                    break;
                case 3:
                    System.out.println("So lon thu 2 trong mang là: " + Assignment8.Max2(mang));  
                    break;
                case 4:
                    Assignment8.Xoa(mang);   
                    break;
                default:
                    System.out.println("Lua chon khong đung. Vui long chon lai. Xin cam on");   
            }
        }
    }
    
}


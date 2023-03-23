import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi kí tự : ");
        String input = scanner.nextLine();
        String maxString = "";// khởi tạo chuỗi dài nhất = trống
        for (int i = 0; i < input.length(); i++) {
            //Khởi tạo chuỗi hiện tại = phần tử đầu tiên taị vị trí thứ i
            String currentString = String.valueOf(input.charAt(i));
            for (int j = i; j < input.length(); j++) {
                //lấy phần tử cuối cùng của chuỗi hiện tại so sánh với phần tử tại j
                int lastIndex = currentString.length()-1;
                //nếu phần tử cuối cùng của chuỗi nhỏ hơn ptu tại j thì sẽ thêm nối tiếp vào chuỗi hiện tại
                if (currentString.charAt(lastIndex)<input.charAt(j)){
                    currentString+=input.charAt(j);
                }
            }
            if (maxString.length()<currentString.length()){
                maxString=currentString;
            }
        }
        System.out.println("Chuối tăng dần dài nhất là : " + maxString);
    }
}

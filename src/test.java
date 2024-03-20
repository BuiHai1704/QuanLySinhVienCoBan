import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        int answer = 1;
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("MENU============================================= \n" +
                    "1. Thêm sinh viên vào danh sách \n" +
                    "2. Hiển thị danh sách \n" +
                    "3. Tìm kiếm thông tin sinh viên dựa theo ID \n" +
                    "4. Xóa 1 sinh viên khỏi danh sách dựa theo ID \n" +
                    "5. Sắp xếp danh sách sinh viên theo điểm giảm dần \n" +
                    "0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Nhập số sinh viên muốn thêm vào danh sách: ");
                    int n = sc.nextInt();
                    try {
                        if (n <= 0)
                            throw new ArithmeticException("Số nhập không hợp lệ");
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        return;
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println("Thêm sinh viên thứ " + (i + 1));
                        studentList.add();
                    }
                    break;
                }
                case 2: {
                    studentList.show();
                    break;
                }
                case 3: {
                    System.out.print("Nhập ID sinh viên cần tìm: ");
                    String findId = sc.next();
                    studentList.search(findId);
                    break;
                }
                case 4: {
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    String findId = sc.next();
                    studentList.remove(findId);
                    break;
                }
                case 5: {
                    studentList.scoreListSorted();
                    studentList.show();
                    break;
                }
                case 0: {
                    answer = 0;
                    break;
                }
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        } while (answer != 0);
    }
}

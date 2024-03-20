import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentList implements StudentActivities {
    private ArrayList<Student> list;

    public StudentList() {
        list = new ArrayList<>();
    }

    public StudentList(ArrayList<Student> list) {
        this.list = list;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    // Thêm 1 sinh viên vào danh sách
    @Override
    public void add() {
        // TODO Auto-generated method stub
        System.out.print("Nhập ID: ");
        String id = new Scanner(System.in).next();
        try {
            if (id.isEmpty())
                throw new Exception("Lỗi để trống ID");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.print("Nhập tên: ");
        String name = new Scanner(System.in).nextLine();
        try {
            if (name.isEmpty())
                throw new Exception("Lỗi để tên trống");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Nhập địa chỉ: ");
        String address = new Scanner(System.in).nextLine();
        try {
            if (address.isEmpty())
                throw new Exception("Lỗi để tên trống");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.print("Nhập năm sinh: ");
        int yearOfBirth = new Scanner(System.in).nextInt();
        try {
            if (yearOfBirth <= 0)
                throw new Exception("Năm sinh không hợp lệ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.print("Nhập lớp: ");
        String classroom = new Scanner(System.in).nextLine();
        try {
            if (classroom.isEmpty())
                throw new Exception("Lỗi để tên lớp trống");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.print("Nhập điểm: ");
        float point = new Scanner(System.in).nextFloat();
        try {
            if (point > 10 && point < 0)
                throw new Exception("Điểm số không hợp lệ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        Student sv = new Student(id, name, address, yearOfBirth, classroom, point);
        if (list.add(sv))
            System.out.println("Thêm thành công...");
        else
            System.out.println("Thêm thất bại...");

    }

    // Hiển thị danh sách
    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("%-6s%-20s%-20s%-10s%-10s%s\n", "ID", "Họ và tên", "Địa chỉ", "Năm sinh", "Lớp", "Điểm số");
        list.forEach(e -> {
            System.out.printf("%-6s%-20s%-20s%-10d%-10s%.2f\n", e.getId(), e.getName(), e.getAddress(),
                    e.getYearOfBirth(), e.getClassRoom(), e.getPoint());
        });
    }

    // Xóa 1 sinh viên khỏi danh sách dựa theo ID
    @Override
    public void remove(String findId) {
        // TODO Auto-generated method stub
        if (list.removeIf(sv -> sv.getId().equals(findId)))
            System.out.println("Xóa thành công...");
        else
            System.out.println("Xóa thất bại...");
    }

    @Override
    public void scoreListSorted() {
        // TODO Auto-generated method stub
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getPoint() < o2.getPoint())
                    return 1;
                else if (o1.getPoint() > o2.getPoint())
                    return -1;
                else
                    return 0;
            }
        });
    }

    // Tìm kiếm và hiển thị thông tin sinh viên theo ID
    @Override
    public void search(String findId) {
        // TODO Auto-generated method stub
        int count = 0;
        for (Student sv : list) {
            if (sv.equals(findId)) {
                System.out.printf("%-6s%-20s%-20s%-10s%-10s%s\n", "ID", "Họ và tên", "Địa chỉ", "Năm sinh", "Lớp",
                        "Điểm số");
                System.out.printf("%-6s%-20s%-20s%-10d%-10s%.2f\n", sv.getId(), sv.getName(), sv.getAddress(),
                        sv.getYearOfBirth(), sv.getClassRoom(), sv.getPoint());
                count = 1;
            }
        }
        if (count == 0)
            System.out.println("Không tìm thấy thông tin sinh viên cần tìm...");
    }

}

public class Student extends Person {
    private String id;
    private String classRoom;
    private float point;

    public Student() {
        super();
    }

    public Student(String id, String name, String address, int yearOfBirth, String classRoom, float point) {
        super(name, address, yearOfBirth);
        this.id = id;
        this.classRoom = classRoom;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String getAddress() {
        // TODO Auto-generated method stub
        return super.getAddress();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public int getYearOfBirth() {
        // TODO Auto-generated method stub
        return super.getYearOfBirth();
    }

    @Override
    public void setAddress(String address) {
        // TODO Auto-generated method stub
        super.setAddress(address);
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public void setYearOfBirth(int yearOfBirth) {
        // TODO Auto-generated method stub
        super.setYearOfBirth(yearOfBirth);
    }

}
package Collections;

public class Student {
    private int age;
    private String stuName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}

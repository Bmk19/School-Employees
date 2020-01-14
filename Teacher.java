public class Teacher {
    String name;
    int age;
    String position;
    int hours;
    int grade;

    public Teacher(String name, int age, String position, int hours, int grade) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.hours = hours;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosotion() {
        return position;
    }

    public int getHours() {
        return hours;
    }

    public int getGrade() {
        return grade;
    }

    public String toString()
    {
        String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nTeaching Position: " + position;
        output += "\nHours: " + hours;
        output += "\nGrade taught: " + grade;

        return output;
    }
}

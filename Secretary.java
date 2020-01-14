public class Secretary {
    String name;
    int age;
    String position;
    double height;
    int hours;

    public Secretary(String name, int age, String position, double height, int hours) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.height = height;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nHeight: " + height + "m";
        output += "\nWeekly hours" + hours;


        return output;
    }
}

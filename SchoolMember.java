public class SchoolMember {
    public static void main(String[] args) {
        {

            Secretary jen = new Secretary("Jen", 21, "Headmaster's assistant", 1.6, 40);
            Secretary olivia = new Secretary("Oilvia", 25, "Finance", 1.56, 42);
            Secretary hailey = new Secretary("Hailey", 27, "Accounting", 1.68, 40);

            Student sally = new Student("Sally", 15, 8, 'D');
            Student sipho = new Student("Sipho", 17, 11, 'A');
            Student rajesh = new Student("Rajesh", 19, 12, 'B');

            Teacher linda = new Teacher("Linda", 42, "History", 9, 9);
            Teacher brenda = new Teacher("Brenda", 36, "English", 9, 12);
            Teacher emma = new Teacher("Emma", 43, "Dramatic Arts", 9, 8);


            System.out.println("Students\n");
            System.out.println(sally + "\n");
            System.out.println(sipho + "\n");
            System.out.println(rajesh);

            System.out.println("Secretaries: \n");
            System.out.println(jen + "\n");
            System.out.println(olivia + "\n");
            System.out.println(hailey + "\n");


            System.out.println("Teachers: \n");
            System.out.println(linda + "\n");
            System.out.println(brenda + "\n");
            System.out.println(emma + "\n");
        }
    }
}

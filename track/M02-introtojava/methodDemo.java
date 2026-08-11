class Demo {
    // 1. No parameters, no return value
    void greet() {
        System.out.println("Hello, welcome to KodNest!");
    }

    // 2. With parameters, no return value
    void displayName(String name) {
        System.out.println("Student name: " + name);
    }

    // 3. No parameters, with return value
    int getPassingMarks() {
        return 40;
    }

    // 4. With parameters, with return value
    int addMarks(int java, int sql) {
        return java + sql;
    }
}

public class methodDemo {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.greet();                          // Type 1
        d.displayName("Prakash");           // Type 2

        int pass = d.getPassingMarks();     // Type 3
        int total = d.addMarks(75, 85);     // Type 4

        System.out.println("Passing Marks: " + pass);
        System.out.println("Total Marks: " + total);
    }
}

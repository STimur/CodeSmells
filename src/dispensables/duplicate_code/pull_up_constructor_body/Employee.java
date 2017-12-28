package dispensables.duplicate_code.pull_up_constructor_body;

class Employee {
    public String name;
    public String id;
}

class Manager extends Employee {
    private final int grade;

    public Manager(String name, String id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    //...
}

class Engineer extends Employee {
    private final String type;

    public Engineer(String name, String id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }
    //...
}

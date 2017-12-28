package dispensables.duplicate_code.pull_up_constructor_body;

class Employee {
    public String name;
    public String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class Manager extends Employee {
    private final int grade;

    public Manager(String name, String id, int grade) {
        super(name, id);
        this.grade = grade;
    }
    //...
}

class Engineer extends Employee {
    private final String type;

    public Engineer(String name, String id, String type) {
        super(name, id);
        this.type = type;
    }
    //...
}

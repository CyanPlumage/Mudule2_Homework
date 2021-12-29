package Module2.Homework1;

public class Coder {
    private String name;
    private String id;
    private int salary;

    //work行为
    public void work(){

        System.out.println("工号为" + this.id +
                "基本工资为" + this.salary +
                "的程序员" + this.name + "正在努力的写着代码...描述操作步骤");
    }

    //无参构造
    public Coder() {
    }

    //有参构造
    public Coder(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

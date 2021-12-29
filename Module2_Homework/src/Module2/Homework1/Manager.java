package Module2.Homework1;

public class Manager {

    private String name;
    private String id;
    private int salary;
    private int bonus;

    //work行为
    public void work(){

        System.out.println("工号为" + this.id +
                "基本工资为" + this.salary +
                "奖金为" + this.bonus +
                "的项目经理" + this.name + "正在努力的做着管理工作,");
        System.out.println("分配任务,检查员工提交上来的代码.....");
    }
    //无参构造
    public Manager() {
    }
    //有参构造
    public Manager(String name, String id, int salary, int bonus) {
        setName(name);
        setId(id);
        setSalary(salary);
        setBonus(bonus);
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

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

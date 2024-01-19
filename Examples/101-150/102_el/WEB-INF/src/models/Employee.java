package models;

public class Employee {
    private String name;
    private Integer experience;
    private Integer salary;   

    public Employee(String name, Integer experience, Integer salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getExperience() {
        return experience;
    }
    public void setExperience(Integer experience) {
        this.experience = experience;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    
    
}

public class Person
{
   private String name,sex,job;
    private int age;
    public Person(String name, int age, String sex, String job) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.job = job;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public String getJob() {
        return job;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Sex: " + sex + "\n" +
                "Job: " + job;
    }
}

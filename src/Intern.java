public class Intern extends Employee{
    private static final int  maxSalary= 20000;
    public Intern(String name,int age,int salary){
        super(name,age,salary);
        if(salary>maxSalary){
            throw new IllegalArgumentException("You can not set a salary that exceed "+ maxSalary + " to "+name);
        }


    }
    @Override
    public void updateSalary(int newSalary) {
        if(newSalary<20000){
            super.updateSalary(newSalary);
        }
        else{
            throw new IllegalArgumentException("You can not set a salary that exceed "+ maxSalary + " to "+super.getName());
        }
    }


}

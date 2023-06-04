package OOP.tema;

public class Employee {
   private String nume;
   private String position;
   private int yearsOfService;
    double salary;

    public String getName() {
        return nume;
    }

    public void setName(String nume) {
        this.nume = nume;
    }

    public String getPosition(){
      return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
        if (yearsOfService>10){
            salary *= 1.1;
        }
    }

    public void setSalary() {
        if (position.equals("manager")){
            salary=1000;
        } else {
            salary=1200;
        }
    }
    public double getSalary (){
        return salary;
    }

}

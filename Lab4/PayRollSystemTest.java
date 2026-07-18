class Employee{
   private String firstName;
    private String lastName;
    private String cnic;


    public Employee(){
        firstName="";
        lastName="";
        cnic="";
    }

    public Employee(String firstName, String lastName, String cnic){
        this.firstName=firstName;
        this.lastName=lastName;
        this.cnic=cnic;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getCNIC(){
        return cnic;
    }

    public void setCNIC(String cnic){
        this.cnic=cnic;
    }

    public String toString(){
        return firstName + " " + lastName + " CNIC# " + cnic;
    }

    public double earnings() {
        return 0.00;
    }

}


class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(){
        super();
        weeklySalary=0.0;
    }

    public SalariedEmployee(String firstName, String lastName, String cnic,double weeklySalary) {
        super(firstName, lastName, cnic);   

        if (weeklySalary >= 0)
            this.weeklySalary = weeklySalary;
        else
            this.weeklySalary = 0.0;
    }

    public double getWsalary(){
        return weeklySalary;
    }

    public void setWsalary(double weeklySalary){
        if (weeklySalary>=0)
        this.weeklySalary=weeklySalary;
    }

    public String toString(){
        return "\nSalaried employee: " + super.toString();
    }

     public double earnings() {
        return weeklySalary;
    }

}

class HourlyEmployee extends Employee{
    private double wage;
    private double hours;


    public HourlyEmployee(){
        super();
        wage=0.0;
        hours=0.0;
    }

    public HourlyEmployee(String firstName,String lastName,String cnic,double wage,double hours){
        super(firstName, lastName, cnic);
        if(wage>=0 ){
            this.wage=wage;
        }
        else{
            this.wage=0.0;
        }

        if(hours>=0){
            this.hours=hours;
        }
        else{
            this.hours=0.0;
        }
    }

    public double getwage(){
        return wage;
    }

    public void setwage(double wage){
        if(wage>=0)
            this.wage=wage;
    }

    public double gethours(){
        return hours;
    }

    public void sethours(double hours){
        if(hours>=0)
            this.hours=hours;
    }

    public String toString(){
        return "\nHourly employee: " + super.toString();  
    }

    public double earnings(){
        if(hours<=40){
            return wage*hours;
        }
        else{
            return (40*wage) + ((hours-40)*wage*1.5);
        }
    }

}


class CommissionEmployee extends Employee{

    private double grossSales;
    private double commissionRate; 
    
    public CommissionEmployee(){
        super();
        grossSales=0.0;
        commissionRate=0.0;
    }

    public CommissionEmployee(String firstName,String lastName,String cnic,double grossSales,double commissionRate){
        super(firstName, lastName, cnic);

        if (grossSales >= 0)
            this.grossSales = grossSales;
        else
            this.grossSales = 0.0;

        if (commissionRate >= 0)
            this.commissionRate = commissionRate;
        else
            this.commissionRate = 0.0;

    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setGrossSales(double grossSales){
        if (grossSales >= 0)
            this.grossSales = grossSales;
    }

    public double getCommissionRate(){
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0)
            this.commissionRate = commissionRate;
    }

    public String toString(){
        return "\nCommission employee: " + super.toString();
    }

    
    public double earnings(){
        return grossSales * commissionRate;
    }

}

class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

public BasePlusCommissionEmployee(){
    super();
    baseSalary=0.0;
}

public BasePlusCommissionEmployee(String firstName,String lastName,String cnic,double baseSalary,double grossSales,double commissionRate){
    super(firstName, lastName, cnic,grossSales,commissionRate);

    if(baseSalary>=0){
        this.baseSalary=baseSalary;
    }
    else{
        this.baseSalary=0.0;
    }

}

public double getbaseSalary(){
    return baseSalary;
}

public void setbaseSalary(double baseSalary){
    if(baseSalary>=0)
        this.baseSalary=baseSalary;
}

public String toString(){
    return "\nBase plus Commission employee: " + super.toString();
}

public double earnings(){
    return baseSalary + super.earnings();
}

}

public class PayRollSystemTest {

    public static void main(String[] args) {

        Employee firstEmployee =
                new SalariedEmployee("Muhammad", "Ali", "11111-1111", 800.00);

        Employee secondEmployee =
                new CommissionEmployee("Tarwan", "Kumar",
                        "222-22-2222", 10000, 0.06);

        // Constructor order in your class:
        // (firstName, lastName, cnic, baseSalary, grossSales, commissionRate)
        Employee thirdEmployee =
                new BasePlusCommissionEmployee("Fabeeha",
                        "Fatima", "333-33-3333",
                        300, 5000, 0.04);

        Employee fourthEmployee =
                new HourlyEmployee("Hasnain", "Ali",
                        "444-44-4444", 16.75, 40);

        // Salaried Employee
        System.out.println(firstEmployee);
        System.out.println("Earnings: " + firstEmployee.earnings());

        // Commission Employee
        System.out.println(secondEmployee);
        System.out.println("Earnings: " + secondEmployee.earnings());

        // Base Plus Commission Employee
        System.out.println(thirdEmployee);

        BasePlusCommissionEmployee currentEmployee =
                (BasePlusCommissionEmployee) thirdEmployee;

        double oldBaseSalary = currentEmployee.getbaseSalary();

        System.out.println("Old Base Salary: " + oldBaseSalary);

        currentEmployee.setbaseSalary(oldBaseSalary * 1.10);

        System.out.println("New Base Salary with 10% Increase: "
                + currentEmployee.getbaseSalary());

        System.out.println("Earnings: " + thirdEmployee.earnings());

        // Hourly Employee
        System.out.println(fourthEmployee);
        System.out.println("Earnings: " + fourthEmployee.earnings());
    }
}
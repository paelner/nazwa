package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    //    private Double lastSalary;
    private Double salary;
    private Car car;

    public Double getSalary() {
        return salary;
    }


    public void setSalary(Double salary) {
        if (salary >= 0) {
            System.out.println("Your current salary accounted and its: " + salary);
            this.salary = salary;
        } else {
            System.out.println("You cannot put negative values here");
        }

    }
//    public void setLastSalary(Double lastSalary){
//        lastSalary =-getSalary();
//        if (lastSalary==null){
//            System.out.println("It's your first salary");
//        }else
//        {
//            System.out.println("Your last salary was: "+ lastSalary);
//        }
//        }


//    public Car getCar(){
//        return car;
//    }
//    public void setCar(Car car){
//        if(this.salary > car.value) {
//            System.out.println("Bought this car with cash");
//            this.car = car;
//        }
//        else if(this.salary>car.value/12){
//        System.out.println("Bought this car on an installment plan");
//        this.car = car;
//        }else
//        {
//            System.out.println("you can't afford it :(");
//       }
//    }
}

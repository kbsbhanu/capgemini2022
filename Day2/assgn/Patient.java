package com.demo.assgn;

class Patient
{
    String name;
    double weight,height;
    Patient(String name,double w,double h)
    {
        this.name=name;
        weight=w;
        height=h;
    }
     double bmi()
    {
        return (weight/(height*height)*703);
    }

    public static void main(String args[])
    {
        Patient p=new Patient("Bhanu",47,20);
        System.out.println("BMI:"+p.bmi());
    }
}



package com.aitam.people;
class AadharaCard{
	double aadhara_no;
        String father_name;
        String Date_of_birth;
public AadharaCard(String father_name,double aadhara_no,String Date_of_birth){
this.father_name=father_name;
this.aadhara_no=aadhara_no;
this.Date_of_birth=Date_of_birth;
}
void display(){


System.out.println("father name: "+father_name);
System.out.println("Aadhara "+aadhara_no);
System.out.println("Date of birth "+Date_of_birth);

}
}

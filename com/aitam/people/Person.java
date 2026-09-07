package com.aitam.people;
class Person{
String name;
int age;
double aadhara_no;
String aadhara_name;
public Person(String name,int age,String aadhara_name,double aadhara_no){
this.name=name;
this.age=age;
this.aadhara_name=aadhara_name;
this.aadhara_no=aadhara_no;
}
void display(){
System.out.println("Name: "+name);
System.out.println("age: "+age);
System.out.println("AADHARA Name: "+aadhara_name);
System.out.println("aadhra no: "+aadhara_no);
}
}



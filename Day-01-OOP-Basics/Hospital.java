class Patient {
    private int patientid;
    private String name;
    Patient(){
        name="none";
        patientid=101;

    }
    public int getpatientid(){
        return patientid;
        
    }
    public String getname(){
        return name;
        
    }
    public Patient(int id,String name){
        this.patientid=id;
        this.name=name;

    }
    public void calcbill(){
        System.out.println("bill passed");
        
    }
    public String toString(){
        return "["+"name:"+name+"id:"+patientid+"]";
    }
    public int setid(int id){
        if (id>0){
            this.patientid=id;
        }
        else{
            System.out.println("enter valid pid");
        }
        return 0;
    }
}
class GeneralPatient extends Patient{
    int days;
    public GeneralPatient(int id,String name,int days){
        super(id,name);
        this.days=days;
    }
    public void calcbill(){
        System.out.println("----------------GENERAL PATIENT BILL----------------");
        System.out.println("Patient name: "+getname());
        System.out.println("Patient id: "+getpatientid());

        int roombill=1500*days;
        int medicinebill=500*days;
        int op_charges=1000*days;
        int totalbill=roombill+medicinebill+op_charges;
        System.out.println("Room bill:"+roombill);
        System.out.println("Medicine bill:"+medicinebill);
        System.out.println("op charges:"+op_charges);
        System.out.println("Total bill:"+totalbill);
        System.out.println("----------------Thank you----------------");
    }
    public String toString(){
        return "["+"name:"+getname()+"id:"+getpatientid()+"]";
    }

}
class EmergencyPatient extends Patient{
    int days;
    public EmergencyPatient(int id,String name,int days){
        super(id,name);
        this.days=days;
    }
    public void calcbill(){
        System.out.println("----------------EMERGENCY PATIENT BILL----------------");
        System.out.println("Patient name: "+getname());
        System.out.println("Patient id: "+getpatientid());
        int roombill=3000*days;
        int medicinebill=1000*days;
        int op_charges=2000*days;
        int totalbill=roombill+medicinebill+op_charges;
        System.out.println("Room bill:"+roombill);
        System.out.println("Medicine bill:"+medicinebill);
        System.out.println("op charges:"+op_charges);
        System.out.println("Total bill:"+totalbill);
        System.out.println("----------------****get well soon buddy***----------------");
    }
}
class Hospital{
public static void main(String []args){
    Patient obj= new GeneralPatient(1,"ravi",4);
    Patient obj1= new EmergencyPatient(1,"ramu",4);
    obj.calcbill();
    obj1.calcbill();
}
}




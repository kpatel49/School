package MockTest;

abstract class Employee {
    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee(int id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    public abstract void performDuties();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}

 

 



public class HospitalManagement {



    public void callUpon(Employee employee){

        if(employee instanceof Nurse){

            employee.performDuties();

        }

        else if(employee instanceof  Doctor){

            employee.performDuties();

        }

    }





}
 

 



class Doctor extends Employee {

    public Doctor(int id, String name, String department, boolean working) {

        super(id, name, department, working);

        System.out.println("Doctor in action ... ");

    }



    //doctors

    private void prescribeMedicine(){

        System.out.println("Prescribe medicine");

    }



    private void disagnosePatients(){

        System.out.println("Diagnose");

    }



    @Override

    public void performDuties(){

        prescribeMedicine();

        disagnosePatients();

    }

}
 

 



class Nurse extends Employee{



    public Nurse(int id, String name, String department, boolean working) {

        super(id, name, department, working);

        System.out.println("Nurse in action ... ");

    }

    //nurses

    private void checkVitalSigns(){

        System.out.println("Checking vitals");

    }

    private void drawBlood(){

        System.out.println("drawing blood");

    }



    private void cleanPatientArea(){

        System.out.println("cleaning patient area");

    }



    @Override

    public void performDuties(){

        checkVitalSigns();

        cleanPatientArea();

    }

}
 



class EmergenyRoomProcess {

    public static void main(String[] args) {

        HospitalManagement ERDirector = new HospitalManagement();

        Employee peggy = new Nurse(1, "Peggy", "Emergency Room ", true);



        ERDirector.callUpon(peggy);



        Employee suzan = new Doctor(2,"Suzan", "Emergency Room", true);

        ERDirector.callUpon(suzan);



    }

}
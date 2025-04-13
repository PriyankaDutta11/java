public class HRManager {
    void work() {
        System.out.println("HR recruits");
    }
        void addEmployee(){
            System.out.println("Adding new employee by HR");
        }
        int salary;
        HRManager(int salary){
        this.salary=salary;
        }
        int getSalary(){
            return salary;
        }

}

package remediPBO;

public class InternEmployee extends Employee{
    private int duration;
    public InternEmployee(String name, int duration){
        super(name);
        this.duration = duration;
    }
}

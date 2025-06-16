package trails;

public class InstanceVariables {
    public String name;
    public int age;
    public InstanceVariables(){
        this.name = "teja";
        this.age=29;
    }
    public static void main(String[] args){

        InstanceVariables info= new InstanceVariables();
        info.age = info.age+2;
        System.out.println(info.name);
        System.out.println(info.age);
        InstanceVariables updated = new InstanceVariables();
        updated.age= updated.age-3;
        System.out.println(updated.age);

    }
}

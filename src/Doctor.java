public class Doctor {

    static int id = 0;
    private String name;
    private String email;
    private String speciality;

    public Doctor(String name, String speciality) {
        id++;
        setName(name);
        setSpeciality(speciality);
        System.out.println("El nombre del doctor asignado es: " + getName());
    }

    public void showName(){
        System.out.println(getName());
    }

    public void showId(){
        System.out.println("ID Doctor: " + getId());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }
}

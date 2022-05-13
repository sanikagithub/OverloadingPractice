public class Animal {
    private String name;
    private boolean YesorNo;

    // the class constructor
    public Animal(String animalName, boolean YesorNo) {
        this.name = animalName;
        this.YesorNo = YesorNo;
    }

    public Animal(String animalName) {
        this.name = animalName;
    }

    public Animal(boolean YesorNo) {
        this.YesorNo = YesorNo;
    }
    public String getName() {
        return name;
    }

    public void setName(String animalName) {
        this.name = animalName;
    }

    public boolean getYesorNo() {
        return YesorNo;
    }

    public void setYesorNo(boolean YesorNo) {
        this.YesorNo = YesorNo;
    }

    @Override
    public String toString(){
        return getName() + " is a dog = " + getYesorNo();
    }
}
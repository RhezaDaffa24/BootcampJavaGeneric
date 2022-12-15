package ComparableInterfaceType;

public class person1 implements Comparable<person1>{
    private String name;
    private String address;


    @Override
    public int compareTo(person1 o) {
        return this.name.compareTo(o.name);
    }

    public person1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

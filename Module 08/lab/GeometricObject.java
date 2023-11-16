public class GeometricObject {
    private String name;

    public GeometricObject() {
    }

    public GeometricObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GeometricObject [name=" + name + "]";
    }

}

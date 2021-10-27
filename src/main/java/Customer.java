import org.json.JSONArray;
import org.json.JSONObject;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String address;
    private double high;
    private String gender;
    private boolean vip;

    String jsonCustomers = "{\"customer\":[{\"high\":\"1.7\",\"address\":\"BRVT\",\"gender\":\"Male\",\"name\":\"Hieu\",\"id\":\"1\",\"vip\":\"true\",\"age\":\"21\"},{\"high\":\"1.7\",\"address\":\"BRVT\",\"gender\":\"Male\",\"name\":\"Phong\",\"id\":\"2\",\"vip\":\"false\",\"age\":\"27\"},{\"high\":\"1.59\",\"address\":\"An Giang\",\"gender\":\"Female\",\"name\":\"Phuong\",\"id\":\"3\",\"vip\":\"true\",\"age\":\"25\"},{\"high\":\"1.6\",\"address\":\"An Giang\",\"gender\":\"Female\",\"name\":\"Mai\",\"id\":\"4\",\"vip\":\"true\",\"age\":\"22\"}]}";

    JSONObject jsonObject = new JSONObject(jsonCustomers);
    JSONArray jsonArray = jsonObject.getJSONArray("customer");
    JSONObject object = jsonArray.getJSONObject(0);


    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", high=" + high +
                ", gender='" + gender + '\'' +
                ", vip=" + vip +
                '}';
    }

    public Customer(int id, String name, int age, String address, double high, String gender, boolean vip) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.high = high;
        this.gender = gender;
        this.vip = vip;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = Integer.parseInt((String) object.get("id"));
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = (String) object.get("name");
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = Integer.parseInt((String) object.get("age"));
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = (String) object.get("address");
    }

    public double getHigh() {
        return high;
    }

    public void setHigh() {
        this.high = Double.parseDouble((String) object.get("high"));
    }

    public String getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = (String) object.get("gender");
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip() {
        this.vip = Boolean.parseBoolean((String) object.get("vip"));
    }
}

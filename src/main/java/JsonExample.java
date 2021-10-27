import com.google.gson.Gson;

public class JsonExample {
    public static void main(String[] args) throws Exception {
        String jsonCustomers = "{\"customer\":[{\"high\":\"1.7\",\"address\":\"BRVT\",\"gender\":\"Male\",\"name\":\"Hieu\",\"id\":\"1\",\"vip\":\"true\",\"age\":\"21\"},{\"high\":\"1.7\",\"address\":\"BRVT\",\"gender\":\"Male\",\"name\":\"Phong\",\"id\":\"2\",\"vip\":\"false\",\"age\":\"27\"},{\"high\":\"1.59\",\"address\":\"An Giang\",\"gender\":\"Female\",\"name\":\"Phuong\",\"id\":\"3\",\"vip\":\"true\",\"age\":\"25\"},{\"high\":\"1.6\",\"address\":\"An Giang\",\"gender\":\"Female\",\"name\":\"Mai\",\"id\":\"4\",\"vip\":\"true\",\"age\":\"22\"}]}";
        Customer2 customer2 = new Gson().fromJson(jsonCustomers, Customer2.class);
        System.out.println(customer2);
    }
}

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Json {
    public static void main(String args[]) {

        String jsonCustomers = "{\"customer\":[{\"high\":\"1.7\",\"address\":\"BRVT\",\"gender\":\"Male\",\"name\":\"Hieu\",\"id\":\"1\",\"vip\":\"true\",\"age\":\"21\"},{\"high\":\"1.7\",\"address\":\"BRVT\",\"gender\":\"Male\",\"name\":\"Phong\",\"id\":\"2\",\"vip\":\"false\",\"age\":\"27\"},{\"high\":\"1.59\",\"address\":\"An Giang\",\"gender\":\"Female\",\"name\":\"Phuong\",\"id\":\"3\",\"vip\":\"true\",\"age\":\"25\"},{\"high\":\"1.6\",\"address\":\"An Giang\",\"gender\":\"Female\",\"name\":\"Mai\",\"id\":\"4\",\"vip\":\"true\",\"age\":\"22\"}]}";

        JSONObject jsonObject = new JSONObject(jsonCustomers);
        List<Customer> customers = fromJson(jsonObject);
        System.out.println(customers);
    }

    public static List<Customer> fromJson(JSONObject jsonObject) {
        List<Customer> customers = new ArrayList<>();
        try {
            JSONArray jsonArray = jsonObject.getJSONArray("customer");

            for (int i = 0; i < jsonArray.length(); i++) {

                Customer customer = new Customer();
                customer.setId();
                customer.setName();
                customer.setAge();
                customer.setAddress();
                customer.setHigh();
                customer.setGender();
                customer.setVip();

                customers.add(customer);
            }
            return customers;
        } catch (Exception e) {
            System.err.println("jsonObject get key customer is null");
            return new ArrayList<>();
        }
    }
}

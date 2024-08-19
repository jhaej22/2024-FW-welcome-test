package java_test;

import java.io.*;

public class f1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Fan[] fans = new Fan[3];

        for (int i = 0; i < 3; i++) {
            String model = br.readLine();
            int price = Integer.parseInt(br.readLine());
            fans[i] = new Fan(model, price);
        }

        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < 3; i++) {
            if (fans[i].getPrice() < min) {
                min = fans[i].getPrice();
                index = i;
            }
        }

        System.out.println(fans[index].getModel());
    }

    private static class Fan {
        private  String model;
        private  int price;

        public Fan(String model, int price) {
            this.model = model;
            this.price = price;
        }

        public String getModel() {
            return model;
        }


        public int getPrice() {
            return price;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

}
public class MyFirstApp {
    
    public static void main(String [] args){

        Hobbits [] h = new Hobbits[3];

        int z = 0;

        while (z < 4) {
            h[z] = new Hobbits();
            h[z].name = "Bilbo";

            if (z == 2) {
                h[z].name = "Sam";
            }

            System.out.println(h[z].name + " is a good Hobbit name");

            z ++;
        }
    }
    
}
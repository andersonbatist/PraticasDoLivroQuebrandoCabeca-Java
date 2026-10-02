public class MyFirstApp {
    
    public static void main(String [] args){

        String [] inslands = new String [4];
        int [] index = new int [4];

        inslands[0] = "Bermuda";
        inslands[1] = "Fiji";
        inslands[2] = "Azores";
        inslands[3] = "Cozumel";

        index[0] = 1;
        index[1] = 3;
        index[2]= 0;
        index[3] = 2;

        int y = 0;

        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.print("Island = ");
            System.out.println(inslands[ref]);

            y = y + 1;
        }


    }
    
}
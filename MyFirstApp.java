public class MyFirstApp {
    
    public static void main(String [] args){
        //Criando um objeto Dog e acessando-o
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        //Agora, criando um array de Dog
        Dog [] myDogs = new Dog [3];

        //Agora, inserimos alguns Dog nele
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = new Dog();

        //Acessando os Dog por meio da referência do array
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        myDogs[2].name = "Anderson";

        //Hmmm... qual é o nome do Dogs 2?
        System.out.println("O nome do Dog escolhido é " + myDogs[2].name);

        //Itera com um loop o array e instrui dogs a latir
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
    
}
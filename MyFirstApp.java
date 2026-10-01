public class MyFirstApp {
    
    public static void main(String [] args){
        //Criando o Array que vai armazenar 3 referências para os objetos Books
        Books [] myBooks = new Books [3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        int x = 0;

        //Atribuindo valores aos atributos dos objetos que foram referênciados
        myBooks[0].tittle = "The Grapes of Java";
        myBooks[1].tittle = "The Java Gatsby";
        myBooks[2].tittle = "The Java Cookbook";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Ian";

        //Exibir os títulos e os autores por meio de um laço While
        while (x < myBooks.length) {
            System.out.println("O livre " + myBooks[x].tittle + "do autor " + myBooks[x].author);
            x ++;
        }
     
    }
    
}
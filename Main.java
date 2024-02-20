//Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo
// astratto chiamato calcolaArea().Crea poi due sottoclassi Rettangolo e Triangolo che
// estendono Forma ed implementano il metodo per il calcolo dell'area in maniera specifica.
public class Main {
        public static void main(String[]args){
            Rectangle rectangle = new Rectangle(4,6);
            rectangle.calculateAreaMethode();
            Triangle isoscele=new Triangle(6,4);
            isoscele.calculateAreaMethode();
            Square squre = new Square(15,15);
            squre.calculateAreaMethode();
        }
    }


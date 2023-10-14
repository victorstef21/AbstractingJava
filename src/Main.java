import com.itFactory.Animal;

public class Main {
    public static void main(String[] args) {

        Animal S1 = new Animal("Pisica", "Bengaleza");
        Animal S2 = new Animal("Caine", "Ciobanesc");
        S1.getRasa();
        S1.getAnimal();
        S2.getRasa();
        S2.getAnimal();
        S1.setAnimal("Pisica");
        S1.setRasa("Bengaleza");
        S2.setAnimal("Caine");
        S2.setAnimal("Ciobanesc");
        System.out.println("Animalul meu: " + S1.getAnimal() + "\n" + "Din rasa:" + " " + S1.getRasa());
        System.out.println("Animalul meu: " + S2.getAnimal() + "\n" + "Din rasa:" + " " + S2.getRasa());




    }



}
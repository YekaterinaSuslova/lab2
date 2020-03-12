package syn_07_lab2;

public class Syn_07_lab2 {

    private static Object generation;

    public static void main(String[] args) {

        Auto volkswagen = new Auto("volkswagen", "golf");
        // System.out.println(volkswagen);
        System.out.println("");
        volkswagen.getGeneration().add(new Auto("volkswagen", "passat"));
        volkswagen.getGeneration().add(new Auto("volkswagen", "polo"));
        volkswagen.getGeneration().add(new Auto("volkswagen", "amarok"));

        for (int i = 0; i < volkswagen.getGeneration().size(); i++) {

            System.out.println(volkswagen.getGeneration().get(i));
        }
        System.out.println("");

        System.out.println(volkswagen.getGeneration().size());

        System.out.println("");

        volkswagen.set(0, volkswagen.getGeneration().size() - 1); //Замена последнего элемента

        for (int i = 0; i < volkswagen.getGeneration().size(); i++) {

            System.out.println(volkswagen.getGeneration().get(i));
        }

        

        System.out.println("");
        

        volkswagen.remove(0); //Удаление элемента
        for (int i = 0; i < volkswagen.getGeneration().size(); i++) {

            System.out.println(volkswagen.getGeneration().get(i));
        }
    }

}

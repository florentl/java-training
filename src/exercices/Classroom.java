package exercices;

public class Classroom {

    public static void main(String[] args) {

        Wilder w1 = new Wilder("Jean-Claude", true);
        Wilder w2 = new Wilder("Henri", false);

        System.out.println(w1.whoAmI());
        System.out.println(w2.whoAmI());
    }
}

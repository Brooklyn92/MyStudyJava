package patterns.memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.setLevel("Level 60");
        game.setMs(5000);
        System.out.println(game);

        FileForSave file = new FileForSave();
        file.setSave(game.save());

        game.setLevel("Level 67");
        game.setMs(7000);
        System.out.println(game);
        FileForSave file1 = new FileForSave();
        file1.setSave(game.save());

        game.load(file.getSave());
        System.out.println(game);

        game.setLevel("Level 68");
        game.setMs(10000);
        System.out.println(game);

        game.load(file1.getSave());
        System.out.println(game);

    }

}

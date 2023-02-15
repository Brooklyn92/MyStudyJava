package patterns.memento;

public class Game {
    private String level;
    private int ms;

    public void setLevel(String level) {
        this.level = level;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public void load(Save save) {
        level = save.getLevel();
        ms = save.getMs();
    }

    public Save save() {
        return new Save(level, ms);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", ms=" + ms +
                '}';
    }
}

package patterns.builder.example1;

public class MetalFrameWindow implements Window {
    @Override
    public void open() {
        System.out.println("Открыли металическое окно");
    }

    @Override
    public String toString() {
        return "Металическое окно";
    }
}

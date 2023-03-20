package patterns.builder.example1;

public class CompanyB extends Supplier {

    @Override
    public Window createWindow() {
        return new WoodFrameWindow();
    }
}

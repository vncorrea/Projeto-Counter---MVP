public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            CounterModel model = new CounterModel();
            CounterPresenterImpl presenter = new CounterPresenterImpl(model);
            new CounterViewImpl(presenter);
        });
    }
}
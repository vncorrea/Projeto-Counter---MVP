import javax.swing.*;

public class CounterViewImpl extends JFrame implements CounterView {
    private final JLabel counterLabel;
    private final CounterPresenterImpl presenter;

    public CounterViewImpl(CounterPresenterImpl presenter) {
        this.presenter = presenter;
        this.presenter.setView(this);

        counterLabel = new JLabel("0");
        JButton incrementButton = createButton("Increment", presenter::increment);
        JButton decrementButton = createButton("Decrement", presenter::decrement);

        JPanel panel = new JPanel();
        panel.add(counterLabel);
        panel.add(incrementButton);
        panel.add(decrementButton);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    private JButton createButton(String text, Runnable action) {
        JButton button = new JButton(text);
        button.addActionListener(e -> action.run());
        return button;
    }

    @Override
    public void setCounterText(String text) {
        counterLabel.setText(text);
    }
}
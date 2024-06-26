package Presenter;

import Model.CounterModel;
import View.CounterView;
import View.CounterViewImpl;

public class CounterPresenterImpl implements CounterPresenter {
    private final CounterModel model;
    private CounterView view;

    public CounterPresenterImpl(CounterModel model) {
        this.model = model;
    }

    public void setView(CounterViewImpl view) {
        this.view = view;
    }

    @Override
    public void increment() {
        model.increment();
        view.setCounterText(Integer.toString(model.getCounter()));
    }

    @Override
    public void decrement() {
        model.decrement();
        view.setCounterText(Integer.toString(model.getCounter()));
    }

    @Override
    public void changeLockCounter() {
        model.changeLockCounter();
        view.setCounterText(Integer.toString(model.getCounter()));
    }
}
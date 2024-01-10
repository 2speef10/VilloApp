package com.example.villoapp.Model;
import com.example.villoapp.Model.Snack;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;


public class Bestelling {
    private List<Snack> snacks;

    public Bestelling() {
        snacks = new ArrayList<>();
    }

    public List<Snack> getSnacks() {
        return snacks;
    }

    public void addSnack(Snack snack) {
        snacks.add(snack);
    }

    public void removeSnack(int index) {
        if (index >= 0 && index < snacks.size()) {
            snacks.remove(index);
        }
    }

    public void updateSnack(int index, Snack snack) {
        if (index >= 0 && index < snacks.size()) {
            snacks.set(index, snack);
        }
    }
}

package syn_07_lab2;

import java.util.ArrayList;

public class Auto {

    private String mark;
    private String model;

    private ArrayList<Auto> generation;

    public ArrayList<Auto> getGeneration() {
        return generation;
    }

    public void setGeneration(ArrayList<Auto> generation) {
        this.generation = generation;
    }

    public Auto(ArrayList<Auto> generation) {
        this.generation = generation;
    }

    public Auto() {
        this.generation = new ArrayList<>();
    }

    public Auto(String mark, String model) {
        this.mark = mark;
        this.model = model;
        this.generation = new ArrayList<>();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Auto{" + "mark=" + mark + ", model=" + model + '}';
    }

    void remove(int i) {
        generation.remove(i);
    }

    void set(int i, int i0) {
        generation.set(i0, this);
    }

    

    

}

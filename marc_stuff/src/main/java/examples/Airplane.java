package examples;

import java.util.Arrays;

public class Airplane {
    private double weight;
    private String[] load;
    private byte teamSize;

    public Airplane() {
        this.teamSize = 3;
    }

    public void setWeight(double weight) {
        this.weight = Math.min(weight, 50000);
    }

    public double getWeight() {
        return weight;
    }

    public String[] getLoad() {
        return load;
    }

    public void setLoad(String[] load) {
        this.load = load;
    }

    public byte getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(byte teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "weight=" + weight +
                ", load=" + Arrays.toString(load) +
                ", teamSize=" + teamSize +
                '}';
    }
}

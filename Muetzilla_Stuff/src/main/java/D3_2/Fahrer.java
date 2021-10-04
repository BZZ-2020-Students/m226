package D3_2;

public class Fahrer implements FahrerIF{

    private String name;
    private AutoIF dasAuto;

    public Fahrer(Auto auto){
        dasAuto = auto;
    }
    public Fahrer(Auto auto, String name){
        this.name =name;
        dasAuto = auto;
        dasAuto.setFahrerRef(this);
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
}

package D3_1;

public class HausBesitzer {
    private Haus haus;
    public HausBesitzer(Haus haus){
        this.haus = haus;
        System.out.println(haus.getHausType());
    }
}

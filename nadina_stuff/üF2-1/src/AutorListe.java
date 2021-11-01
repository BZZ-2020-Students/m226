/**
 @Author:   Nadina Amsler (shirin197)
 @Date:     29.10.2021
 @Version:  1
 */

public class AutorListe {

    public int MAX_AUTOREN = 7;
    private Autor[] autoren = new Autor[MAX_AUTOREN];
    private int autorenCntr = 0;

    public AutorListe(){

    }

    public void addAutor(Autor autor){
            autoren[autorenCntr] = autor;
            autorenCntr++;
    }

    public Autor getAutor(int index){
        return autoren[index];
    }

    public void printOut() {
        System.out.println("Autoren-Liste");
        System.out.println("-------------");
        for (int i = 0; i < autoren.length; i++) {
            if(autoren[i] != null){
                System.out.println(autoren[i].getName());
            }
        }
        System.out.println();
    }

}

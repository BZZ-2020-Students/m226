/**
 @Author:   Nadina Amsler (shirin197)
 @Date:     29.10.2021
 @Version:  1
 */

public class Buch extends PrintMedium {

   private String isbnNr;
   private Autor autor;

   // Constructor
   public Buch(String titel, String isbnNr, Autor autor){
      super(titel);
      this.isbnNr = isbnNr;
      this.autor = autor;
   }

   public String getIsbnNr() {
      return isbnNr;
   }

   public void setIsbnNr(String isbnNr) {
      this.isbnNr = isbnNr;
   }

   public Autor getAutor() {
      return autor;
   }

   public void setAutor(Autor autor) {
      this.autor = autor;
   }
}

/**
 * Hauptklasse der Anwendung IP-Adress Converter.
 * @author  Nadina Amlser
 * @version 1.0
 * @date    05.12.2021
 */
import java.sql.Array;
import java.util.*;

public class IPAdrConverter implements IPAdrConverterIF {
  
  private final Vector<IPAdrConverterListener> listener;
  private String binFormat = "", hexFormat = "";

  public IPAdrConverter(){
    listener = new Vector();
  }

  public static void main(String[] args){
    IPAdrConverter conv   = new IPAdrConverter();
    IPAdrConverterGUI gui = new IPAdrConverterGUI(conv);
  }

  public void computeIP(String ipAdr) throws IPFormatException{
    String rex = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
    String[] sar;
    int[] num;

    if (ipAdr.equals(rex)){
      sar = ipAdr.split("\\.");
      num = new int[sar.length];

      for(int i = 0; i < sar.length; i++) {
        num[i] = Integer.parseInt(sar[i]);
      }
    } else {
      throw new IPFormatException("Ungültiges Format!");
    }

    StringBuilder sbBin = new StringBuilder();
    StringBuilder sbHex = new StringBuilder();

    for (int i = 0; i < num.length; i++){
      sbBin.append(String.format("%8s", Integer.toBinaryString(num[i])).replaceAll("", "0"));
      sbHex.append(String.format("%2s", Integer.toHexString(num[i])).replaceAll("", "0"));

      if(i < num.length -1){
        sbBin.append("-");
        sbHex.append("-");
      }
    }

    this.hexFormat = sbHex.toString();
    this.binFormat = sbBin.toString();


    this.fireChanges();
  }

  public String getIPAdrBinFormat(){
    return binFormat;
  }
  public String getIPAdrHexFormat(){
    return hexFormat;
  }
  public void addIPAdrConverterListener(IPAdrConverterListener l){
    listener.add(l);
  }
  public void removeIPAdrConverterListener(IPAdrConverterListener l){
    listener.remove(l);
  }

  private void fireChanges(){
    for (IPAdrConverterListener l : listener){
      l.update();
    }
  }
}

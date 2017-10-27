/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.main;

import kata4.view.*;
import kata4.model.*;
import kata4.view.*;
import java.util.*;
import static kata4.view.MailListReader.read;

/**
 *
 * @author amct2
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String FILENAME = "C:\\Users\\amct2\\Desktop\\asdad\\IS2\\Kata4\\dominios.txt";
  
        Histogram <String> histograma = MailHistogramBuilder.build(read(FILENAME));
        
        HistogramDisplay histo = new HistogramDisplay(histograma);
        
        histo.execute();
    }
    
}

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
        Kata4 kata4 = new Kata4();
        kata4.execute();
        
        String FILENAME = "C:\\Users\\amct2\\Desktop\\asdad\\IS2\\Kata4\\dominios.txt";
    }
    
    Histogram <String> histograma = new Histogram();
    HistogramDisplay histo;
    
    private void execute(){
        input();
        process();
        output();
    }
    
    private void input(){
      System.out.println("Introduzca la ruta del (.txt):");
      Scanner scanner = new Scanner(System.in);
      histograma = MailHistogramBuilder.build(read(scanner.next()));
      
    }
    
    private void output(){
        histo.execute();
    }
    
    private void process(){
        histo = new HistogramDisplay(histograma);
    }
    
}

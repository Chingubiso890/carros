package eteczl.etec;

import model.Carros;

import java.util.ArrayList;


import model.Polo;
//meu carrinho vrumvrum

import model.Corrida;

public class App 
{
    public static void main( String[] args )
    {
    	Carros c1 = new Polo("Wolksvagen");
    	Carros c2 = new Polo("Fiat");
    	Carros c3 = new Polo("Audi");	
        
    ArrayList<Carros> participantes = new ArrayList();
    participantes.add(c1);
    participantes.add(c2);
    participantes.add(c3);
    
    new Corrida(participantes).ComecarCorrida();
    
   }

}
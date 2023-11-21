package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String voto, risposta;
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer> candidati=new HashMap<>();
		candidati.put("pippo",0);
		candidati.put("pluto",0);
		candidati.put("topolino",0);
		candidati.put("paperino",0);
	
	System.out.println("Inserisci il tuo nome: ");
	String nome=sc.nextLine();
	nome.trim();									//.trim()
	System.out.println("benvenuto "+ nome + " i candidati sono");
		
	//stampa candidati		
	System.out.println("Candidati disponibili:");
	for(String cand:candidati.keySet())
		System.out.println(cand);
	
	//votazione
	
	do {	
		System.out.println("Chi vuoi votare?");
		voto=sc.nextLine().trim();				//.trim() elimina spazi in eccesso
		
		if(candidati.containsKey(voto))  			
		{
			candidati.put(voto, candidati.get(voto)+1);
		}		
		else 
		{
			System.out.println("Candidato non esistente");
			risposta="si";
		}
		
		System.out.println("\nVuoi inserire un nuovo voto(si/no)?");
			risposta=sc.nextLine();
	}while(risposta.toLowerCase().equals("si"));		//.equalsIgnoreCase
													
	System.out.println("RISULTATI:");
	for(String cand:candidati.keySet())
		System.out.println(cand+" "+candidati.get(cand));
	
	sc.close();	
	//.trim() elimina spazi in eccesso
	//.toLowerCase()
	//.toUpperCase()
	//.equalsIgnoreCase()
	//.startWith("x")  vero se la stringa inizia per x
	
	}
	
}

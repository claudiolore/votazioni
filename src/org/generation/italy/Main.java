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
	
	//stampa candidati		
		System.out.println("Candidati disponibili:");
		for(String cand:candidati.keySet())
			System.out.println(cand);
		
	//votazione
	
	do {	
		System.out.println("Chi vuoi votare?");
		voto=sc.nextLine();
		
		if(candidati.containsKey(voto))
		{
			candidati.put(voto, candidati.get(voto)+1);
		}		
		else 
		{
			System.out.println("Candidato non esistente");
			risposta="si";
			continue;
		}

		System.out.println("Vuoi inserire un nuovo voto(si/no)?");
		risposta=sc.nextLine();
	}while(risposta.equals("si"));
		
	System.out.println("RISULTATI:");
	for(String cand:candidati.keySet())
		System.out.println(cand+" "+candidati.get(voto));
	
	
	sc.close();	
	}

}

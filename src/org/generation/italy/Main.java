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
			System.out.println("Candidato non esistente");
			risposta="si";
		}		
		else if(voto.equals("pippo"))
		{
			candidati.put("pippo", candidati.get(voto)+1);
		}
		else if(voto.equals("pluto"))
		{
			candidati.put("pluto", candidati.get(voto)+1);
		}
		else if(voto.equals("topolino"))	
		{
			candidati.put("topolino", candidati.get(voto)+1);
		}
		else if(voto.equals("paperino"))
		{
			candidati.put("paperino", candidati.get(voto)+1);
		}
		
		System.out.println("Candidati disponibili:");
		for(String cand:candidati.keySet())
			System.out.println(cand+" "+candidati.get(voto));
		
		System.out.println("Vuoi inserire un nuovo voto(si/no)?");
		risposta=sc.nextLine();
	}while(risposta.equals("si"));
		
	sc.close();	
	}

}

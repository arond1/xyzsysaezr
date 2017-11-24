import java.util.HashMap;

public class Banque{
	
private Compte current;
private HashMap map;
public Banque()
{
		this.current = new Compte();
		this.map = new HashMap();
	//	map.clear;
	
}
public void ouvrirCompte(String nom, String password)
{
	if(!map.containsKey(password))
	{
	map.put(nom, new Compte(nom, password));
	}
	else
	{
	System.out.println("GET OUT MY WAY!!!!");	
	}
	
}

public Compte verifie(String nom, String password)
{
	if(this.map.containsKey(nom))
	{
		Compte E = (Compte) map.get(nom);
		if(current.checkmdp(password))
		{return current;}
		else
		{
	System.out.println("bad password");
	return null;
	}

	}
	else
	{
		System.out.println("GET OUT MY WAY!!!!");	
		return null;
	}
	
}

public int fermerCompte(String nom, String password)
{
	
	return 2;
}


public int retirer(int somme, Compte c)
{
	
	return 2;
}

public int balance(Compte c)
{
	
	return 10;
}
}
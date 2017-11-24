public class Compte{

public String nom;
public String password;
public int solde;

public Compte()
{
	this.nom = "bite";
	this.password = "root";
	this.solde = 69;
	
}
public Compte(String n, String pass)
{

this.nom = n;
this.password = pass;	
	
}
public boolean checkmdp(String s)
{
if(s == this.password)
return true;
else
return false;
	
}
}
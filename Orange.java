
public class Orange {

	double prix;
	String origine;

	public Orange(double p , String o){
		
		this.prix=p;
		if(prix<0){
		throw new ArithmeticException("prix negatif");
		}
		this.origine=o;
	}

	public double getPrix(){
		return prix;	
	}
	
	public String getOrigine(){
		return origine;	
	}
	
	
}

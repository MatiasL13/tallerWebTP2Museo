package ar.edu.unlam.tallerweb.obras;

import java.util.TreeSet;


public class Catalogo{
	private  TreeSet<ObraDeArte> obras = new  TreeSet<ObraDeArte>();
	ObraDeArte obra;

	public void agregarObra(ObraDeArte obra) throws Exception{						
		if (!this.obras.add(obra)) {
			throw new Exception("La obra ya existe");
		}				
	}
	public int ontenerCantidadObras(){
		return this.obras.size();
	}
	public Boolean existeObra(ObraDeArte obra){
		return this.obras.contains(obra);		
	}
	public TreeSet<ObraDeArte> getObras(){
		return this.obras;
	}
}
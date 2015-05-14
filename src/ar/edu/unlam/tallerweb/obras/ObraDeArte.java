package ar.edu.unlam.tallerweb.obras;

public class ObraDeArte implements Comparable<ObraDeArte>{
	String nombreObra;
	Autor nombreAutor;
	
	public ObraDeArte(String nombreObra, Autor nombreAutor){
		this.nombreObra = nombreObra;
		this.nombreAutor = nombreAutor;
	}
	public String getNombre(){		
		return this.nombreObra;
	}
	@Override
	public int compareTo(ObraDeArte o) {
		return this.nombreObra.compareTo(o.nombreObra);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nombreAutor == null) ? 0 : nombreAutor.hashCode());
		result = prime * result
				+ ((nombreObra == null) ? 0 : nombreObra.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObraDeArte other = (ObraDeArte) obj;
		if (nombreAutor == null) {
			if (other.nombreAutor != null)
				return false;
		} else if (!nombreAutor.equals(other.nombreAutor))
			return false;
		if (nombreObra == null) {
			if (other.nombreObra != null)
				return false;
		} else if (!nombreObra.equals(other.nombreObra))
			return false;
		return true;
	}
}

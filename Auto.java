public class Auto {
	private String modelo;
	private String marca;
	
	public Auto(String mod, String mar) {
		modelo=mod;
		marca=mar;
	}
	
	public void setModelo(String mod) {
		modelo=mod;
	}
	
	public void setMarca(String mar) {
		marca=mar;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
}

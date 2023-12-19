package model.bean;

public class Custome {
	private int idCus;
	private String nameCus;
	private String indentityCus;
	private String addressCus;
	private String nameSick;
	public Custome(int idCus, String nameCus, String indentityCus, String addressCus, String nameSick) {
		super();
		this.idCus = idCus;
		this.nameCus = nameCus;
		this.indentityCus = indentityCus;
		this.addressCus = addressCus;
		this.nameSick = nameSick;
	}
	public Custome() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getIdCus() {
		return idCus;
	}
	public void setIdCus(int idCus) {
		this.idCus = idCus;
	}
	public String getNameCus() {
		return nameCus;
	}
	public void setNameCus(String nameCus) {
		this.nameCus = nameCus;
	}
	public String getindentityCus() {
		return indentityCus;
	}
	public void setindentityCus(String indentityCus) {
		this.indentityCus = indentityCus;
	}
	public String getAddressCus() {
		return addressCus;
	}
	public void setAddressCus(String addressCus) {
		this.addressCus = addressCus;
	}
	public String getnameSick() {
		return nameSick;
	}
	public void setnameSick(String nameSick) {
		this.nameSick = nameSick;
	}
	
}

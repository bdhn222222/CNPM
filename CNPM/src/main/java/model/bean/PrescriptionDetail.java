package model.bean;

public class PrescriptionDetail {
	private int idPreDetail;
	private int idCus;
	private int idMe;
	private float dose;
	private int frequency;
	private int duration;
	public PrescriptionDetail(int idPreDetail, int idCus, int idMe, float dose, int frequency,
			int duration) {
		super();
		this.idPreDetail = idPreDetail;
		this.idCus = idCus;
		this.idMe = idMe;
		this.dose = dose;
		this.frequency = frequency;
		this.duration = duration;
	}
	public int getidPreDetail() {
		return idPreDetail;
	}
	public void setidPreDetail(int idPreDetail) {
		this.idPreDetail = idPreDetail;
	}
	public int getidCus() {
		return idCus;
	}
	public void setidCus(int idCus) {
		this.idCus = idCus;
	}
	public int getIdMe() {
		return idMe;
	}
	public void setIdMe(int idMe) {
		this.idMe = idMe;
	}
	public float getDose() {
		return dose;
	}
	public void setDose(float dose) {
		this.dose = dose;
	}
	public float getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}

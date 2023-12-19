package model.bean;

public class Medicine {
	private int idMe;
	private String nameMe;
	private Double doseMin;
	private Double doseMax;
	private Integer frequencyMax;
	private Integer frequencyMin;
	private Integer dayDoseMin;
	private Integer dayDoseMax;
	public Medicine(int idMe, String nameMe, Double doseMin, Double doseMax, Integer frequencyMax, Integer frequencyMin,
			Integer dayDoseMin, Integer dayDoseMax) {
		super();
		this.idMe = idMe;
		this.nameMe = nameMe;
		this.doseMin = doseMin;
		this.doseMax = doseMax;
		this.frequencyMax = frequencyMax;
		this.frequencyMin = frequencyMin;
		this.dayDoseMin = dayDoseMin;
		this.dayDoseMax = dayDoseMax;
		
	}
	public int getIdMe() {
		return idMe;
	}
	public void setIdMe(int idMe) {
		this.idMe = idMe;
	}
	public String getNameMe() {
		return nameMe;
	}
	public void setNameMe(String nameMe) {
		this.nameMe = nameMe;
	}
	public Double getDoseMin() {
		return doseMin;
	}
	public void setDoseMin(Double doseMin) {
		this.doseMin = doseMin;
	}
	public Double getDoseMax() {
		return doseMax;
	}
	public void setDoseMax(Double doseMax) {
		this.doseMax = doseMax;
	}
	public Integer getFrequencyMax() {
		return frequencyMax;
	}
	public void setFrequencyMax(Integer frequencyMax) {
		this.frequencyMax = frequencyMax;
	}
	public Integer getFrequencyMin() {
		return frequencyMin;
	}
	public void setFrequencyMin(Integer frequencyMin) {
		this.frequencyMin = frequencyMin;
	}
	public Integer getDayDoseMin() {
		return dayDoseMin;
	}
	public void setDayDoseMin(Integer dayDoseMin) {
		this.dayDoseMin = dayDoseMin;
	}
	public Integer getDayDoseMax() {
		return dayDoseMax;
	}
	public void setDayDoseMax(Integer dayDoseMax) {
		this.dayDoseMax = dayDoseMax;
	}
	
}

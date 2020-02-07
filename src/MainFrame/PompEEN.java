package MainFrame;

public class PompEEN {
		String TypeOlie;
		double typeolievalue;
		double Bedrag;
		double AantalLiters;
		String kentekenplaat;
		String Pomptatus;
		String Tankstatus;
		
		public String getTypeOlie() {
			return TypeOlie;
		}
		public void setTypeOlie(String typeOlie) {
			TypeOlie = typeOlie;
		}
		public double getBedrag() {
			return Bedrag;
		}
		public void setBedrag(double bedrag) {
			Bedrag = bedrag;
		}
		public double getAantalLiters() {
			return AantalLiters;
		}
		public double getTypeolievalue() {
			return typeolievalue;
		}
		public void setTypeolievalue(double typeolievalue) {
			this.typeolievalue = typeolievalue;
		}
		public void setAantalLiters(double aantalLiters) {
			AantalLiters = aantalLiters;
		}
		public String getKentekenplaat() {
			return kentekenplaat;
		}
		public void setKentekenplaat(String kentekenplaat) {
			this.kentekenplaat = kentekenplaat;
		}
		public String getPomptatus() {
			return Pomptatus;
		}
		public void setPomptatus(String pomptatus) {
			Pomptatus = pomptatus;
		}
		public String getTankstatus() {
			return Tankstatus;
		}
		public void setTankstatus(String tankstatus) {
			Tankstatus = tankstatus;
		}
}

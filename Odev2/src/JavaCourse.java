
public class JavaCourse {
	
	public JavaCourse() {
		//System.out.println("Çalýþýyorum");
	}
	
	public JavaCourse(String gun, String odev, String degerlendirme, 
			int tamamlamaYuzdesi, String tarih) {
		
		this.degerlendirme=degerlendirme;
		this.gun=gun;
		this.odev=odev;
		this.tamamlamaYuzdesi=tamamlamaYuzdesi;
		this.tarih=tarih; 
		
	}
	
	String gun;
	String odev;
	String degerlendirme;
	int tamamlamaYuzdesi;
	String tarih;

}

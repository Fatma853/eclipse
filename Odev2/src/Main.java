
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaCourse javaCourse1= new JavaCourse();
		javaCourse1.degerlendirme= "Kurs �ok iyi gidiyor.";
		javaCourse1.gun= "2.G�n";
		javaCourse1.odev="2. g�n �dev1 ";
		javaCourse1.tamamlamaYuzdesi= 34;
		javaCourse1.tarih="24 Nisan dersi";
		
		JavaCourse[] Course= {javaCourse1};
		
		for(JavaCourse java: Course) {
			
			System.out.println(java.degerlendirme); 
			System.out.println(java.tamamlamaYuzdesi);
		}
		
		JavaCourseManager javaCourseManager= new JavaCourseManager();
		javaCourseManager.addStart(javaCourse1);   
				
		 
	}

}

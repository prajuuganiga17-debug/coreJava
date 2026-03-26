package com.tap.Inheritance;

class EducationalInstitute{
	void admitStudent() {
		System.out.println("student is admitted");
	}
	void conductExam() {
		System.out.println("exam will be conducted ");
	}
}
class School extends EducationalInstitute{
	@Override
	void conductExam() {
		System.out.println("School exams are conducted in March (Board Exams)");
		
	}
	void conductFieldTrip() {
		System.out.println("school will conduct field trip");
	}
}
class College extends EducationalInstitute{
	@Override
	void conductExam() {
		System.out.println("College exams are conducted semester-wise ");
		
	}
	void conductInternship() {
		System.out.println("College will allow to Internship");
	}
}
class University extends EducationalInstitute{
	@Override
	void conductExam() {
		System.out.println("College exams are conducted semester-wise  or annually");
		
	}
	void conductResearch() {
		System.out.println("College will allow u to do Research");
	}
}
public class EducationalTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s = new School();
		s.admitStudent();
		s.conductExam();
		s.conductFieldTrip();
		
		College c = new College();
		c.admitStudent();
		c.conductExam();
		c.conductInternship();
		
		University u = new University();
		u.admitStudent();
		u.conductExam();
		u.conductResearch();

	}

}
// OUTPUT
//student is admitted
//School exams are conducted in March (Board Exams)
//school will conduct field trip
//student is admitted
//College exams are conducted semester-wise 
//College will allow to Internship
//student is admitted
//College exams are conducted semester-wise  or annually
//College will allow u to do Research


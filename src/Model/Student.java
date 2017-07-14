package Model;

public class Student {
private String Student_Name;
private String Student_Address;
private String Student_class;
public Student(String student_Name, String student_Address, String student_class, String student_Dob,
		String parent_Name, String academic_Grade, String extra_Curricular) {
	super();
	Student_Name = student_Name;
	Student_Address = student_Address;
	Student_class = student_class;
	Student_Dob = student_Dob;
	Parent_Name = parent_Name;
	Academic_Grade=academic_Grade;
	Extra_Curricular=extra_Curricular;
}


public Student() {
	
}
public String getStudent_Name() {
	return Student_Name;
}
public void setStudent_Name(String student_Name) {
	Student_Name = student_Name;
}
public String getStudent_Address() {
	return Student_Address;
}
public void setStudent_Address(String student_Address) {
	Student_Address = student_Address;
}
public String getStudent_class() {
	return Student_class;
}
public void setStudent_class(String student_class) {
	Student_class = student_class;
}
public String getStudent_Dob() {
	return Student_Dob;
}
public void setStudent_Dob(String student_Dob) {
	Student_Dob = student_Dob;
}
public String getParent_Name() {
	return Parent_Name;
}
public void setParent_Name(String parent_Name) {
	Parent_Name = parent_Name;
}

public String getAcademic_Grade() {
	return Academic_Grade;
}
public void setAcademic_Grade(String academic_Grade) {
	Academic_Grade = academic_Grade;
}
public String getExtra_Curricular() {
	return Extra_Curricular;
}
public void setExtra_Curricular(String extra_Curricular) {
	Extra_Curricular = extra_Curricular;
}
private String Student_Dob;
private String Parent_Name;
private String Academic_Grade;
private String Extra_Curricular;


}

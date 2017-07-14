package dAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;


import Model.Parent;
import Model.Student;
import Model.User;
import databaseConnection.DbConnection;

public class DataAccess {
	
	public static void insertStudent(Student s){
			
		PreparedStatement ps=DbConnection.connect("insert into Table_Student(StudentName,StudentAddress,StudentClass,StudentDob,Pname,Academic_Grade,Extra_Curricular) values(?,?,?,?,?,?,?)");
		try {
			ps.setString(1, s.getStudent_Name());
			ps.setString(2, s.getStudent_Address());
			ps.setString(3, s.getStudent_class());
			ps.setString(4, s.getStudent_Dob());
			ps.setString(5, s.getParent_Name());
			ps.setString(6, s.getAcademic_Grade());
			ps.setString(7, s.getExtra_Curricular());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
		public static void insertParent(Parent p){
			PreparedStatement ps =DbConnection.connect("insert into Table_Plogin (sid,Pusername,Ppassword) values(?,?,?) ") ;
			try{
				ps.setInt(1, p.getId());
				ps.setString(2, p.getUsername());
				ps.setString(3, p.getPassword());
				ps.executeUpdate();
			}
			catch(SQLException e){
				System.out.println(e);
			}
		}
		public static Student getStudentInfo(int sid) throws SQLException,ClassNotFoundException{
			Student student = null;	
			PreparedStatement p	=DbConnection.connect("SELECT * FROM Table_Student where sid=?");	
			p.setInt(1, sid);
			ResultSet rs	=	p.executeQuery();	
			//Student student = new Student();
			while(rs.next()){
				String Sname= rs.getString("StudentName");
				String Saddress = rs.getString("StudentAddress");
				String Sclass = rs.getString("StudentClass");
				String Sdob = rs.getString("StudentDob");
				String Pname = rs.getString("Pname");
				String academic = rs.getString("Academic_Grade");
				String extra = rs.getString("Extra_Curricular");
				/*student.setStudent_Name(rs.getString("StudentName"));
				student.setStudent_Address(rs.getString("StudentAddress"));
				student.setStudent_class(rs.getString("StudentClass"));
				student.setStudent_Dob(rs.getString("StudentDob"));
				student.setParent_Name(rs.getString("Pname"));
				student.setAcademic_Grade(rs.getString("Academic_Grade"));
				student.setExtra_Curricular(rs.getString("Extra_Curricular"));
				*/
				student = new Student(Sname,Saddress,Sclass,Sdob,Pname,academic,extra);
			}
			return student;
			
		}
		/* public static List<Student> getStudents() throws SQLException,ClassNotFoundException{
		     List<Student> students = new ArrayList<Student>();
			PreparedStatement ps = DbConnection.connect("select * from Table_Student ");
			
				ResultSet rs1 =ps.executeQuery();
		
			while(rs1.next()){
				Student s =new Student();
				s.setStudent_Address(rs1.getString("StudentAddress"));
			s.setParent_Name(rs1.getString("Pname"));
			s.setStudent_Name(rs1.getString("StudentName"));
			s.setStudent_class(rs1.getString("StudentClass"));
			s.setStudent_Dob(rs1.getString("StudentDob"));
			s.setAcademic_Grade(rs1.getString("Academic_Grade"));
			s.setExtra_Curricular(rs1.getString("Extra_Curricular"));
			//String a = rs1.getString("Pname");
			//String b =rs1.getString("StudentName");
			//System.out.println(a +""+b );
				students.add(s);
			}
			
			return students;
		    }*/
			
		/*public static ArrayList<Student> list() throws SQLException {
			
			Parent p = new Parent();
			ArrayList<Student> students = new ArrayList<Student>();
			//int id = (Integer.parseInt(Session.getAttribute("session_id")));// session.getAttribute("session_id");
			System.out.println(p.getId());
			
			PreparedStatement ps = DbConnection.connect("select * from Table_Student where sid = ?");
			ps.setInt(1, p.getId());
			try{
				ResultSet rs =ps.executeQuery();
			Student s =new Student();
			while(rs.next()){
			s.setParent_Name(rs.getString("Pname"));
			s.setStudent_Name(rs.getString("StudentName"));
			s.setStudent_class(rs.getString("StudentClass"));
			s.setStudent_Dob(rs.getString("StudentDob"));
			s.setAcademic_Grade(rs.getString("Academic_Grade"));
			s.setExtra_Curricular(rs.getString("Extra_Curricular"));
			students.add(s);
			}
		
			}catch(SQLException e){
				e.printStackTrace();
			}
			
			return students;
		}
	
		/*public static void viewStudentInfo(Student s){
			PreparedStatement ps = DbConnection.connect("select *from Table_Student ");
			try {
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					String Parent = rs.getString("Pname");

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		*/
	}



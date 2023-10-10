import java.sql.*;
public class Insert {
public static void Insertdata() throws Exception{	
String url="jdbc:mysql://127.0.0.1:3306/Bank";
String username="root";
String password="2003";
String Query="insert into emp values(?,?,?)";
Connection con=DriverManager.getConnection(url, username, password);
PreparedStatement pst=con.prepareStatement(Query);
pst.setInt(1,1);
pst.setString(2,"Ram");
pst.setString(3,"Hello");
pst.setInt(1,2);
pst.setString(2,"som");
pst.setString(3,"mara@gmail.com");
pst.executeUpdate();
con.close();
}
public static void main(String[] args) throws Exception{
Insertdata();
	
	
	
}

}

import java.sql.*;
public class Get {
public static void get() throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/Bank";
	String username="root";
	String password="2003";
	String Query="select*from emp";
	Connection con=DriverManager.getConnection(url, username, password);
	Statement st=con.createStatement();
	ResultSet rt=st.executeQuery(Query);
	while(rt.next()) {
		System.out.println("userid " +rt.getInt(1));
		System.out.println("username "+rt.getString(2));
		System.out.println("useremil "+rt.getString(3));
		System.out.println("userid " +rt.getInt(1));
		System.out.println("username "+rt.getString(2));
		System.out.println("useremil "+rt.getString(3));
	}
	}
public static void main(String[] args) throws Exception{
get();	
}

}

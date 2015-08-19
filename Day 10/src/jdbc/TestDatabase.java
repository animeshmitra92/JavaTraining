package jdbc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDatabase {
	public static void main(String args[])
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Connection Established");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name");
			String empName=br.readLine();
			System.out.println("Enter employee ID");
			int empID=Integer.parseInt(br.readLine());
			System.out.println("Enter salary");
			float salary=Integer.parseInt(br.readLine());
			System.out.println("Enter mobile number");
			long mobileNo=Long.parseLong(br.readLine());
			System.out.println("Enter Date of Joining");
			String doj=br.readLine();
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date dj=sdf.parse(doj);
			java.sql.Date ds=new java.sql.Date(dj.getTime());
			PreparedStatement ps=con.prepareStatement("insert into vzemployee values (?,?,?,?,?)");
			ps.setInt(1, empID);
			ps.setString(2, empName);
			ps.setFloat(3, salary);
			ps.setDate(4, ds);
			ps.setLong(5, mobileNo);
			int result=ps.executeUpdate();
			if(result>0)
			{
				con.commit();
			}
			
			
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		catch(ClassNotFoundException cnfe)
		{
			System.out.println(cnfe);
		}
		catch (SQLException sqle)
		{
			System.out.println(sqle);
		}
		catch (ParseException pe)
		{
			pe.printStackTrace();
		}
		finally
		{
			if(con!=null)
			{
				try
				{
					con.close();
				}
				catch(SQLException sqle1)
				{
					System.out.println(sqle1);
				}
			}
		}
	}

}

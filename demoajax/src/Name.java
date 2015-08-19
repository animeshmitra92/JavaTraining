

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Name
 */
public class Name extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Name() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Servlet");
		try
		{
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			String suggestion="";
			String cities[]={"Aligarh","Ahmedabad","Chennai", "Delhi", "Mumbai", "hyderabad"};
			String city_name=request.getParameter("city_n");
			
			if(city_name.length()>0)
			{
				for (int i=0;i<cities.length;i++)
				{
					if (cities[i].toUpperCase().startsWith(city_name.toUpperCase()))
					{
						suggestion=suggestion+cities[i]+"<br>";
					}
				}
			}
			out.println(suggestion);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}



import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Bhuser;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Home() {
        super();
    }

    
    protected void doPost(HttpServletRequest request, 
    							HttpServletResponse response) 
    									throws ServletException, IOException {
		Date postdate = new Date(0);
		String posttext = request.getParameter("posttext");
		String nextURL = "/error.jsp";
		//need a reference to the session
		//get user out of session. If they don't exist then send them back to the login page.
		//kill the session while you're at it.
		HttpSession session = request.getSession();
		if (session.getAttribute("user")==null){
			//http://stackoverflow.com/questions/13638446/checking-servlet-session-attribute-value-in-jsp-file
			nextURL = "/login.jsp";
			session.invalidate();
			response.sendRedirect(request.getContextPath() + nextURL);
		    return;//return prevents an error
		}
		
		//get user information from session so we can connect to the db
		Bhuser user = (Bhuser)session.getAttribute("user");
		
/*****************************************
		//get  a populated bhuser object since we'll add that to the post
		EntityManager em = DbUtil.getEmFactory().createEntityManager();
		String query = "select u from Bhuser u where u.useremail=:email";
		TypedQuery<Bhuser> q = em.createQuery(query,Bhuser.class);
		q.setParameter("email",user.getUseremail());
		
		Bhuser bhUser = null;
		try {
			bhUser = q.getSingleResult();
			System.out.println("The user id is: " + bhUser.getBhuserid());
			nextURL = "/Newsfeed";
		} catch (NoResultException e){
			System.out.println(e);
		} catch (NonUniqueResultException e){
			System.out.println(e);
		} finally {
			em.close();
		}
		
		//insert the post
		Bhpost bhPost = new Bhpost();
		bhPost.setBhuser(bhUser);
		bhPost.setPostdate(postdate);
		bhPost.setPosttext(posttext);
		
		DbBullhorn.insert(bhPost);
**********************************************/		
		//go to the newsfeed or error
		getServletContext().getRequestDispatcher(nextURL).forward(request, response);
		
	}}

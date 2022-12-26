package kr.co.yangdoll;

import static org.junit.Assert.assertNull;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DBConnNBasicQueryTest {

	@Autowired
	ApplicationContext context;
	@Autowired
	DataSource ds;

	/*
	 * @Autowired JdbcTemplate jt;
	 */
	@Test
	@Ignore
	public void contextTest() {
		assertNull(asas);
		
	}

	/*
	 * @Test public void dbConnectionTest() { assertNotNull(ds);
	 * System.out.println("==> " + ds); }
	 * 
	 * @Test
	 * 
	 * @Ignore public void getTimeJDBCTest() { Connection con = null;
	 * PreparedStatement ps = null; ResultSet rs = null; try { con =
	 * ds.getConnection(); ps =
	 * con.prepareStatement("select sysdate nowTime from dual"); rs =
	 * ps.executeQuery(); rs.next(); System.out.println(rs.getString("nowTime"));
	 * }catch (Exception e) { // TODO: handle exception }finally { try { rs.close();
	 * ps.close(); con.close(); } catch (SQLException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } } }
	 * 
	 * @Test public void getTimeJDBCTemplateTest() { assertNotNull(jt); String
	 * result = jt.queryForObject("select sysdate nowTime from dual", String.class);
	 * assertNotNull(result ); System.out.println(result + "===="); }
	 */

}

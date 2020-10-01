package enablement.spring.core.jdbctemplate;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import enablement.spring.core.autowire.Employee;

public class EmployeeDetailDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(EmployeeDetail e){
		String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		return jdbcTemplate.update(query);
	}
	
	public int updateEmployee(EmployeeDetail e){
		String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";
		return jdbcTemplate.update(query);
	}
	
	public int deleteEmployee(EmployeeDetail e){
		String query="delete from employee where id='"+e.getId()+"' ";
		return jdbcTemplate.update(query);
	}
	
	public Boolean saveEmployeeByPreparedStatement(final EmployeeDetail e) {
		String query = "insert into employee values(?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {

				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setFloat(3, e.getSalary());

				return ps.execute();
			}
		});
	}
	
	/*
	 * To show all the records of the table,using ResultSetExtractor Interface
	 */
	public List<EmployeeDetail> getAllEmployees() {
		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<EmployeeDetail>>() {
			public List<EmployeeDetail> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<EmployeeDetail> list = new ArrayList<EmployeeDetail>();
				while (rs.next()) {
					EmployeeDetail e = new EmployeeDetail();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSalary(rs.getInt(3));
					list.add(e);
				}
				return list;
			}
		});
	}
	
}

package com.cts.emp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.emp.pojo.Employee;

@Repository("empDao")
public class EmployeeDaoImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Employee> listAll() {

		String qry = "select * from employee";

		return jdbcTemplate.query(qry, new GetEmployees());
	}

	public List<Map<String, Object>> getEmpsAsMap() {

		String qry = "select * from employee";

		return jdbcTemplate.queryForList(qry);

	}

	public Map<String, Object> findEmployee(int empId) {

		String qry = "select * from employee where empId=?";

		return jdbcTemplate.queryForMap(qry, empId);

	}

	public void rowCallBackHandler() {

		String qry = "select * from employee";

		jdbcTemplate.query(qry, new RowCallBackHandlerDemo());

	}

	public Employee resultSetExtractor() {

		String qry = "select * from employee where empId=?";

		return jdbcTemplate.query(qry, new ResultSetExtractorDemo(), 10);

	}

}

class GetEmployees implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowId) throws SQLException {

		Employee emp = new Employee();
		emp.setEmpId(rs.getInt(1));
		emp.setEmpName(rs.getString(2));
		emp.setSalary(rs.getDouble(3));

		return emp;
	}

}

class RowCallBackHandlerDemo implements RowCallbackHandler {

	@Override
	public void processRow(ResultSet rs) throws SQLException {

		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println("-------------------------------");

	}

}

class ResultSetExtractorDemo implements ResultSetExtractor<Employee> {

	@Override
	public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
		Employee emp = null;
		while (rs.next()) {
			emp = new Employee();
			emp.setEmpId(rs.getInt(1));
			emp.setEmpName(rs.getString(2));
			emp.setSalary(rs.getDouble(3));
		}
		return emp;
	}

}

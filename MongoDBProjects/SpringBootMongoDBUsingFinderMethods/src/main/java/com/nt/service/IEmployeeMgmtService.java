package com.nt.service;
import java.util.*;
import com.nt.document.*;

public interface IEmployeeMgmtService {

	public void registerEmployee(List<Employee> list);
	public List<Employee> findEmpsBySalaryInRange(Double start,Double end);
	public List<Employee> showEmpsDetailsHavingNames(String... names);
	public void displayEmpsWhoseSalaryInRangeAndHavingAddrs(Double start,Double end,String... strings);
	public void showAllEmps();
	public void displayAllEmpsWhoseNamesStartsWith(String initChar);
	public void displayAllEmpsWhoseSalaryGreaterThanEqual(Double salary);
	public void displayAllEmpsWhoseNamesHavingLetters(String chars);
	public void displayNameWhoseMobileNoIs(Long mobile);
}

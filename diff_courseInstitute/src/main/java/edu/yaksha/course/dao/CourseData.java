package edu.yaksha.course.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import edu.yaksha.course.model.Course;

@Service 
@Component
public class CourseData {
	private static Map<Integer,Course> courseMap=new TreeMap<Integer,Course>();
	
	static
	{
		courseMap.put(10001, new Course(10001,"MTech",24,300000.00));
		courseMap.put(10002, new Course(10002,"MBA",36,360000.00));
		courseMap.put(10003, new Course(10003,"MCA",36,375000.00));
		courseMap.put(10004, new Course(10004,"BTech",48,480000.00));
		courseMap.put(10005, new Course(10005,"BBA",36,300000.00));
		courseMap.put(10006, new Course(10006,"BCA",36,325000.00));
	}
	
	public void save (Course course)
	{
		Set<Integer> set=courseMap.keySet();
		 TreeSet<Integer> keySet=new TreeSet<Integer>(set);
		int id=keySet.last()+1;
		course.setId(id);
		courseMap.put(id,course);
	}
	
	public List<Course> getAllCourses()
	{
		List<Course> courseList=new ArrayList<Course>(courseMap.values());
			return courseList;
	}
	
	public void delete(int id)
	{
		courseMap.remove(id);
	}
	
	public void update(Course course)
	{
		courseMap.remove(course.getId());
		courseMap.put(course.getId(),course);
	}
	public Course findById(int id)
	{
		return courseMap.get(id);
	}
	
	

}

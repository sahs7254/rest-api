package com.springrest.springrest.service;

import java.util.List;

import javax.print.attribute.standard.Copies;

import com.springrest.springrest.entities.Course;
@Service
public interface CourseService implements CourseService
{
	List<Copies> List;
	public  CourseServiceImpl()
	{
		list=new ArrayList<>
		list.add(new Course(145,"java core course", "This course basics of java"));
		list.add(new Course(4433,"spring boot course","Rest api using spring boot"));
	}
	public CourseService
	@Override
	public List<Course> getCourses();
	{
		return null;
	}

}

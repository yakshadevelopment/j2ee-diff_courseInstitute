package edu.yaksha.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.yaksha.course.dao.CourseData;
import edu.yaksha.course.model.Course;

@Controller
public class CourseController {
	@Autowired
	   private CourseData courseData;
		@RequestMapping("/start")
		public String openHomePage(Model model) {
			List<Course> courseList = courseData.getAllCourses();
			model.addAttribute("courseList", courseList);
		    return "homePage";
		}
		
		@RequestMapping("/addNewCourse")
		public String showNewCoursePage(Model model) {
			Course course=new Course();
			model.addAttribute("courseRecord",course);
			return "insertCourse";
		}
		
		@RequestMapping(value = "/saveCourse", method = RequestMethod.POST)
		public String saveCourse(@ModelAttribute("courseRecord") Course course ) {
			courseData.save(course);
			return "redirect:/start";
			}
		
		@RequestMapping("/editCourse/{id}")
		public String showEditCoursePage(@PathVariable(name = "id") int id,Model model) {
			Course course=courseData.findById(id);
	        model.addAttribute("courseRecord",course);
			return "editCourse";
		}
		
		@RequestMapping("/editCourse/editSave")
		public String saveEditedCourse(@ModelAttribute("courseRecord")Course course)
		{
			courseData.update(course);
		 return "redirect:/start";
		}
		
		
		@RequestMapping("/removeCourse/{id}")
		public String deleteCourse(@PathVariable(name = "id") int id) {
			courseData.delete(id);
			return "redirect:/start";		
		}


}

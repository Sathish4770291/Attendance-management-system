package com.example.cms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.cms.Entity.Student;
import com.example.cms.Service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping({"/login" , "/studentLogin"})
	public String loginPage(Model model) {
		return "login";
	}
	
	
	
//handler method to handle list students and return mode and view
	@GetMapping({"/"})
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		//return "student";
		return "Homepage";
	}

	@GetMapping({"/student"})
	public String StudentManagement(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "student";
	}

	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);

		return "create_student";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/student";

	}

	@GetMapping("/studentAttendance")
	public String studentAttendance(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "StudentAttendance";

	}

	@GetMapping("/student/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {

		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		//get  student from the database by the id
		Student existingStudent= studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setRegisterNumber(student.getRegisterNumber());
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setDob(student.getDob());
		existingStudent.setGender(student.getGender());
		existingStudent.setBloodGrp(student.getBloodGrp());
		existingStudent.setDepartment(student.getDepartment());
		existingStudent.setDepartmentYear(student.getDepartmentYear());
		existingStudent.setMobileNumber(student.getMobileNumber());
		existingStudent.setParentNumber(student.getParentNumber());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setAddress(student.getAddress());
		
		//save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/student";
	}

	
	@GetMapping("/student/delete/{id}")
	public String deleteStudentById(@PathVariable Long id , Model model) {
		
		studentService.deleteStudentById(id);
		return "redirect:/student";
	}
	@GetMapping("/student/logout")
	public String studentLogout(Model model) {
		return "redirect:/login";
	}
}

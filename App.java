package com.hiber.demo.Hibernate_first_project;

import com.hiber.demo.Hibernate_first_project.dao.StudentDao;
import com.hiber.demo.Hibernate_first_project.model.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	StudentDao studentdao=new StudentDao();
        
        Student student=new Student("Priti", "Yadav", "PY@gmail.com");
        studentdao.saveStudent(student);
        Student student1=new Student("Neha", "Vishwakarma", "NY@gmail.com");
        studentdao.saveStudent(student1);
        
        student1.setFname("Nisha");
        studentdao.updateStudent(student1);
        
        studentdao.getStudentById(1);
        studentdao.deleteStudent(1);
        
        studentdao.getStudentById(1);
        
        
     
    }
}

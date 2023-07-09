package Controllers;

import Domen.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher>{
  private final TeacherService tchService = new TeacherService();

  @Override
  public void create(String firstName, int age) {
    tchService.create(firstName, age);
    tchService.sortByFIOTeachList();
   
  }


  
}

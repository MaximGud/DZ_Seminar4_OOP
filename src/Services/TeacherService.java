package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher>{
  private String acadDegree;
  private List<Teacher> teachers;
  public TeacherService() {
    
    this.teachers = new ArrayList<Teacher>();
  }
  @Override
  public List<Teacher> getAll() {
    return teachers;
  }
  @Override
  public void create(String firstName, int age) {
    Teacher per = new Teacher(firstName, age, acadDegree);
    teachers.add(per);
  }
//метод вывода списка учителей отсортированного обобщенным классом PersonComparator
  public void sortByFIOTeachList() {
    
   teachers.sort(new PersonComparator<Teacher>());
  
  }
  
}


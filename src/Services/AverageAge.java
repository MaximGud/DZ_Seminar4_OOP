package Services;

import java.util.List;

import Domen.Person;

public class AverageAge<T extends Person> {

  public Integer getAverageAge(List<T> persons) {
    int res = 0;
    for (int i = 0; i < persons.size(); i++) {

      res = res + persons.get(i).getAge();
    }
    return res / persons.size();
  }
}

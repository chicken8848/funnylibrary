public class FilterPersonExample {
  public static void main(String[] args) {
    Person p1 = new Person("A", 90, 'F', false);
    Person p2 = new Person("B", 60, 'M', true);
    Person p3 = new Person("C", 30, 'F', true);
    Person[] p = {p1, p2, p3};
    System.out.println(Filter.seniorFilter(p));
  }
}

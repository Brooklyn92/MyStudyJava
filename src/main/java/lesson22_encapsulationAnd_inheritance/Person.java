package lesson22_encapsulationAnd_inheritance;

public class Person {
    final String pol;

    public Person(String pol) {
        this.pol = pol;
    }
    private String name;
    private int yearsOld;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {

        if (yearsOld >0) {
            this.yearsOld = yearsOld;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >0) {
            this.weight = weight;
        }
    }

}
    class Test {
        public static void main(String[] args) {
            Person person1 = new Person("male");
            person1.setName("Kolya");
            person1.setWeight(45);
            person1.setYearsOld(145);
            person1.setWeight(-100);// 45
            System.out.println(person1.getName() + ", " + person1.getWeight() + ",  " + person1.getYearsOld());
        }
    }

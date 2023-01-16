public class Grandfather {
   private String name;
   private int age = generateDefaultAge();

   public Grandfather(String family, int i) {

   }

   public Grandfather(String family) {

   }

   private char generateDefaultAge() {
      return 0;
   }

   private Profession profession;

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;

   }
   public String getInfo(){
      return  "Age: " + age +
              "\nShelter name " + profession.name()+
              "\nShelter age: " + profession.toString();
   }

   }

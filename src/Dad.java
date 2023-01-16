public class Dad extends Grandfather{
  private static final String family =("Семья") ;
  private String name;
  private int age;

  private String[] commands;

  public Dad() {
    super(family);
  }

  final void makeVoice(){
    System.out.println("Сидиди дома");

  }

  void makeVoice(String voice){
    System.out.println(voice);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getInfo() {

    return super.getInfo()+
            "\nName:" + name +
            "\nAge:" + age +
            "\nCommands:" + commands;




}

  }


public class Son extends Dad {
    private String name;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    void makeVoice(String voice) {
        super.makeVoice(voice);
    }
}

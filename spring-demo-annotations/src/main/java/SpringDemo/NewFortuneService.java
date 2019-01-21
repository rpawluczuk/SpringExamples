package SpringDemo;

public class NewFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "This is another fortune but I don't know that this is good or bad fortune :/";
    }
}

package J3_4;

public class NvwaMakePerson {
    public static void main(String[] args){
        Person person;
        //person = Nvwa.getPerson("M"); //女娲造男
        person = Nvwa.getPerson("W");//女娲造女人
       // person = Nvwa.getPerson("R");//女娲造机器人
        person.makePerson();
    }
}

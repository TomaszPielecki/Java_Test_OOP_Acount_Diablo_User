package Team;

public class Main {

    public static void main(String[] args) {
        System.out.println("Diablo2 Resurection");
        Member myMember = new Member("Tomasz","Druid",10,1);
        Member myMember1 = new Member("Konrad","Paladyn",8,4);
        Member myMember2 = new Member("Waldemar","Mag",9,3);
        Member myMember3 = new Member("Konrad","Barbarian",7,2);
        Team myTeam = new Team(myMember);


        System.out.println(myMember.getName());
        System.out.println(myMember1.getType());
        System.out.println(myMember2.getName());
        System.out.println(myMember3.getType());
        System.out.println(myTeam.member.getName()+" lvl "+myTeam.member.getLvl()+" ranga "+myTeam.member.getRank());



    }
}
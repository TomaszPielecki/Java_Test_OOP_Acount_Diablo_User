package Team;

public class Member {
    String name;
    String type;
    int lvl;
    int rank;

    public Member(String name, String type, int lvl, int rank) {
        this.name = name;
        this.type = type;
        this.lvl = lvl;
        this.rank = rank;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLvl() {
        return lvl;}

    public int getRank() {
        return rank;
    }
}
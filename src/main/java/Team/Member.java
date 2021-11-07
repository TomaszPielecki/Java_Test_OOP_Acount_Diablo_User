package Team;

class Member {
    public String name;
    public String type;
    public int lvl;
    public int rank;

    public Member(String name, String type, int lvl, int rank) {
        this.name = name;
        this.type = type;
        this.lvl = lvl;
        this.rank = rank;
    }

    public Member() {
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLvl() {
        return lvl;
    }

    public int getRank() {
        return rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString() {
        return "name=" + name + " " + ", type='" + type + " " + ", lvl=" + lvl + ", rank=" + rank;
    }
}
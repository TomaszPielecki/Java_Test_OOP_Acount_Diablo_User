package Team;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


class MemberTest {
    // testowanie getterow w Javie
    @org.junit.jupiter.api.Test
    void getName() {
    }

    @org.junit.jupiter.api.Test
    void getType() {
    }

    @org.junit.jupiter.api.Test
    void getLvl() {
    }

    @org.junit.jupiter.api.Test
    void getRank() {
    }

    //testowanie zmiennych Unity 5
    @Test
    void myTestMember() {
        Member myMember = new Member("Janusz", "Paladyn", 70, 6);
    }

    @Test
    public void myTestActive() {
        Account newAccount = new Account();
        assertFalse(newAccount.isActive());
    }

    @Test
    void name() {
        System.out.println("View method name");
    }

    @Test
    void rank() {
        System.out.println("View method rank");
    }

    @Test
    void lvl() {
        System.out.println("View method lvl");
    }

    @Test
    void type() {
        System.out.println("View method type");
    }

    @Test
    void testToString() {
        System.out.println("View method toString");
    }

    @Test
    void main() {
        System.out.println("View method Main");
    }

    @Test
    void testClassMemberSet() {
        System.out.println("Test method Set is Ok");
        Member myMember5 = new Member();
        myMember5.setName("Adrien");
        myMember5.setType("Druid");
        myMember5.setLvl(30);
        myMember5.setRank(50);
    }

    @Test
    void testClassMemberGet() {
        System.out.println("Test Method Get is OK");
        Member myMember3 = new Member("Janusz", "Paladyn", 70, 6);
        myMember3.getName();
        myMember3.getType();
        myMember3.getLvl();
        myMember3.getRank();
    }
}





class AlienPack {
    int size;
    Alien alien[];

    public AlienPack(int x) {
        alien = new Alien[x];
    }

    void addAlien(Alien alien, int x) {
        this.alien[x] = alien;
    }

    Alien[] getAliens() {
        return alien;
    }

}

class MenInBlack {
    int score = 0;
    AlienPack alienPack;

    public MenInBlack(AlienPack pack) {
        this.alienPack = pack;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public AlienPack getAlienPack() {
        return alienPack;
    }

    public void setAlienPack(AlienPack alienPack) {
        this.alienPack = alienPack;
    }

    void kill() {
        Alien alien[] = alienPack.getAliens();
        for (int i = 0; i < alien.length; i++) {
            score += alien[i].getScore();
        }
    }

}

class Main {
    public static void main(String[] args) {
        AlienPack pack1 = new AlienPack(5);
        pack1.addAlien(new MarshmalloAlien(), 0);
        pack1.addAlien(new OgreAlien(), 1);
        pack1.addAlien(new OgreAlien(), 2);
        pack1.addAlien(new SnakeAlien(), 3);
        pack1.addAlien(new MarshmalloAlien(), 4);

        MenInBlack AgentK = new MenInBlack(pack1);
        AgentK.kill();
        System.out.println("Your Score is : " + AgentK.getScore());
    }
}

class MenInBlackLevel2 extends MenInBlack {

    public MenInBlackLevel2(AlienPack pack) {
        super(pack);

    }

    @Override
    void kill() {
        Alien alien[] = alienPack.getAliens();
        for (int i = 0; i < alien.length; i++) {
            int random = (int) (Math.random() * 10);
            score += alien[i].getScore();
            if (random % 2 == 1) {
                score += random;
            }
        }
    }

}

interface Alien {
    int getScore();
}

class MarshmalloAlien implements Alien {
    int score = 15;

    @Override
    public int getScore() {

        return score;
    }

}

class OgreAlien implements Alien {
    int score = 10;

    @Override
    public int getScore() {

        return score;
    }

}

class SnakeAlien implements Alien {
    int score = 5;

    @Override
    public int getScore() {

        return score;
    }

}
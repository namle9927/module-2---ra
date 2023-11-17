package BT.b1;

public class FootballTeam implements Comparable {
    private int Id;
    private String Name;
    private int numberOfPlayer ;
    private int score;

    public FootballTeam(int id, String name, int numberOfPlayer, int score) {
        Id = id;
        Name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public FootballTeam() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", numberOfPlayer=" + numberOfPlayer +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

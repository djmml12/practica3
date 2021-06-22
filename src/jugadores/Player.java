package src.players;
public class Player{
    private int id,score,ganadas,perdidas;
    private String name;
    public Player(int id, String name){
        score = 0;
        this.id = id;
        this.name = name;
        ganadas = 0;
        perdidas = 0;
    }
    public int getId(){
        return id;
    }
    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score=score;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getGanadas(){
        return ganadas;
    }
    public void setGanadas(int ganadas){
        this.ganadas = ganadas;
    }
    public int getPerdidas(){
        return perdidas;
    }
    public void setPerdidas(int perdidas){
        this.perdidas = perdidas;
    }

    public void getInfo(){
        System.out.printf( "id: %-2d    nombre: %-20s     derrotas: %-3d    victorias: %-3d%n",id,name,perdidas,ganadas); //+" score: "+score
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package v3q6;

/**
 *
 * @author jirui
 */
public class V3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hero molly = new Hero("Molly", "Water", 45, 20);
        Hero sean = new Hero("Sean", "Fire", 36, 24);
        Hero duncan = new Hero("Duncan", "Earth", 53, 16);
        Hero nathaniel = new Hero("Nathaniel", "Light", 37, 24);
        Hero endor = new Hero("Endor", "Dark", 43, 21);
        Hero urd = new Hero("Urd", "Water", 65, 17);
        Hero skuld = new Hero("Skuld", "Fire", 66, 16);
        Hero verthandi = new Hero("Verthandi", "Earth", 74, 13);
        Hero idun = new Hero("Idun", "Light", 59, 19);
        Hero valkyrie = new Hero("Valkyrie", "Dark", 61, 18);
        Hero poseidon = new Hero("Poseidon", "Water", 58, 19);
        Hero hephaestus = new Hero("Hephaestus", "Fire", 51, 22);
        Hero athena = new Hero("Athena", "Earth", 61, 18);
        Hero apollo = new Hero("Apollo", "Light", 55, 16);
        Hero artemis = new Hero("Artemis", "Dark", 50, 23);
        
        Hero[] heroes = {molly, sean, duncan, nathaniel, endor, urd, skuld, verthandi, idun, valkyrie, poseidon, hephaestus, athena, apollo, artemis};
        
        Villain giemsa = new Villain("Giemsa", "Water", 100, 150, 15, 2);
        Villain diablo = new Villain("Diablo", "Fire", 120, 163, 13, 3);
        Villain nidhogg = new Villain("Nidhogg", "Earth", 130, 189, 11, 4);
        Villain lucifer = new Villain("Lucifer", "Light", 110, 207, 17, 3);
        Villain odin = new Villain("Odin", "Dark", 135, 196, 14, 5);
        
        Team team = new Team(heroes);
        Villain[] villains = {giemsa, diablo, nidhogg, lucifer, odin};
        Game game = new Game();
        
        
        team.formTeam();
        System.out.println(team);
        
        boolean gameStatus = true;
        for(int x = 0; x < villains.length; x++){

            team.resetTeamHp();
            team.resetTeamMultiplier();
            gameStatus = game.battle(team, villains[x]);
            if(!gameStatus){
                break;
            }
            if(x != villains.length-1){
                System.out.println("Continuing to the next battle...");
                System.out.println("");
            }
        }
        
        if(!gameStatus){
            System.out.println("Game over...");
        }
        else{
            System.out.println("Congratsss");
        }
        
    }
    
}

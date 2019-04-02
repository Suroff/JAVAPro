package jppro_l1;

public class Team {

    private String TeamName;
    private Participant[] participants;


    public Team(String TeamName, Participant... participants){

        this.TeamName = TeamName;
        this.participants = participants;

    }
    

    public Participant[] getParticipants() {
        return participants;
    }

    public void TeamInfo(Team team){
        System.out.println("Название команды " + team.TeamName);
        System.out.println("Участники: ");
        for (Participant participant : team.getParticipants()){
            String n = participant.getParticipantName();
            String a = Integer.toString(participant.getParticipantAge());
            String c = participant.getParticipantColor();

            System.out.println("Имя " + n + " Возраст " + a + " Цвет " + c);
        }
        System.out.println("*************************************************");
    }

    public void TeamResult(Team team){
        System.out.println("*************************************************");
        System.out.println("Название команды " + team.TeamName);
        System.out.println("Финишировали: ");
        for (Participant participant : team.getParticipants()){

            String n = participant.getParticipantName();
            String a = Integer.toString(participant.getParticipantAge());
            String c = participant.getParticipantColor();

            if (!participant.Off()) {
                System.out.println("Имя " + n + " Возраст " + a + " Цвет " + c);
            }
        }
        System.out.println("*************************************************");
    }


}

class EventRegistration {
    protected String name;
    protected String nameOfEvent;
    protected double registrationFee;

    EventRegistration(String name, String nameOfEvent) {
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public void registerEvent() {
        System.out.println("Please choose a valid event");
    }
}

class SingleEventRegistration extends EventRegistration {
    private int participantNo;

    SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    @Override
    public void registerEvent() {
        switch (nameOfEvent) {
            case "ShakeALeg":
                registrationFee = 100;
                break;
            case "Sing&Win":
                registrationFee = 150;
                break;
            case "PlayAway":
                registrationFee = 130;
                break;
            default:
                super.registerEvent();
                return;
        }
        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
        System.out.println("You are participant no: " + participantNo);
    }
}

class TeamEventRegistration extends EventRegistration {
    private int teamNo;
    private int noOfParticipants;

    TeamEventRegistration(String name, String nameOfEvent, int teamNo, int noOfParticipants) {
        super(name, nameOfEvent);
        this.teamNo = teamNo;
        this.noOfParticipants = noOfParticipants;
    }

    @Override
    public void registerEvent() {
        switch (nameOfEvent) {
            case "ShakeALeg":
                registrationFee = 50 * noOfParticipants;
                break;
            case "Sing&Win":
                registrationFee = 60 * noOfParticipants;
                break;
            case "Actathon":
                registrationFee = 80 * noOfParticipants;
                break;
            case "PlayAway":
                registrationFee = 100 * noOfParticipants;
                break;
            default:
                super.registerEvent();
                return;
        }
        System.out.println("Thank You " + name + " for your participation. Your registration fee is: " + registrationFee);
        System.out.println("You are participant no: " + teamNo);
    }
}

public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        SingleEventRegistration participant1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        participant1.registerEvent();

        TeamEventRegistration team1 = new TeamEventRegistration("Aura", "ShakeALeg", 1, 5);
        team1.registerEvent();

        SingleEventRegistration participant2 = new SingleEventRegistration("Hudson", "PlayAway", 2);
        participant2.registerEvent();
    }
}

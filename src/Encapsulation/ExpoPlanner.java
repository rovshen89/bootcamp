package Encapsulation;

public class ExpoPlanner extends Planner {
    String expoName;
    String[][] checkLists;

    ExpoPlanner(){
        super();
        this.expoName = "default";
        this.checkLists = new String[10][4];
    }

    void listAll(){
        System.out.println("Date\t\t Event\t\t\t Checklist" );
        for (int i = 0; i < super.datesEvents.length; i++){
            System.out.print(super.datesEvents[i][0] + "\t\t" + super.datesEvents[i][1]);
            for (int j = 0; j < this.checkLists[i].length; j++){
                System.out.print(this.checkLists[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void modifyCheckList(String date, String checkList[]){
        int index = 0;
        for (int i = 0; i < super.datesEvents.length; i++){
            if (super.datesEvents[i][0].equalsIgnoreCase(date)){
                index = i;
            }
        }
        this.checkLists[index] = checkList;
    }
}

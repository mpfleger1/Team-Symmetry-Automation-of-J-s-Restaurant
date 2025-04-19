import java.util.Scanner;
import java.util.List;
public class waiterAuthorization {
    //receives alert from waiter profile regarding table assignments
    // should be able to see what table the waiter is tending to
    Scanner sc = new Scanner(System.in);
    List<ProfileD> profile;

    public waiterAuthorization(List<ProfileD> profile) {
        this.profile = profile;
    }

    public void authorize(){
        System.out.println("Submit Waiter's ID: ");
        int waiterID = sc.nextInt();
        boolean correct = false;
        for (ProfileD profile : profile) {
            if((waiterID == profile.ID) && (profile.role.equals("Waiter"))){
                System.out.println("Waiter " + profile.fname + " " + profile.lname + " authorized to operate at: Table " + profile.table);
                correct = true;
                break;
            }

        }

        if (!correct){
            System.out.println("No waiter profile found");
        }

    }

}

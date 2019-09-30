/**
 * @author Neil
 * @version 1
 * @date 23/09/2019
 */

public class Minute {
    private short hour;
    private short minute;
    private short second;

    public Minute(short minute){
        this.minute = minute;
    }//end method Clock

    public void setMinute(short minute) {
        this.minute = minute;
    }

    public short getMinute() {
        return minute;
    }

}

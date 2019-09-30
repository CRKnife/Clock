/**
 * @author Neil
 * @version 1
 * @date 23/09/2019
 */

public class Second {
    private short hour;
    private short minute;
    private short second;

    public Second(short second){
        this.second=second;
    }//end method Clock

    public void setSecond(short second) {
        this.second = second;
    }

    public short getSecond() {
        return second;
    }

}

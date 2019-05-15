package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Blows those buttons which has 0 value and the neighbours of the clicked button.
 */

public class NullBlower implements mezo{

    /**
     * Creating new Bomb.
     */
    private Akna akna= new Akna();

    /**
     * Counts disabled buttons.
     */
    private  int disabledCounter=0;

    /**
     *Blows the 0 value neighbours.
     * @param toClear the ist of buttons which have to disabled.
     */
    public void Blower(ArrayList<Integer> toClear){

        if(isEmptyList(toClear)) {
            return;
        }
        else
        {
            int i=toClear.get(0)/100;
            int j=toClear.get(0)%100;
            toClear.remove(0);
            if(counter[i][j]==0) {
                if(i>0 && j>0 && !mezo[i-1][j-1].isDisabled()) {                                                         //bal felső
                    mezo[i - 1][j - 1].setText(counter[i - 1][j - 1] + "");
                    if (counter[i - 1][j - 1] == 0) {
                        toClear.add((i - 1) * 100 + (j - 1));
                    }
                    if (mezo[i - 1][j - 1].isDisable() == false) {
                        disabledCounter++;
                        mezo[i - 1][j - 1].setDisable(true);
                    }

                }

                if(j>0 && !mezo[i][j-1].isDisabled()) {                                                                  //felső
                    mezo[i][j - 1].setText(counter[i][j - 1] + "");
                    if (counter[i][j - 1] == 0) {
                        toClear.add((i) * 100 + (j - 1));
                    }
                    if (mezo[i][j - 1].isDisable() == false) {
                        disabledCounter++;
                        mezo[i][j - 1].setDisable(true);
                    }
                }

                if(i>0 && !mezo[i-1][j].isDisabled()) {                                                                  //bal
                    mezo[i - 1][j].setText(counter[i - 1][j] + "");
                    if (counter[i - 1][j] == 0) {
                        toClear.add((i - 1) * 100 + (j));
                    }
                    if (mezo[i - 1][j].isDisable() == false) {
                        disabledCounter++;
                        mezo[i - 1][j].setDisable(true);
                    }
                }

                if(j<counter.length-1 && !mezo[i][j+1].isDisabled()) {                                                   //alsó
                    mezo[i][j + 1].setText(counter[i][j + 1] + "");
                    if (counter[i][j + 1] == 0) {
                        toClear.add((i) * 100 + (j + 1));
                    }
                    if (mezo[i][j + 1].isDisable() == false) {
                        disabledCounter++;
                        mezo[i][j + 1].setDisable(true);
                    }
                }

                if(i<counter[0].length-1 && !mezo[i+1][j].isDisabled()){                                                //jobb
                    mezo[i+1][j].setText(counter[i+1][j]+"");

                    if(counter[i+1][j]==0) {
                        toClear.add((i + 1) * 100 + (j));
                    }
                    if(mezo[i+1][j].isDisable()==false) {
                        disabledCounter++;
                        mezo[i + 1][j].setDisable(true);
                    }
                }

                if(i<counter[0].length-1 && j>0 && !mezo[i+1][j-1].isDisabled()) {                                       //jobb felső
                    mezo[i + 1][j - 1].setText(counter[i + 1][j - 1] + "");

                    if (counter[i + 1][j - 1] == 0) {
                        toClear.add((i + 1) * 100 + (j - 1));
                    }
                    if (mezo[i + 1][j - 1].isDisable() == false) {
                        disabledCounter++;
                        mezo[i + 1][j - 1].setDisable(true);
                    }
                }

                if(i>0 && j<counter.length-1 && !mezo[i-1][j+1].isDisabled()) {                                          //bal alsó
                    mezo[i - 1][j + 1].setText(counter[i - 1][j + 1] + "");

                    if (counter[i - 1][j + 1] == 0) {
                        toClear.add((i - 1) * 100 + (j + 1));
                    }
                    if (mezo[i - 1][j + 1].isDisable() == false) {
                        disabledCounter++;
                        mezo[i - 1][j + 1].setDisable(true);
                    }
                }

                if(i<counter[0].length-1 && j<counter.length-1 && !mezo[i+1][j+1].isDisabled()) {                        //jobb alsó
                    mezo[i + 1][j + 1].setText(counter[i + 1][j + 1] + "");

                    if (counter[i + 1][j + 1] == 0) {
                        toClear.add((i + 1) * 100 + (j + 1));
                    }
                    if (mezo[i + 1][j + 1].isDisable() == false) {
                        disabledCounter++;
                        mezo[i + 1][j + 1].setDisable(true);
                    }
                }
            }
            Blower(toClear);
        }
    }

    /**
     *
     * @return number of disabled buttons.
     */
    public int getDisabledCounter() {
        return disabledCounter;
    }

    /**
     *
     * @param disabledCounter modify of the number of disabled buttons.
     */
    public void setDisabledCounter(int disabledCounter) {
        this.disabledCounter = disabledCounter;
    }

    /**
     * Watches if the list is empty.
     * @param list what the metod watches if it is empty.
     * @return if the list is empty.
     */
    public boolean isEmptyList(List list){
       if(list.size()==0)
           return true;

       else
           return false;
    }
}

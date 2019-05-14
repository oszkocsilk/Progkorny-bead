/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Blows the bomb is you choose it.
 */

public class BlowedUp implements mezo{public static class __CLR4_3_12626jvnm2qyz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0061\u0073\u0064\u0061\u0073\u0064\u005c\u005c\u0049\u0064\u0065\u0061\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0061\u006b\u006e\u0061\u006b\u0065\u0072\u0065\u0073\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557827171536L,8589935092L,108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Aknakereso aknakereso;

    /**
     *Calls the created @aknakereso.
     * @param aknakereso the created Aknakereso
     */

    public BlowedUp(Aknakereso aknakereso) {try{__CLR4_3_12626jvnm2qyz.R.inc(78);
        __CLR4_3_12626jvnm2qyz.R.inc(79);this.aknakereso = aknakereso;
    }finally{__CLR4_3_12626jvnm2qyz.R.flushNeeded();}}

    /**
     * This watches when you chose a bomb and shows that is a bomb.
     */
    public void Blowed() {try{__CLR4_3_12626jvnm2qyz.R.inc(80);
        __CLR4_3_12626jvnm2qyz.R.inc(81);for (int x = 0; (((x < aknakereso.getMezo().length)&&(__CLR4_3_12626jvnm2qyz.R.iget(82)!=0|true))||(__CLR4_3_12626jvnm2qyz.R.iget(83)==0&false)); x++) {{
            __CLR4_3_12626jvnm2qyz.R.inc(84);for (int y = 0; (((y < aknakereso.getMezo().length)&&(__CLR4_3_12626jvnm2qyz.R.iget(85)!=0|true))||(__CLR4_3_12626jvnm2qyz.R.iget(86)==0&false)); y++) {{
                __CLR4_3_12626jvnm2qyz.R.inc(87);aknakereso.getMezo()[x][y].setDisable(true);

                __CLR4_3_12626jvnm2qyz.R.inc(88);if ((((counter[x][y] == 666)&&(__CLR4_3_12626jvnm2qyz.R.iget(89)!=0|true))||(__CLR4_3_12626jvnm2qyz.R.iget(90)==0&false))) {{

                    __CLR4_3_12626jvnm2qyz.R.inc(91);aknakereso.getMezo()[x][y].setText("X");
                    __CLR4_3_12626jvnm2qyz.R.inc(92);aknakereso.getMezo()[x][y].setStyle("-fx-background-color: #ff0000");
                }
            }}
        }}
    }}finally{__CLR4_3_12626jvnm2qyz.R.flushNeeded();}}

    /**
     *
     * @param title az \u00faj ablak c\u00edme
     * @param message az \u00faj ablak \u00fczenete
     */

    public static void display(String title, String message) {try{__CLR4_3_12626jvnm2qyz.R.inc(93);
        __CLR4_3_12626jvnm2qyz.R.inc(94);Stage window = new Stage();

        __CLR4_3_12626jvnm2qyz.R.inc(95);window.initModality(Modality.APPLICATION_MODAL);
        __CLR4_3_12626jvnm2qyz.R.inc(96);window.setTitle(title);
        __CLR4_3_12626jvnm2qyz.R.inc(97);window.setMinWidth(250);

        __CLR4_3_12626jvnm2qyz.R.inc(98);Label label = new Label();
        __CLR4_3_12626jvnm2qyz.R.inc(99);label.setText(message);
        __CLR4_3_12626jvnm2qyz.R.inc(100);Button closeButton = new Button("Close this window");
        __CLR4_3_12626jvnm2qyz.R.inc(101);closeButton.setOnAction(e -> window.close());

        __CLR4_3_12626jvnm2qyz.R.inc(102);VBox layout = new VBox(20);
        __CLR4_3_12626jvnm2qyz.R.inc(103);layout.getChildren().addAll(label, closeButton);
        __CLR4_3_12626jvnm2qyz.R.inc(104);layout.setAlignment(Pos.CENTER);

        __CLR4_3_12626jvnm2qyz.R.inc(105);Scene scene = new Scene(layout);
        __CLR4_3_12626jvnm2qyz.R.inc(106);window.setScene(scene);
        __CLR4_3_12626jvnm2qyz.R.inc(107);window.show();
    }finally{__CLR4_3_12626jvnm2qyz.R.flushNeeded();}}
}

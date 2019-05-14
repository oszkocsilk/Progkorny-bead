/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import lombok.extern.slf4j.Slf4j;

/**
 * Makes the whole table with bombs.
 */
@Slf4j
public class Aknakereso implements mezo{public static class __CLR4_3_11n1njvnm2qun{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0061\u0073\u0064\u0061\u0073\u0064\u005c\u005c\u0049\u0064\u0065\u0061\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0061\u006b\u006e\u0061\u006b\u0065\u0072\u0065\u0073\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557827171536L,8589935092L,76,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    private static int buttonLayout= 80;
    private Akna Leteszi =new Akna();

    /**
     * Makes  buttons, than puts the bombs down.
     */
    public Aknakereso() {try{__CLR4_3_11n1njvnm2qun.R.inc(59);

        __CLR4_3_11n1njvnm2qun.R.inc(60);for (int i=0;(((i<mezo[0].length)&&(__CLR4_3_11n1njvnm2qun.R.iget(61)!=0|true))||(__CLR4_3_11n1njvnm2qun.R.iget(62)==0&false));i++)
        {{   __CLR4_3_11n1njvnm2qun.R.inc(63);for(int j=0;(((j<mezo[1].length)&&(__CLR4_3_11n1njvnm2qun.R.iget(64)!=0|true))||(__CLR4_3_11n1njvnm2qun.R.iget(65)==0&false));j++)
            {{

                __CLR4_3_11n1njvnm2qun.R.inc(66);mezo[i][j] = new Button();
                __CLR4_3_11n1njvnm2qun.R.inc(67);mezo[i][j].setPrefSize(25,25);
                __CLR4_3_11n1njvnm2qun.R.inc(68);mezo[i][j].setLayoutX(25*i);
                __CLR4_3_11n1njvnm2qun.R.inc(69);mezo[i][j].setLayoutY(buttonLayout+25*j);
                __CLR4_3_11n1njvnm2qun.R.inc(70);table.getChildren().add(mezo[i][j]);

            }
        }}
        }__CLR4_3_11n1njvnm2qun.R.inc(71);Leteszi.akn\u00e1k();
    }finally{__CLR4_3_11n1njvnm2qun.R.flushNeeded();}}

    /**
     *
     * @return helps to get the link the empty slots
     */
    public Button[][] getMezo() {try{__CLR4_3_11n1njvnm2qun.R.inc(72);
        __CLR4_3_11n1njvnm2qun.R.inc(73);return mezo;
    }finally{__CLR4_3_11n1njvnm2qun.R.flushNeeded();}}

    /**
     *
     * @return gives an orderd table with the slots
     */
    public AnchorPane getTable() {try{__CLR4_3_11n1njvnm2qun.R.inc(74);
        __CLR4_3_11n1njvnm2qun.R.inc(75);return table;
    }finally{__CLR4_3_11n1njvnm2qun.R.flushNeeded();}}

}

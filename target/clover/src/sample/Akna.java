/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package sample;

import java.util.ArrayList;

/**
 * Makes the given number of bombs.
 */

public class Akna implements mezo{public static class __CLR4_3_100jvnm2qrg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0061\u0073\u0064\u0061\u0073\u0064\u005c\u005c\u0049\u0064\u0065\u0061\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0061\u006b\u006e\u0061\u006b\u0065\u0072\u0065\u0073\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557827171536L,8589935092L,59,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ArrayList<Integer>list = new ArrayList<Integer>();
    private double NumberOfBombs=3.0;

    /**
     * Places the number of bombs that given by @NumberOfBombs, than counts the bombs in the neighbours.
     */

    public void akn\u00e1k() {try{__CLR4_3_100jvnm2qrg.R.inc(0);
        __CLR4_3_100jvnm2qrg.R.inc(1);for (int i = 0; (((i < counter[0].length)&&(__CLR4_3_100jvnm2qrg.R.iget(2)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(3)==0&false)); i++) {{
            __CLR4_3_100jvnm2qrg.R.inc(4);for (int j = 0; (((j < counter.length)&&(__CLR4_3_100jvnm2qrg.R.iget(5)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(6)==0&false)); j++) {{
                __CLR4_3_100jvnm2qrg.R.inc(7);list.add(i * 100 + j);
            }
        }}


        }__CLR4_3_100jvnm2qrg.R.inc(8);for (int i = 0; (((i < NumberOfBombs)&&(__CLR4_3_100jvnm2qrg.R.iget(9)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(10)==0&false)); i++) {{
            __CLR4_3_100jvnm2qrg.R.inc(11);int bomb = (int) (Math.random() * list.size());
            __CLR4_3_100jvnm2qrg.R.inc(12);counter[list.get(bomb) / 100][list.get(bomb) % 100] = BOMB;
            __CLR4_3_100jvnm2qrg.R.inc(13);list.remove(bomb);


        }
        }__CLR4_3_100jvnm2qrg.R.inc(14);for (int i = 0; (((i < counter[0].length)&&(__CLR4_3_100jvnm2qrg.R.iget(15)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(16)==0&false)); i++) {{
            __CLR4_3_100jvnm2qrg.R.inc(17);for (int j = 0; (((j < counter.length)&&(__CLR4_3_100jvnm2qrg.R.iget(18)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(19)==0&false)); j++) {{
                __CLR4_3_100jvnm2qrg.R.inc(20);if ((((counter[i][j] != BOMB)&&(__CLR4_3_100jvnm2qrg.R.iget(21)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(22)==0&false))) {{
                    __CLR4_3_100jvnm2qrg.R.inc(23);int szomszed = 0;
                    __CLR4_3_100jvnm2qrg.R.inc(24);if ((((i > 0 && j > 0 && counter[i - 1][j - 1] == BOMB)&&(__CLR4_3_100jvnm2qrg.R.iget(25)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(26)==0&false)))                                    //bal fels\u0151
                        {__CLR4_3_100jvnm2qrg.R.inc(27);szomszed++;
                    }__CLR4_3_100jvnm2qrg.R.inc(28);if ((((j > 0 && counter[i][j - 1] == BOMB)&&(__CLR4_3_100jvnm2qrg.R.iget(29)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(30)==0&false)))                                             //fels\u0151
                        {__CLR4_3_100jvnm2qrg.R.inc(31);szomszed++;
                    }__CLR4_3_100jvnm2qrg.R.inc(32);if ((((i > 0 && counter[i - 1][j] == BOMB)&&(__CLR4_3_100jvnm2qrg.R.iget(33)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(34)==0&false)))                                             //bal
                        {__CLR4_3_100jvnm2qrg.R.inc(35);szomszed++;
                    }__CLR4_3_100jvnm2qrg.R.inc(36);if ((((j < counter.length - 1 && counter[i][j + 1] == BOMB)&&(__CLR4_3_100jvnm2qrg.R.iget(37)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(38)==0&false)))                              //als\u00f3
                        {__CLR4_3_100jvnm2qrg.R.inc(39);szomszed++;
                    }__CLR4_3_100jvnm2qrg.R.inc(40);if ((((i < counter[0].length - 1 && counter[i + 1][j] == BOMB)&&(__CLR4_3_100jvnm2qrg.R.iget(41)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(42)==0&false)))                           //jobb
                        {__CLR4_3_100jvnm2qrg.R.inc(43);szomszed++;
                    }__CLR4_3_100jvnm2qrg.R.inc(44);if ((((i < counter[0].length - 1 && j < counter.length - 1 && counter[i + 1][j + 1] == BOMB)&&(__CLR4_3_100jvnm2qrg.R.iget(45)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(46)==0&false)))   //jobb fels\u0151
                        {__CLR4_3_100jvnm2qrg.R.inc(47);szomszed++;
                    }__CLR4_3_100jvnm2qrg.R.inc(48);if ((((i > 0 && j < counter.length - 1 && counter[i - 1][j + 1] == BOMB)&&(__CLR4_3_100jvnm2qrg.R.iget(49)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(50)==0&false)))                     //bal als\u00f3
                        {__CLR4_3_100jvnm2qrg.R.inc(51);szomszed++;
                    }__CLR4_3_100jvnm2qrg.R.inc(52);if ((((i < counter[0].length - 1 && j > 0 && counter[i + 1][j - 1] == BOMB)&&(__CLR4_3_100jvnm2qrg.R.iget(53)!=0|true))||(__CLR4_3_100jvnm2qrg.R.iget(54)==0&false)))                  //jobb als\u00f3
                        {__CLR4_3_100jvnm2qrg.R.inc(55);szomszed++;

                    }__CLR4_3_100jvnm2qrg.R.inc(56);counter[i][j] = szomszed;
                }
            }}
        }}
    }}finally{__CLR4_3_100jvnm2qrg.R.flushNeeded();}}

    /**
     *
     * @return gives the number of bombs.
     */
    public double getNumberOfBombs() {try{__CLR4_3_100jvnm2qrg.R.inc(57);
        __CLR4_3_100jvnm2qrg.R.inc(58);return NumberOfBombs;
    }finally{__CLR4_3_100jvnm2qrg.R.flushNeeded();}}
}


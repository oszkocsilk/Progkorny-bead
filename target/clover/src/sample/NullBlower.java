/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package sample;

import java.util.ArrayList;

/**
 * Blows those buttons which has 0 value and the neighbours of the clicked button.
 */

public class NullBlower implements mezo{public static class __CLR4_3_15q5qjvnm2r3n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0061\u0073\u0064\u0061\u0073\u0064\u005c\u005c\u0049\u0064\u0065\u0061\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0061\u006b\u006e\u0061\u006b\u0065\u0072\u0065\u0073\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557827171536L,8589935092L,326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Akna akna= new Akna();
    private  int disabledCounter=0;

    /**
     *Blows the 0 value neighbours.
     * @param toClear the ist of buttons which have to disabled.
     */
    public void Blower(ArrayList<Integer> toClear){try{__CLR4_3_15q5qjvnm2r3n.R.inc(206);

        __CLR4_3_15q5qjvnm2r3n.R.inc(207);if((((toClear.size()==0)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(208)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(209)==0&false)))
        {{
            __CLR4_3_15q5qjvnm2r3n.R.inc(210);return;
        }
        }else
        {{
            __CLR4_3_15q5qjvnm2r3n.R.inc(211);int i=toClear.get(0)/100;
            __CLR4_3_15q5qjvnm2r3n.R.inc(212);int j=toClear.get(0)%100;
            __CLR4_3_15q5qjvnm2r3n.R.inc(213);toClear.remove(0);
            __CLR4_3_15q5qjvnm2r3n.R.inc(214);if((((counter[i][j]==0)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(215)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(216)==0&false)))
            {{
                __CLR4_3_15q5qjvnm2r3n.R.inc(217);if((((i>0 && j>0 && !mezo[i-1][j-1].isDisabled())&&(__CLR4_3_15q5qjvnm2r3n.R.iget(218)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(219)==0&false))) {{                                                         //bal fels\u0151
                    __CLR4_3_15q5qjvnm2r3n.R.inc(220);mezo[i - 1][j - 1].setText(counter[i - 1][j - 1] + "");
                    __CLR4_3_15q5qjvnm2r3n.R.inc(221);if ((((counter[i - 1][j - 1] == 0)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(222)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(223)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(224);toClear.add((i - 1) * 100 + (j - 1));
                    }
                    }__CLR4_3_15q5qjvnm2r3n.R.inc(225);if ((((mezo[i - 1][j - 1].isDisable() == false)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(226)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(227)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(228);disabledCounter++;
                        __CLR4_3_15q5qjvnm2r3n.R.inc(229);mezo[i - 1][j - 1].setDisable(true);
                    }

                }}

                }__CLR4_3_15q5qjvnm2r3n.R.inc(230);if((((j>0 && !mezo[i][j-1].isDisabled())&&(__CLR4_3_15q5qjvnm2r3n.R.iget(231)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(232)==0&false))) {{                                                                  //fels\u0151
                    __CLR4_3_15q5qjvnm2r3n.R.inc(233);mezo[i][j - 1].setText(counter[i][j - 1] + "");
                    __CLR4_3_15q5qjvnm2r3n.R.inc(234);if ((((counter[i][j - 1] == 0)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(235)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(236)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(237);toClear.add((i) * 100 + (j - 1));
                    }
                    }__CLR4_3_15q5qjvnm2r3n.R.inc(238);if ((((mezo[i][j - 1].isDisable() == false)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(239)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(240)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(241);disabledCounter++;
                        __CLR4_3_15q5qjvnm2r3n.R.inc(242);mezo[i][j - 1].setDisable(true);
                    }
                }}

                }__CLR4_3_15q5qjvnm2r3n.R.inc(243);if((((i>0 && !mezo[i-1][j].isDisabled())&&(__CLR4_3_15q5qjvnm2r3n.R.iget(244)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(245)==0&false))) {{                                                                  //bal
                    __CLR4_3_15q5qjvnm2r3n.R.inc(246);mezo[i - 1][j].setText(counter[i - 1][j] + "");
                    __CLR4_3_15q5qjvnm2r3n.R.inc(247);if ((((counter[i - 1][j] == 0)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(248)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(249)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(250);toClear.add((i - 1) * 100 + (j));
                    }
                    }__CLR4_3_15q5qjvnm2r3n.R.inc(251);if ((((mezo[i - 1][j].isDisable() == false)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(252)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(253)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(254);disabledCounter++;
                        __CLR4_3_15q5qjvnm2r3n.R.inc(255);mezo[i - 1][j].setDisable(true);
                    }
                }}

                }__CLR4_3_15q5qjvnm2r3n.R.inc(256);if((((j<counter.length-1 && !mezo[i][j+1].isDisabled())&&(__CLR4_3_15q5qjvnm2r3n.R.iget(257)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(258)==0&false))) {{                                                   //als\u00f3
                    __CLR4_3_15q5qjvnm2r3n.R.inc(259);mezo[i][j + 1].setText(counter[i][j + 1] + "");
                    __CLR4_3_15q5qjvnm2r3n.R.inc(260);if ((((counter[i][j + 1] == 0)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(261)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(262)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(263);toClear.add((i) * 100 + (j + 1));
                    }
                    }__CLR4_3_15q5qjvnm2r3n.R.inc(264);if ((((mezo[i][j + 1].isDisable() == false)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(265)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(266)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(267);disabledCounter++;
                        __CLR4_3_15q5qjvnm2r3n.R.inc(268);mezo[i][j + 1].setDisable(true);
                    }
                }}

                }__CLR4_3_15q5qjvnm2r3n.R.inc(269);if((((i<counter[0].length-1 && !mezo[i+1][j].isDisabled())&&(__CLR4_3_15q5qjvnm2r3n.R.iget(270)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(271)==0&false))){{                                                //jobb
                    __CLR4_3_15q5qjvnm2r3n.R.inc(272);mezo[i+1][j].setText(counter[i+1][j]+"");

                    __CLR4_3_15q5qjvnm2r3n.R.inc(273);if((((counter[i+1][j]==0)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(274)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(275)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(276);toClear.add((i + 1) * 100 + (j));
                    }
                    }__CLR4_3_15q5qjvnm2r3n.R.inc(277);if((((mezo[i+1][j].isDisable()==false)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(278)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(279)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(280);disabledCounter++;
                        __CLR4_3_15q5qjvnm2r3n.R.inc(281);mezo[i + 1][j].setDisable(true);
                    }
                }}

                }__CLR4_3_15q5qjvnm2r3n.R.inc(282);if((((i<counter[0].length-1 && j>0 && !mezo[i+1][j-1].isDisabled())&&(__CLR4_3_15q5qjvnm2r3n.R.iget(283)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(284)==0&false))) {{                                       //jobb fels\u0151
                    __CLR4_3_15q5qjvnm2r3n.R.inc(285);mezo[i + 1][j - 1].setText(counter[i + 1][j - 1] + "");

                    __CLR4_3_15q5qjvnm2r3n.R.inc(286);if ((((counter[i + 1][j - 1] == 0)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(287)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(288)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(289);toClear.add((i + 1) * 100 + (j - 1));
                    }
                    }__CLR4_3_15q5qjvnm2r3n.R.inc(290);if ((((mezo[i + 1][j - 1].isDisable() == false)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(291)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(292)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(293);disabledCounter++;
                        __CLR4_3_15q5qjvnm2r3n.R.inc(294);mezo[i + 1][j - 1].setDisable(true);
                    }
                }}

                }__CLR4_3_15q5qjvnm2r3n.R.inc(295);if((((i>0 && j<counter.length-1 && !mezo[i-1][j+1].isDisabled())&&(__CLR4_3_15q5qjvnm2r3n.R.iget(296)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(297)==0&false))) {{                                          //bal als\u00f3
                    __CLR4_3_15q5qjvnm2r3n.R.inc(298);mezo[i - 1][j + 1].setText(counter[i - 1][j + 1] + "");

                    __CLR4_3_15q5qjvnm2r3n.R.inc(299);if ((((counter[i - 1][j + 1] == 0)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(300)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(301)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(302);toClear.add((i - 1) * 100 + (j + 1));
                    }
                    }__CLR4_3_15q5qjvnm2r3n.R.inc(303);if ((((mezo[i - 1][j + 1].isDisable() == false)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(304)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(305)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(306);disabledCounter++;
                        __CLR4_3_15q5qjvnm2r3n.R.inc(307);mezo[i - 1][j + 1].setDisable(true);
                    }
                }}

                }__CLR4_3_15q5qjvnm2r3n.R.inc(308);if((((i<counter[0].length-1 && j<counter.length-1 && !mezo[i+1][j+1].isDisabled())&&(__CLR4_3_15q5qjvnm2r3n.R.iget(309)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(310)==0&false))) {{                        //jobb als\u00f3
                    __CLR4_3_15q5qjvnm2r3n.R.inc(311);mezo[i + 1][j + 1].setText(counter[i + 1][j + 1] + "");

                    __CLR4_3_15q5qjvnm2r3n.R.inc(312);if ((((counter[i + 1][j + 1] == 0)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(313)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(314)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(315);toClear.add((i + 1) * 100 + (j + 1));
                    }
                    }__CLR4_3_15q5qjvnm2r3n.R.inc(316);if ((((mezo[i + 1][j + 1].isDisable() == false)&&(__CLR4_3_15q5qjvnm2r3n.R.iget(317)!=0|true))||(__CLR4_3_15q5qjvnm2r3n.R.iget(318)==0&false))) {{
                        __CLR4_3_15q5qjvnm2r3n.R.inc(319);disabledCounter++;
                        __CLR4_3_15q5qjvnm2r3n.R.inc(320);mezo[i + 1][j + 1].setDisable(true);
                    }
                }}
            }}
            }__CLR4_3_15q5qjvnm2r3n.R.inc(321);Blower(toClear);
        }
    }}finally{__CLR4_3_15q5qjvnm2r3n.R.flushNeeded();}}

    /**
     *
     * @return number of disabled buttons.
     */

    public int getDisabledCounter() {try{__CLR4_3_15q5qjvnm2r3n.R.inc(322);
        __CLR4_3_15q5qjvnm2r3n.R.inc(323);return disabledCounter;
    }finally{__CLR4_3_15q5qjvnm2r3n.R.flushNeeded();}}

    /**
     *
     * @param disabledCounter modify of the number of disabled buttons.
     */
    public void setDisabledCounter(int disabledCounter) {try{__CLR4_3_15q5qjvnm2r3n.R.inc(324);
        __CLR4_3_15q5qjvnm2r3n.R.inc(325);this.disabledCounter = disabledCounter;
    }finally{__CLR4_3_15q5qjvnm2r3n.R.flushNeeded();}}
}

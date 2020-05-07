package run;

import helper.dvrapp;

public class dvr {
	public static void main(String[] args){
        try{
            dvrapp dvr = new dvrapp();
            dvr.begin();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}


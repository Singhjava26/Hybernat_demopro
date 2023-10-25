package com.hibernate.MCU;

import com.hibernate.MCU.dao.Marvel_Library_dao;
import com.hibernate.MCU.model.Marvel;

public class App 
{
    public static void main( String[] args )
    {
    	Marvel_Library_dao  Mrldao= new Marvel_Library_dao();
    	Marvel lib=new Marvel("Iron Men","Mark-52");
        Mrldao.saveMarvel(lib);
        
        Marvel lib1=new Marvel("Odin","Stombrekar");
        Mrldao.saveMarvel(lib1);
        
        Marvel lib2=new Marvel("Shang-Chi","Ten-Rings");
        Mrldao.saveMarvel(lib2);
        
        lib1.setNmae("THOR");
        Mrldao.updateMarvel(lib1);
        
        //libdao.deleteMarvel(2);
        Mrldao.getMarvelById(1);
        Mrldao.getMarvelById(2);
        Mrldao.getMarvelById(3);
    } 
}


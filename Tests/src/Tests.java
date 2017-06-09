import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

/**
 * Created by user on 09.06.2017.
 */
public class Tests implements Comparable<Tests> {
    int id;
    String first_name;
    String lst_name;
    Tests(int id,String first_name, String lst_name){
        this.id=id;
        this.first_name=first_name;
        this.lst_name=lst_name;
    }


  public static int returnId(){
        int a=1;
        if (a==a){a=(int)(Math.random()*3458);}
        return a;
    }
    String getFirst_name(){return first_name;}

    @Override
    public int compareTo(@NotNull Tests o) {

        return first_name.compareTo(o.getFirst_name());
    }

}

class TestDrive{
    public static void main(String[] args) {

        TreeSet<Tests> testses = new TreeSet<Tests>();
        testses.add(new Tests(Tests.returnId(),"Vesia","An"));
        testses.add(new Tests(Tests.returnId(),"Gebriel","Po"));
        testses.add(new Tests(Tests.returnId(),"Vamisa","HU"));

        for (Tests nema:testses){
            System.out.println(nema.id+" "+nema.first_name+" "+nema.lst_name);
        }
    }


}


package zxd.com.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by zxd on 2014/12/12.
 */
public class CrimeLab {
    private ArrayList<Crime> mCrimes;
    private static CrimeLab sCrimeLab;



    private Context mAppContext;

    private CrimeLab(Context appContext){
        mAppContext = appContext;
        mCrimes = new ArrayList<>();
    }
    public void addCrime(Crime c){
        mCrimes.add(c);
    }
    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }
    public  Crime getCrime(UUID id){
        for(Crime c: mCrimes){
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }

    public static CrimeLab get(Context c){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }
}

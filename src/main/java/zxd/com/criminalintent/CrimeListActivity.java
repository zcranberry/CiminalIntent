package zxd.com.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by zxd on 2014/12/13.
 */
public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}

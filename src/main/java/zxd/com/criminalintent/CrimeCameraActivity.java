package zxd.com.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by zxd on 2014/12/17.
 */
public class CrimeCameraActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new CrimeCameraFragment();
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
    }
}

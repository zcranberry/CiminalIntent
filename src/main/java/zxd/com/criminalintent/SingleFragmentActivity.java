package zxd.com.criminalintent;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by zxd on 2014/12/13.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {
    protected abstract Fragment createFragment();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);//如果继承Fragment,这里写法不同
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);//在activity_fragment里面,这里执行完之后fragment就是null

        if (fragment == null){//这段想一想，何时等于null
            fragment = createFragment();//注意书中150页写法
            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();

        }
    }
}

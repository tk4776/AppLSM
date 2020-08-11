package Controlador;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
    int numoftabs;


    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm);
        this.numoftabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Bienvenida();
            case 1:
                return new Piso1();
            case 2:
                return new Piso2();
            case 3:
                return new Piso3();
            case 4:
                return new Piso4();
            case 5:
                return new Extras();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}

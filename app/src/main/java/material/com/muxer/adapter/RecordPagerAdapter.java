package material.com.muxer.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by air on 16/7/6.
 */
public class RecordPagerAdapter extends FragmentPagerAdapter {
    private List<String> titles;
    private List<Fragment> fragmentList;

    public RecordPagerAdapter(FragmentManager fm){
        super(fm);
    }

    public RecordPagerAdapter(FragmentManager fm, List<Fragment> lf,List<String> titles){
        super(fm);
        this.titles = titles;
        fragmentList = lf;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}

package com.example.comp2000setexercises;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int pos) {
        switch (pos) {
            case 0: return new SettingsFragment();
            case 1: return new SettingsFragment();
            case 2: return new SettingsFragment();
            default: return new SettingsFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}

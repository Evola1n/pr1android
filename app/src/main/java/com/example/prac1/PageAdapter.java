package com.example.prac1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PageAdapter extends FragmentStateAdapter {
    public PageAdapter(@NonNull FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return PageFragment.newInstance("Сторінка 1: Привіт, Android!", 0xFFE3F2FD);
            case 1:
                return PageFragment.newInstance("Сторінка 2: Тут ваше завдання", 0xFFE8F5E9);
            default:
                return PageFragment.newInstance("Сторінка 3: Свайп ліворуч/праворуч", 0xFFFFF3E0);
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

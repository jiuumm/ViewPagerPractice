package com.example.viewpagerpractice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice.fragments.GreetingsFragment
import com.example.viewpagerpractice.fragments.MyInfoFragment
import com.example.viewpagerpractice.fragments.NameFragment

class MainViewPagerAdapter(fm:FragmentManager) :FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return 3 //몇장짜리 만들건지를 돌려주기
    }

    override fun getItem(position: Int): Fragment {

        if(position==0){
            return NameFragment()
        }
        else if(position==1){
            return MyInfoFragment()
        }
        else{
            return GreetingsFragment()
        }

    }

}
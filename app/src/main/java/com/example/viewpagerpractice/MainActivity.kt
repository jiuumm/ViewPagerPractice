package com.example.viewpagerpractice
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewpagerpractice.adapters.MainViewPagerAdapter
import com.example.viewpagerpractice.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var mViewPagerAdapter : MainViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        binding.mainViewPager.adapter = mViewPagerAdapter

        //페이지가 많아지면 간단하게 부드럽도록 지원하는 기능.
        binding.mainViewPager.offscreenPageLimit=5

        //탭레이아웃을 -> 뷰페이저와 연결.
        binding.myTabLayout.setupWithViewPager(binding.mainViewPager)
    }
}
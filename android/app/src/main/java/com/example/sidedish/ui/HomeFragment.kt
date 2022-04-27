package com.example.sidedish.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.sidedish.databinding.FragmentHomeBinding
import com.example.sidedish.ui.animation.ZoomOutPageTransformer

private const val NUM_PAGES = 3

class HomeFragment : Fragment() {

    private val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    private val viewPager: ViewPager2 by lazy {
        binding.pager
    }

    private val viewModel: MenuListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val screenList = listOf(MainMenuFragment(), SoupMenuFragment(), SideMenuFragment())

        viewPager.adapter =
            activity?.let {
                ScreenSlidePagerAdapter(
                    it.supportFragmentManager,
                    lifecycle,
                    screenList
                )
            }

        viewPager.setPageTransformer(ZoomOutPageTransformer())

    }

    private inner class ScreenSlidePagerAdapter(
        fm: FragmentManager,
        lifecycle: Lifecycle,
        private val list: List<Fragment>
    ) : FragmentStateAdapter(fm, lifecycle) {
        override fun getItemCount(): Int = NUM_PAGES

        override fun createFragment(position: Int): Fragment {
            return list[position]
        }
    }
}
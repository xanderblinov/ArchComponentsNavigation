package com.github.xanderblinov.nav

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment_home_button_dashboard.setOnClickListener {
            activity?.let {
                findNavController(it, R.id.nav_host_fragment).navigate(R.id.action_homeFragment_to_dashboardFragment)
            }
        }

        fragment_home_button_notification.setOnClickListener {
            activity?.let {
                findNavController(it, R.id.nav_host_fragment).navigate(R.id.action_homeFragment_to_notificationFragment)
            }
        }
    }
}

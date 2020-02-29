package com.drborus.app.general


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.drborus.app.R
import kotlinx.android.synthetic.main.fragment_general.*

class GeneralFragment : Fragment(), View.OnClickListener {

    companion object {
        fun newInstance(): GeneralFragment =
            GeneralFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_general, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewpager.adapter = GeneralViewPagerAdapter()
    }

    override fun onClick(v: View?) {

    }


}

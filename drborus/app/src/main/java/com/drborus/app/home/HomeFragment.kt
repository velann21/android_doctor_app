package com.drborus.app.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.drborus.app.R
import com.drborus.app.general.GeneralFragment
import com.drborus.app.procedure.OffersFragment
import com.drborus.app.procedure.PaymentFragment
import com.drborus.app.procedure.ProcedureFragment
import com.drborus.app.procedure.ReportFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    companion object {
        fun newInstance(): HomeFragment =
            HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ivGeneral.setOnClickListener { activity!!.supportFragmentManager.beginTransaction().addToBackStack(null).
            add(R.id.flContainer, GeneralFragment.newInstance()).commit()}
        ivProcedure.setOnClickListener { activity!!.supportFragmentManager.beginTransaction().addToBackStack(null).
            add(R.id.flContainer, ProcedureFragment.newInstance()).commit()}
        ivReport.setOnClickListener { activity!!.supportFragmentManager.beginTransaction().addToBackStack(null).
            add(R.id.flContainer, ReportFragment.newInstance()).commit()}
        ivPayment.setOnClickListener { activity!!.supportFragmentManager.beginTransaction().addToBackStack(null).
            add(R.id.flContainer, PaymentFragment.newInstance()).commit()}
        ivOffer.setOnClickListener { activity!!.supportFragmentManager.beginTransaction().addToBackStack(null).
            add(R.id.flContainer, OffersFragment.newInstance()).commit()}
    }
}

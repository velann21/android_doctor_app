package com.drborus.app.general

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.drborus.app.R

class GeneralViewPagerAdapter : RecyclerView.Adapter<GeneralViewPagerAdapter.GeneralViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
            0 -> {
                GeneralViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_add_emp, parent, false))
            }
            1 -> {
                GeneralViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_edit_emp, parent, false))
            }
            else -> {
                GeneralViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_update_profile, parent, false))
            }
        }


    override fun getItemCount() = 3

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: GeneralViewHolder, position: Int) {
    }

    class GeneralViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
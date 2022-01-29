package com.jaylabs.ispacebootcampapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaylabs.ispacebootcampapp.R
import com.jaylabs.ispacebootcampapp.data.LearnerData

class LearnersAdapter(
    private var context:Context,
    private var learnersList: ArrayList<LearnerData>

    ) : RecyclerView.Adapter<LearnersAdapter.LearnersViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnersViewHolder {
        val rootView = LayoutInflater.from(context).inflate(R.layout.learner_item_row,parent,false)
        return LearnersViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: LearnersViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return learnersList.size
    }


    class LearnersViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

    }
}

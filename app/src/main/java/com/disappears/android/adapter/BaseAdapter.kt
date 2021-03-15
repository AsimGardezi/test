package com.disappears.android.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import timber.log.Timber

/**
 * Created by ihor_kucherenko on 11/29/17.
 * https://github.com/KucherenkoIhor
 */
abstract class BaseAdapter<D, VH : RecyclerView.ViewHolder> : RecyclerView.Adapter<VH>() {
    open var dataSource: List<D> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    var recyclerView: RecyclerView? = null
        private set(value) {
            field = value
        }

    private val onItemClickListener: View.OnClickListener = View.OnClickListener {
        recyclerView?.getChildAdapterPosition(it)?.let {
            onItemClick(dataSource[it])
        } ?: Timber.e("on item click error")
    }

    open fun onItemClick(data: D) {}

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        this.recyclerView = recyclerView
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.itemView.setOnClickListener(onItemClickListener)
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        this.recyclerView = null
        super.onDetachedFromRecyclerView(recyclerView)
    }

    override fun getItemCount() = dataSource.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(getItemViewId(), parent, false)
        return instantiateViewHolder(view)
    }

    abstract fun getItemViewId(): Int

    abstract fun instantiateViewHolder(view: View?): VH

    fun getItem(position: Int) = dataSource[position]
}
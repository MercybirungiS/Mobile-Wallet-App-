package com.example.mobilewalletapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionsAdaptor (var transactions:List<String>):RecyclerView.Adapter<TransactionsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionsViewHolder {
    var itemview=LayoutInflater.from(parent.context).inflate(R.layout.transactions_resource_file,parent,false)
    return TransactionsViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: TransactionsViewHolder, position: Int) {
    var currentTransaction=transactions.get(position)
        holder.tvDescription.text=currentTransaction.description
        holder.tvDate.text=currentTransaction.date
        holder.tvReference=currentTransaction.reference
        holder.transactionType=currentTransaction.transaction
        holder.amount=currentTransaction.amount

    }

    override fun getItemCount(): Int {
        return transactions.size
    }
}

class TransactionsViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
var tvDescription=itemview.findViewById<TextView>(R.id.tvDescription)
    var tvReference=itemview.findViewById<TextView>(R.id.tvReference)
    var tvDate=itemview.findViewById<TextView>(R.id.tvDate)
    var amount=itemview.findViewById<TextView>(R.id.tvAmount)
    var transactionType=itemview.findViewById<TextView>(R.id.tvTransactionType)
}
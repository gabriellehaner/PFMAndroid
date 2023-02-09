package com.example.pfmandroid.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pfmandroid.R
import kotlinx.android.synthetic.main.card_details.view.*

class ProfileAdapter(private val onClicked: (Profile) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<Profile> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProfileViewHolder (
            LayoutInflater.from(parent.context).inflate(R.layout.card_details, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is ProfileViewHolder -> {
                holder.bind(items[position], onClicked)
            }
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet (list: List<Profile>){
        this.items = list
    }

    class ProfileViewHolder constructor(
        itemView: View

    ) : RecyclerView.ViewHolder(itemView) {
        private val dataTransacao = itemView.campoData
        private val transacao = itemView.campoTrans
        private val nomeTitular = itemView.campoNome
        private val origennBanco = itemView.campoBanco
        private val valorTransacao = itemView.campoValorTrans
        private val tipoTransacao = itemView.campoOrigem
        private val profileImage = itemView.imageBank

        fun bind (profile: Profile, onClicked: (Profile) -> Unit) {
            dataTransacao.text = profile.dataTrans
            transacao.text = profile.trans
            nomeTitular.text = profile.nome
            origennBanco.text = profile.bancoOrigem
            valorTransacao.text = profile.valorTrans
            tipoTransacao.text = profile.tipoTrans
            profileImage.setImageResource(profile.imagem)

            itemView.setOnClickListener {
                onClicked(profile)
            }
        }
    }
}